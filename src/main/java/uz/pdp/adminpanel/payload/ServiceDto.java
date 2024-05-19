package uz.pdp.adminpanel.payload;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link uz.pdp.adminpanel.entity.Service}
 */
@Value
public class ServiceDto implements Serializable {
    String name;
    Double price;
    UserResponse user;
}