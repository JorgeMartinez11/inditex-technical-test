package com.inditex.prices.price.domain.port;

import com.inditex.prices.price.domain.model.Price;
import java.time.LocalDateTime;
import java.util.List;

public interface PricePort {

  List<Price> find(LocalDateTime applicationDate, Integer productId, Integer brandId);
}
