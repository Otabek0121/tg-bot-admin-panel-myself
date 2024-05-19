package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Service;
import uz.pdp.adminpanel.payload.ServiceDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface ServiceMapper {
    Service toEntity(ServiceDto serviceDto);

    ServiceDto toDto(Service service);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Service partialUpdate(ServiceDto serviceDto, @MappingTarget Service service);
}