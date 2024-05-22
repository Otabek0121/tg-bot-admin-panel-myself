package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Achievement;
import uz.pdp.adminpanel.entity.Experience;
import uz.pdp.adminpanel.payload.AchievementDto;
import uz.pdp.adminpanel.payload.ExperienceDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ExperienceMapper {
    Experience toExperience(ExperienceDto experienceDto);

    ExperienceDto toExperienceDTO(Experience experience);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Experience experienceUpdate(ExperienceDto experienceDto, @MappingTarget Experience experience);

    List<ExperienceDto> toExperienceDTOs(List<Experience> experienceList);

    List<Experience> toExperiences(List<ExperienceDto> experienceDtoList);
}