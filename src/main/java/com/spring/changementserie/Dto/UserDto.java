package com.spring.changementserie.Dto;

import com.spring.changementserie.Entity.User;
import lombok.*;

import static ch.qos.logback.classic.spi.ThrowableProxyVO.build;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UserDto {
    private Integer idDto;
    private String nomDto;
    private String emailDto;
    private String passwordDto;
    public static UserDto fromEntity(User user){
        if(user==null){
            return null;
        }
    return UserDto.builder()
            .idDto(user.getId())
            .nomDto(user.getNom())
            .emailDto(user.getEmail())
            .passwordDto(user.getPassword())
                    .build();
}
public static UserDto toEntity(UserDto userDto){
        if(userDto==null){
            return null;
        }
        User user=new User();
        user.setId(userDto.getIdDto());
        user.setNom(userDto.getNomDto());
        user.setEmail(userDto.getEmailDto());
        user.setPassword(userDto.getPasswordDto());
    return userDto;
    }

}