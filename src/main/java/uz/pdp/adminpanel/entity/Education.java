package uz.pdp.adminpanel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.adminpanel.entity.baseEntity.BaseEntity;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Education extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "Educationdagi startDate null bo'lishi mumkin emas")
    @Column(nullable = false)
    private  LocalDate startDate;

    @NotNull(message = "Educationdagi endDate null bo'lishi mumkin emas")
    @Column(nullable = false)
    private LocalDate endDate;

    @NotNull(message = "Educationdagi descriptionOfEducation null bo'lishi mumkin emas")
    private String descriptionOfEducation;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
