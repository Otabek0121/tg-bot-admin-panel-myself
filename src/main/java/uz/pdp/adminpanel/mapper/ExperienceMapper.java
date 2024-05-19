package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Experience;
import uz.pdp.adminpanel.payload.ExperienceDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ExperienceMapper {
    Experience toEntity(ExperienceDto experienceDto);

    ExperienceDto toDto(Experience experience);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Experience partialUpdate(ExperienceDto experienceDto, @MappingTarget Experience experience);
}