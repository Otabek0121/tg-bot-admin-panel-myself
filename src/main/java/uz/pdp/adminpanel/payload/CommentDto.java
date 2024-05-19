package uz.pdp.adminpanel.payload;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link uz.pdp.adminpanel.entity.Comment}
 */
@Value
public class CommentDto implements Serializable {
    String comment;
    byte rating;
    UserResponse user;
}