package mingu.spring.snapadmin.repository;

import mingu.spring.snapadmin.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Modifying
    @Transactional
    @Query(value = "UPDATE product SET description = ?1, category = ?2, price = ?3 WHERE id = ?4", nativeQuery = true)
    void updateById(String description, String category, BigDecimal price, long id);
}
