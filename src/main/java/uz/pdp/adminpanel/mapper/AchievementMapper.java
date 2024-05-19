package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Achievement;
import uz.pdp.adminpanel.payload.AchievementDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AchievementMapper {
    Achievement toEntity(AchievementDto achievementDto);

    AchievementDto toDto(Achievement achievement);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Achievement partialUpdate(AchievementDto achievementDto, @MappingTarget Achievement achievement);
}