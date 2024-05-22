package uz.pdp.adminpanel.mapper;

import org.mapstruct.*;
import uz.pdp.adminpanel.entity.User;
import uz.pdp.adminpanel.payload.UserDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    User toUser(UserDto userResponse);

    UserDto toUserDTO(User user);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    User userUpdate(UserDto userResponse, @MappingTarget User user);

    List<UserDto> toUserDTOs(List<User> userList);

    List<User> toUsers(List<UserDto> userDtoList);
}