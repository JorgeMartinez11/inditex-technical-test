package com.inditex.prices.price.infrastructure.mapper;

import com.inditex.prices.price.domain.model.Price;
import com.inditex.prices.price.domain.model.PriceAmount;
import com.inditex.prices.price.infrastructure.api.res.PriceAmountRes;
import com.inditex.prices.price.infrastructure.api.res.PriceResponse;
import com.inditex.prices.price.infrastructure.data.table.PriceEntity;

public class PriceMapper {

  public static Price toDomain(PriceEntity priceEntity) {
    Price price = new Price();
    price.setId(priceEntity.getId());
    price.setBrandId(priceEntity.getBrandId());
    price.setStartDate(priceEntity.getStartDate());
    price.setEndDate(priceEntity.getEndDate());
    price.setPriceList(priceEntity.getPriceList());
    price.setProductId(priceEntity.getProductId());
    price.setPriority(priceEntity.getPriority());
    price.setPriceAmount(new PriceAmount(priceEntity.getPrice(), priceEntity.getCurrency()));
    return price;
  }

  public static PriceResponse toRest(Price price) {
    PriceResponse response = new PriceResponse();
    response.setProductId(price.getProductId());
    response.setBrandId(price.getBrandId());
    response.setPriceList(price.getPriceList());
    response.setStartDate(price.getStartDate());
    response.setEndDate(price.getEndDate());
    response.setPriceAmount(
        new PriceAmountRes(
            price.getPriceAmount().getAmount(), price.getPriceAmount().getCurrency()));
    return response;
  }
}
