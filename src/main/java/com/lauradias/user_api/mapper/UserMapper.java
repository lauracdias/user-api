package com.lauradias.user_api.mapper;

import com.lauradias.user_api.dto.UserRequestDTO;
import com.lauradias.user_api.dto.UserResponseDTO;
import com.lauradias.user_api.model.User;

public class UserMapper {

    public static User toEntity (UserRequestDTO dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setAge(dto.getAge());
        return user;
    }

    public static UserResponseDTO toDto (User user) {
        return new UserResponseDTO(
          user.getId(),
          user.getName(),
          user.getEmail(),
          user.getAge(),
          user.getCreatedAt()
        );
    }
}
