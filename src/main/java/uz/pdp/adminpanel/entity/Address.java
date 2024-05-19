package uz.pdp.adminpanel.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String address;

    private Double price;

    private String workingTime;

    @ElementCollection
    @CollectionTable(name = "user_working_days", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "working_day")
    private List<String> workingDays;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;
}
