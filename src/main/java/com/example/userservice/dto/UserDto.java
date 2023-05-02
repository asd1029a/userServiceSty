package com.example.userservice.dto;

import com.example.userservice.vo.ResponseOrder;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * UserDto.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.02
 */
@Data
public class UserDto {

    private String email;
    private String name;
    private String pwd;
    private String userId;
    private Date createdAt;

    private String encryptedPwd;
    private List<ResponseOrder> orders;
}
