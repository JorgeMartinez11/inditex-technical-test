package com.inditex.prices.price.infrastructure.api;

import com.inditex.prices.price.application.FindPriceUC;
import com.inditex.prices.price.infrastructure.api.res.PriceResponse;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/prices")
public class PriceController {

  private final FindPriceUC findPrices;

  @Autowired
  public PriceController(FindPriceUC findPrices) {
    this.findPrices = findPrices;
  }

  @GetMapping("/priority")
  public PriceResponse getPrices(
      @RequestParam("applicationDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
          LocalDateTime applicationDate,
      @RequestParam("productId") Integer productId,
      @RequestParam("brandId") Integer brandId) {
    return findPrices.getPriorityPrice(applicationDate, productId, brandId);
  }
}
