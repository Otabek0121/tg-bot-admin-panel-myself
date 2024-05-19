package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Complaint;
import uz.pdp.adminpanel.payload.ComplaintDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ComplaintMapper {
    Complaint toEntity(ComplaintDto complaintDto);

    ComplaintDto toDto(Complaint complaint);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Complaint partialUpdate(ComplaintDto complaintDto, @MappingTarget Complaint complaint);
}