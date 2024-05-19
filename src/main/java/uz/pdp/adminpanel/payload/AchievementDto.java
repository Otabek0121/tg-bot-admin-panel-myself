package uz.pdp.adminpanel.payload;

import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link uz.pdp.adminpanel.entity.Achievement}
 */
@Value
public class AchievementDto implements Serializable {
    String nameAchievement;
    UserResponse user;
}