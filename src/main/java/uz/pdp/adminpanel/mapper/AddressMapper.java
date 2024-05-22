package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.Achievement;
import uz.pdp.adminpanel.entity.Address;
import uz.pdp.adminpanel.payload.AchievementDto;
import uz.pdp.adminpanel.payload.AddressDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface AddressMapper {
    Address toAddress(AddressDto addressDto);

    AddressDto toAddressDTO(Address address);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    Address addressUpdate(AddressDto addressDto, @MappingTarget Address address);

    List<AddressDto> toAddressDTOs(List<Address> addressList);

    List<Address> toAddresses(List<AddressDto> addressDtoList);
}