package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Education;
import uz.pdp.adminpanel.payload.EducationDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EducationMapper {
    Education toEntity(EducationDto educationDto);

    EducationDto toDto(Education education);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Education partialUpdate(EducationDto educationDto, @MappingTarget Education education);
}