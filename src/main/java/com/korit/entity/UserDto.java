package com.korit.entity;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class UserDto {
    private String username;
    private String password;
    private String email;

    public User toUser() {
        return User.builder()
                .id(0l)
                .username(username)
                .password(password)
                .email(email)
                .build();
    }
}
