package nico.restticketing.dto;

import nico.restticketing.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.validation.constraints.*;

@NoArgsConstructor
@AllArgsConstructor
@ToString

public class UserDTO {

    private Long id;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private String confirmPassWord;
    private boolean enabled;
    private String phone;
    private RoleDTO role;
    private Gender gender;

}


