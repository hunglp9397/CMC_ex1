package com.hunglp1.cmc_ex1.service;

import com.hunglp1.cmc_ex1.model.Permission;
import com.hunglp1.cmc_ex1.model.Users;
import com.hunglp1.cmc_ex1.repository.PermissionRepository;
import com.hunglp1.cmc_ex1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PermissionServiceImpl implements PermissionService{

    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> getAll(String username) {
       return username == null ? permissionRepository.findAll() : permissionRepository.findByUsers_Username(username);
    }

    @Override
    public void deleteByPermissionName(String permissionname) {
        permissionRepository.deletePermissionByPermissionName(permissionname);
    }
}

