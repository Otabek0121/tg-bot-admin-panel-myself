package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Achievement;
import uz.pdp.adminpanel.payload.AchievementDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AchievementMapper {
    Achievement toAchievement(AchievementDto achievementDto);

    AchievementDto toAchievementDTO(Achievement achievement);

    List<AchievementDto> toAchievementDTOs(List<Achievement> achievementList);

    List<Achievement> toAchievements(List<AchievementDto> achievementDtoList);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Achievement achievementUpdate(AchievementDto achievementDto, @MappingTarget Achievement achievement);


}