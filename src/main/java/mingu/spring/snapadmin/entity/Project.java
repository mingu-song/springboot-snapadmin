package mingu.spring.snapadmin.entity;

import jakarta.persistence.*;
import lombok.*;
import tech.ailef.snapadmin.external.annotations.Filterable;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "porject")
public class Project extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;

    @Filterable
    @Column(nullable = false)
    private LocalDateTime startDate;

    @Filterable
    @Column(nullable = false)
    private LocalDateTime endDate;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @ManyToOne(optional=false)
    @JoinColumn(name="manager_id", nullable=false)
    private User manager;
}
