package com.example.bkd;

import org.springframework.http.MediaType;
import com.example.bkd.User.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class BkdApplication {

    public static void main(String[] args) {
        SpringApplication.run(BkdApplication.class, args);
    }

}
