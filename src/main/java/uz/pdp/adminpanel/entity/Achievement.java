package uz.pdp.adminpanel.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.adminpanel.entity.baseEntity.BaseEntity;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Achievement extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @NotNull(message = "Achievementdagi nameAchievement null bo'lishi mumkin emas")
    @Column(nullable = false)
    private String nameAchievement;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
