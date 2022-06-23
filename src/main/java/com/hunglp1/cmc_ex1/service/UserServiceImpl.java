package com.hunglp1.cmc_ex1.service;

import com.hunglp1.cmc_ex1.model.Users;
import com.hunglp1.cmc_ex1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> getAll(String permissionName) {
       return permissionName == null ? userRepository.findAll() : userRepository.findByPermissions_PermissionName(permissionName);
    }

    @Override
    public void deleteByUsername(String username) {
        userRepository.deleteUsersByUsername(username);
    }

    @Override
    public Users addUser(Users users) {
       return userRepository.save(users);
    }

}

