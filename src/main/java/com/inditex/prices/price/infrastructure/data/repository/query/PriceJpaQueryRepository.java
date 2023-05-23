package com.inditex.prices.price.infrastructure.data.repository.query;

import com.inditex.prices.price.infrastructure.data.table.PriceEntity;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceJpaQueryRepository extends JpaRepository<PriceEntity, Long> {
  @Query(
      "SELECT p FROM PriceEntity p "
          + "WHERE :applicationDate BETWEEN p.startDate AND p.endDate "
          + "AND p.productId = :productId "
          + "AND p.brandId = :brandId "
          + "ORDER BY p.priority DESC")
  List<PriceEntity> findPricesByApplicationDateAndProductIdAndBrandId(
      @Param("applicationDate") LocalDateTime applicationDate,
      @Param("productId") Integer productId,
      @Param("brandId") Integer brandId);
}
