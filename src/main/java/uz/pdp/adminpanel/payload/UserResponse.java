package uz.pdp.adminpanel.payload;

import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link uz.pdp.adminpanel.entity.User}
 */
@Value
public class UserResponse implements Serializable {
    String firstname;
    String lastname;
    String patronymic;
    String phoneNumber;
    String telegramUsername;
    byte experience;
    List<String> directions;
    List<String> languages;
}