package com.inditex.prices.price.infrastructure.api.res;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PriceResponse {
  private Long productId;
  private Long brandId;
  private Long priceList;
  private LocalDateTime startDate;
  private LocalDateTime endDate;
  private PriceAmountRes priceAmount;

}
