package com.inditex.prices.price.infrastructure.adapters;

import com.inditex.prices.price.domain.model.Price;
import com.inditex.prices.price.domain.port.PricePort;
import com.inditex.prices.price.infrastructure.data.repository.query.PriceJpaQueryRepository;
import com.inditex.prices.price.infrastructure.mapper.PriceMapper;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class PriceAdapter implements PricePort {

  private final PriceJpaQueryRepository priceRepository;

  public PriceAdapter(PriceJpaQueryRepository priceRepository) {
    this.priceRepository = priceRepository;
  }

  @Override
  public List<Price> find(LocalDateTime applicationDate, Integer productId, Integer brandId) {
    return priceRepository
        .findPricesByApplicationDateAndProductIdAndBrandId(applicationDate, productId, brandId)
        .stream()
        .map(PriceMapper::toDomain)
        .toList();
  }
}
