package com.example.userservice.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Greeting.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.02
 */
@Component
@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Greeting {

    @Value("${greeting.message}")
    private String message;
}
