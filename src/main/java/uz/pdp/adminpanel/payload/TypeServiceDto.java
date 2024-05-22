package uz.pdp.adminpanel.payload;

import lombok.Value;
import uz.pdp.adminpanel.entity.TypeService;

import java.io.Serializable;

/**
 * DTO for {@link TypeService}
 */
@Value
public class TypeServiceDto implements Serializable {
    String name;
    Double price;
    UserDto user;
}