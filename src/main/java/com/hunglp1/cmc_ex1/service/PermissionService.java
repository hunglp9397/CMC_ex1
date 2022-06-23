package com.hunglp1.cmc_ex1.service;

import com.hunglp1.cmc_ex1.model.Permission;
import com.hunglp1.cmc_ex1.model.Users;

import javax.transaction.Transactional;
import java.util.List;

public interface PermissionService {

    List<Permission> getAll(String username);

    @Transactional
    void deleteByPermissionName(String permissioname);
}
