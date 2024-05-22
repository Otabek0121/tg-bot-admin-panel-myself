package uz.pdp.adminpanel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.adminpanel.entity.baseEntity.BaseEntity;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Experience extends BaseEntity{


    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private LocalDate startDate;

    private LocalDate endDate;

    private String address;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

}
