package com.hunglp1.cmc_ex1.service;

import com.hunglp1.cmc_ex1.model.Users;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {

    List<Users> getAll(String permissionName);

    @Transactional
    void deleteByUsername(String username);

    Users addUser(Users users);
}
