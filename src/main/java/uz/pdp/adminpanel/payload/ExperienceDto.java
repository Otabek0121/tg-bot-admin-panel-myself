package uz.pdp.adminpanel.payload;

import lombok.Value;
import uz.pdp.adminpanel.entity.User;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link uz.pdp.adminpanel.entity.Experience}
 */
@Value
public class ExperienceDto implements Serializable {
    LocalDate startDate;
    LocalDate endDate;
    String address;
    User user;
}