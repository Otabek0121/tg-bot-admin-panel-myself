package uz.pdp.adminpanel.payload;

import lombok.Value;

import java.io.Serializable;
import java.util.List;

/**
 * DTO for {@link uz.pdp.adminpanel.entity.Address}
 */
@Value
public class AddressDto implements Serializable {
    String address;
    Double price;
    String workingTime;
    List<String> workingDays;
    UserDto user;
}