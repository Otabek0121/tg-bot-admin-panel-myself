package uz.pdp.adminpanel.payload;

import lombok.Value;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * DTO for {@link uz.pdp.adminpanel.entity.Education}
 */
@Value
public class EducationDto implements Serializable {
    LocalDate endDate;

    String descriptionOfEducation;

    UserDto user;
}