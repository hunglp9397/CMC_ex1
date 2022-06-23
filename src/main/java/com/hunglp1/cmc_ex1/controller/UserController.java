package com.hunglp1.cmc_ex1.controller;


import com.hunglp1.cmc_ex1.model.Users;
import com.hunglp1.cmc_ex1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<Users> getUser(@RequestHeader(name="permissionName", required = false) String permissionName){

        System.out.println(userService.getAll(permissionName));
        return userService.getAll(permissionName);
    }

    @DeleteMapping("/users/{username}")
    @Transactional
    public void delUser(@PathVariable("username") String username){


        userService.deleteByUsername(username);
    }



}
