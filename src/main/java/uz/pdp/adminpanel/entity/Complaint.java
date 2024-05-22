package uz.pdp.adminpanel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import uz.pdp.adminpanel.entity.baseEntity.BaseEntity;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Complaint extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String name;

    private String phoneNumber;

    private String description;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
