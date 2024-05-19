package uz.pdp.adminpanel.payload;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link uz.pdp.adminpanel.entity.Complaint}
 */
@Value
public class ComplaintDto implements Serializable {
    String name;
    String phoneNumber;
    String description;
    UserResponse user;
}