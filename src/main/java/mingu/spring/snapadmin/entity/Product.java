package mingu.spring.snapadmin.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import mingu.spring.snapadmin.enums.ProductCategory;
import tech.ailef.snapadmin.external.annotations.DisplayFormat;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "product")
public class Product extends BaseEntity {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    @NotNull(message = "Category must be specified.")
    private ProductCategory category;

    @Column(name = "description")
    private String description;

    @DisplayFormat(format = "$%.2f")
    @Min(0)
    @Column(name = "price", columnDefinition = "decimal (10,2)")
    private BigDecimal price;
}
