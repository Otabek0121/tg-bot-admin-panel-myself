package uz.pdp.adminpanel.entity;

import jakarta.persistence.*;
import lombok.*;
import uz.pdp.adminpanel.enums.RoleUser;
import uz.pdp.adminpanel.enums.UserState;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String firstname;

    private String lastname;

    private String patronymic;

    private long chatId;

    private String phoneNumber;

    private String telegramUsername;

    private byte experience;

    @Enumerated(EnumType.STRING)
    private RoleUser roleUser;

    @Enumerated(EnumType.STRING)
    private UserState userState;

    @ElementCollection
    @CollectionTable(name = "user_directions", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "direction")
    private List<String> directions;

    @ElementCollection
    @CollectionTable(name = "user_languages", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "language")
    private List<String> languages;

    private String pictureUrl;
}
