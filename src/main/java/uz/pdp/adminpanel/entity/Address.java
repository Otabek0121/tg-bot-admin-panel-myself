package uz.pdp.adminpanel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.adminpanel.entity.baseEntity.BaseEntity;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "Addressdagi address null bo'lishi mumkin emas")
    @Column(nullable = false)
    private String address;


    private String workingTime;

    @ElementCollection
    @CollectionTable(name = "user_working_days", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "working_day")
    private List<String> workingDays;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
