package springbootuser.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import springbootuser.dto.UserDto;
import springbootuser.entity.User;

@Mapper
public interface AutoUserMapper {

    AutoUserMapper MAPPER = Mappers.getMapper(AutoUserMapper.class);

    UserDto mapToUserDto(User user);

    User mapToUser(UserDto userDto);
}
