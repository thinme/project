package com.example.portfolio.dto;

import com.example.portfolio.entity.LoginEntity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class LoginDto {

    private Integer id;

    private String name;


    private String password;

    public LoginEntity toEntity(){
        return new LoginEntity(id,password,name);
    }

}
