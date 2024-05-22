package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.TypeService;
import uz.pdp.adminpanel.payload.TypeServiceDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface TypeServiceMapper {
    TypeService toTypeService(TypeServiceDto serviceDto);

    TypeServiceDto toTypeServiceDTO(TypeService service);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    TypeService typeServiceUpdate(TypeServiceDto typeServiceDto, @MappingTarget TypeService typeService);

    List<TypeServiceDto> toTypeServiceDTOs(List<TypeService> typeServiceList);

    List<TypeService> toTypeServices(List<TypeServiceDto> typeServiceDtoList);
}