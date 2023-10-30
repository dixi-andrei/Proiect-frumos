package com.example.bkd;

import com.example.bkd.User.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class BkdApplication {

    public static void main(String[] args) {
        SpringApplication.run(BkdApplication.class, args);
    }

    @GetMapping("/hello")
    public List<User> hello() {
        return List.of(
                new User(
                        1,
                        "Marcel",
                        29
                )
        );
    }
}
