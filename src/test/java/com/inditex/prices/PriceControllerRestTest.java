package com.inditex.prices;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.inditex.prices.price.infrastructure.api.res.PriceAmountRes;
import com.inditex.prices.price.infrastructure.api.res.PriceResponse;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class PriceControllerRestTest {

  private static final String URL_BASE_GET_PRICES = "http://localhost:8080/prices/priority";
  @Autowired private TestRestTemplate testRestTemplate;

  @Test
  void test1() {
    PriceResponse expectedResponse = new PriceResponse();
    expectedResponse.setProductId(35455L);
    expectedResponse.setBrandId(1L);
    expectedResponse.setPriceList(1L);
    expectedResponse.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0));
    expectedResponse.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
    expectedResponse.setPriceAmount(new PriceAmountRes(new BigDecimal("35.50"), "EUR"));

    LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 14, 10, 0);

    var uri =
        UriComponentsBuilder.fromHttpUrl(URL_BASE_GET_PRICES)
            .queryParam("applicationDate", applicationDate.toString())
            .queryParam("productId", "35455")
            .queryParam("brandId", "1")
            .toUriString();

    var response =
        testRestTemplate.getForObject(uri, PriceResponse.class);

    assertEquals(expectedResponse.getProductId(), response.getProductId());
    assertEquals(expectedResponse.getBrandId(), response.getBrandId());
    assertEquals(expectedResponse.getPriceList(), response.getPriceList());
    assertEquals(expectedResponse.getStartDate(), response.getStartDate());
    assertEquals(expectedResponse.getEndDate(), response.getEndDate());
    assertEquals(expectedResponse.getPriceAmount().getAmount(), response.getPriceAmount().getAmount());
    assertEquals(expectedResponse.getPriceAmount().getCurrency(), response.getPriceAmount().getCurrency());

  }

  @Test
  void test2() {
    PriceResponse expectedResponse = new PriceResponse();
    expectedResponse.setProductId(35455L);
    expectedResponse.setBrandId(1L);
    expectedResponse.setPriceList(2L);
    expectedResponse.setStartDate(LocalDateTime.of(2020, 6, 14, 15, 0));
    expectedResponse.setEndDate(LocalDateTime.of(2020, 6, 14, 18, 30));
    expectedResponse.setPriceAmount(new PriceAmountRes(new BigDecimal("25.45"), "EUR"));

    LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 14, 16, 0);

    var uri =
        UriComponentsBuilder.fromHttpUrl(URL_BASE_GET_PRICES)
            .queryParam("applicationDate", applicationDate.toString())
            .queryParam("productId", "35455")
            .queryParam("brandId", "1")
            .toUriString();

    var response =
        testRestTemplate.getForObject(uri, PriceResponse.class);

    assertEquals(expectedResponse.getProductId(), response.getProductId());
    assertEquals(expectedResponse.getBrandId(), response.getBrandId());
    assertEquals(expectedResponse.getPriceList(), response.getPriceList());
    assertEquals(expectedResponse.getStartDate(), response.getStartDate());
    assertEquals(expectedResponse.getEndDate(), response.getEndDate());
    assertEquals(expectedResponse.getPriceAmount().getAmount(), response.getPriceAmount().getAmount());
    assertEquals(expectedResponse.getPriceAmount().getCurrency(), response.getPriceAmount().getCurrency());

  }

  @Test
  void test3() {
    PriceResponse expectedResponse = new PriceResponse();
    expectedResponse.setProductId(35455L);
    expectedResponse.setBrandId(1L);
    expectedResponse.setPriceList(1L);
    expectedResponse.setStartDate(LocalDateTime.of(2020, 6, 14, 0, 0));
    expectedResponse.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
    expectedResponse.setPriceAmount(new PriceAmountRes(new BigDecimal("35.50"), "EUR"));

    LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 14, 21, 0);

    var uri =
        UriComponentsBuilder.fromHttpUrl(URL_BASE_GET_PRICES)
            .queryParam("applicationDate", applicationDate.toString())
            .queryParam("productId", "35455")
            .queryParam("brandId", "1")
            .toUriString();

    var response =
        testRestTemplate.getForObject(uri, PriceResponse.class);

    assertEquals(expectedResponse.getProductId(), response.getProductId());
    assertEquals(expectedResponse.getBrandId(), response.getBrandId());
    assertEquals(expectedResponse.getPriceList(), response.getPriceList());
    assertEquals(expectedResponse.getStartDate(), response.getStartDate());
    assertEquals(expectedResponse.getEndDate(), response.getEndDate());
    assertEquals(expectedResponse.getPriceAmount().getAmount(), response.getPriceAmount().getAmount());
    assertEquals(expectedResponse.getPriceAmount().getCurrency(), response.getPriceAmount().getCurrency());

  }

  @Test
  void test4() {
    PriceResponse expectedResponse = new PriceResponse();
    expectedResponse.setProductId(35455L);
    expectedResponse.setBrandId(1L);
    expectedResponse.setPriceList(3L);
    expectedResponse.setStartDate(LocalDateTime.of(2020, 6, 15, 0, 0));
    expectedResponse.setEndDate(LocalDateTime.of(2020, 6, 15, 11, 0));
    expectedResponse.setPriceAmount(new PriceAmountRes(new BigDecimal("30.50"), "EUR"));

    LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 15, 10, 0);

    var uri =
        UriComponentsBuilder.fromHttpUrl(URL_BASE_GET_PRICES)
            .queryParam("applicationDate", applicationDate.toString())
            .queryParam("productId", "35455")
            .queryParam("brandId", "1")
            .toUriString();

    var response =
        testRestTemplate.getForObject(uri, PriceResponse.class);

    assertEquals(expectedResponse.getProductId(), response.getProductId());
    assertEquals(expectedResponse.getBrandId(), response.getBrandId());
    assertEquals(expectedResponse.getPriceList(), response.getPriceList());
    assertEquals(expectedResponse.getStartDate(), response.getStartDate());
    assertEquals(expectedResponse.getEndDate(), response.getEndDate());
    assertEquals(expectedResponse.getPriceAmount().getAmount(), response.getPriceAmount().getAmount());
    assertEquals(expectedResponse.getPriceAmount().getCurrency(), response.getPriceAmount().getCurrency());

  }

  @Test
  void test5() {
    PriceResponse expectedResponse = new PriceResponse();
    expectedResponse.setProductId(35455L);
    expectedResponse.setBrandId(1L);
    expectedResponse.setPriceList(4L);
    expectedResponse.setStartDate(LocalDateTime.of(2020, 6, 15, 16, 0));
    expectedResponse.setEndDate(LocalDateTime.of(2020, 12, 31, 23, 59, 59));
    expectedResponse.setPriceAmount(new PriceAmountRes(new BigDecimal("38.95"), "EUR"));

    LocalDateTime applicationDate = LocalDateTime.of(2020, 6, 16, 21, 0);

    var uri =
        UriComponentsBuilder.fromHttpUrl(URL_BASE_GET_PRICES)
            .queryParam("applicationDate", applicationDate.toString())
            .queryParam("productId", "35455")
            .queryParam("brandId", "1")
            .toUriString();

    var response =
        testRestTemplate.getForObject(uri, PriceResponse.class);

    assertEquals(expectedResponse.getProductId(), response.getProductId());
    assertEquals(expectedResponse.getBrandId(), response.getBrandId());
    assertEquals(expectedResponse.getPriceList(), response.getPriceList());
    assertEquals(expectedResponse.getStartDate(), response.getStartDate());
    assertEquals(expectedResponse.getEndDate(), response.getEndDate());
    assertEquals(expectedResponse.getPriceAmount().getAmount(), response.getPriceAmount().getAmount());
    assertEquals(expectedResponse.getPriceAmount().getCurrency(), response.getPriceAmount().getCurrency());

  }
}
