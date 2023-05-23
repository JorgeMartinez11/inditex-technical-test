package com.inditex.prices.price.infrastructure.api.res;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PriceAmountRes {
  private BigDecimal amount;
  private String currency;
}
