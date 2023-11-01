package com.example.proiectfrumos_bkd;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @PostMapping
    public void getUsers(@RequestBody User user){

        userService.createUser(user);
    }

    @PutMapping(path = "{id}")
    public void updateUser(@PathVariable Long id,@RequestBody User user){
        userService.updateUser(id,user);
    }

    @PatchMapping(path = "{id}")
    public void partialUpdateUser(@PathVariable Long id,@RequestBody User user){
        userService.partialUpdateUser(id,user);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

}