package uz.pdp.adminpanel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Achievement {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nameAchievement;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

}
