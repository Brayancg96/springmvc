package com.brayan.springboot.webapp.springboot_web.controllers;


//import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brayan.springboot.webapp.springboot_web.models.User;
import com.brayan.springboot.webapp.springboot_web.models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        User user = new User("Brayan", "Cifuentes");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Spring boot");

        return userDto;
    }

    @GetMapping("/list")
    public List<User> list() {

        User user1 = new User("Brayan", "Cifuentes");
        User user2 = new User("Francy", "Gonzalez");
        User user3 = new User("Fabian", "Castro");

        List<User> users = Arrays.asList(user1, user2, user3);  
        // List<User> users = new ArrayList<>();
        // users.add(user1);
        // users.add(user2);
        // users.add(user3);

        return users;

    }

    @GetMapping("/details-map")
    public Map<String, Object> details2() {

        User user = new User("Brayan", "Cifuentes");

        Map<String, Object> body = new HashMap<>();
        body.put("title", "Spring boot");
        body.put("user", user);
        
        return body;
    }

}
