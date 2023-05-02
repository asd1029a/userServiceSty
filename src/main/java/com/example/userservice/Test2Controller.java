package com.example.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test2Controller.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.05.02
 */
@RestController
@RequestMapping("/second-service")
public class Test2Controller {

    @GetMapping("/check")
    public String test() {
        return "check check";
    }
}
