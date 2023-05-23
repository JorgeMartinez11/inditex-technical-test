package com.inditex.prices.price.application;

import com.inditex.prices.price.domain.exception.PriceNotFoundException;
import com.inditex.prices.price.domain.port.PricePort;
import com.inditex.prices.price.infrastructure.api.res.PriceResponse;
import com.inditex.prices.price.infrastructure.mapper.PriceMapper;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FindPriceUC {

  private final PricePort pricePort;

  @Autowired
  public FindPriceUC(PricePort pricePort) {
    this.pricePort = pricePort;
  }

  public PriceResponse getPriorityPrice(
      LocalDateTime applicationDate, Integer productId, Integer brandId) {
    var prices = pricePort.find(applicationDate, productId, brandId);

    return prices.stream()
        .findFirst()
        .map(PriceMapper::toRest)
        .orElseThrow(PriceNotFoundException::new);
  }
}
