package com.example.userservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * TestController.java
 * Class 설명을 작성하세요.
 *
 * @author kjm
 * @since 2023.04.28
 */
@RestController
@RequestMapping("/first-service")
@Slf4j
public class TestController {

    Environment env;

    @Autowired
    public TestController(Environment env) {
        this.env = env;
    }

    @GetMapping("/check")
    public String test(HttpServletRequest request) {
        log.info("Server post = {}", request.getServerPort());
        return String.format("check check post %s",env.getProperty("local.server.port"));
    }
}
