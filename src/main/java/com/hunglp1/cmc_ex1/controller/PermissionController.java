package com.hunglp1.cmc_ex1.controller;


import com.hunglp1.cmc_ex1.model.Permission;
import com.hunglp1.cmc_ex1.model.Users;
import com.hunglp1.cmc_ex1.service.PermissionService;
import com.hunglp1.cmc_ex1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.security.Permissions;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class PermissionController {

    @Autowired
    private PermissionService permissionService;

        @GetMapping("/permissions")
    public List<Permission> getUser(@RequestHeader(name="username", required = false) String username){
        return permissionService.getAll(username);


    }
    @DeleteMapping("/permissions/{permissionname}")
    @Transactional
    public void delUser(@PathVariable("permissionname") String permissionname){
        permissionService.deleteByPermissionName(permissionname);
    }
}
