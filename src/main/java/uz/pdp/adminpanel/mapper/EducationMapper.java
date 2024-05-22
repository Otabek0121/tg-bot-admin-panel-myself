package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Achievement;
import uz.pdp.adminpanel.entity.Education;
import uz.pdp.adminpanel.payload.AchievementDto;
import uz.pdp.adminpanel.payload.EducationDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface EducationMapper {
    Education toEducation(EducationDto educationDto);

    EducationDto toEducationDTO(Education education);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Education educationUpdate(EducationDto educationDto, @MappingTarget Education education);

    List<EducationDto> toEducationDTOs(List<Education> educationList);

    List<Education> toEducations(List<EducationDto> educationDtoList);
}