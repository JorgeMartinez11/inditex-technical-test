package com.inditex.prices.price.domain.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class PriceAmount {
  private BigDecimal amount;
  private String currency;
}
