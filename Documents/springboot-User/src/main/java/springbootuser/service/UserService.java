package springbootuser.service;

import java.util.List;

import springbootuser.dto.UserDto;
import springbootuser.entity.User;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto getUserById(Long userId);

    List<UserDto> getAllUsers();

    UserDto updateUser(UserDto user);

    void deleteUser(Long userId);
}
