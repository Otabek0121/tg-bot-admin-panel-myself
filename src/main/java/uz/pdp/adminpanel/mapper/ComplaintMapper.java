package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Achievement;
import uz.pdp.adminpanel.entity.Complaint;
import uz.pdp.adminpanel.payload.AchievementDto;
import uz.pdp.adminpanel.payload.ComplaintDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ComplaintMapper {
    Complaint toComplaint(ComplaintDto complaintDto);

    ComplaintDto toComplaintDTO(Complaint complaint);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Complaint complaintUpdate(ComplaintDto complaintDto, @MappingTarget Complaint complaint);
    List<ComplaintDto> toComplaintDTOs(List<Complaint> complaintList);

    List<Complaint> toComplaints(List<ComplaintDto> complaintDtoList);
}