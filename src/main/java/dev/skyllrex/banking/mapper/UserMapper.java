package dev.skyllrex.banking.mapper;

import dev.skyllrex.banking.dto.SignUpDto;
import dev.skyllrex.banking.dto.UserDto;
import dev.skyllrex.banking.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface UserMapper {
    UserDto toUserDto(User user);

    @Mapping(target = "password", ignore = true)
    User signUpToUser(SignUpDto signUpDto);
}
