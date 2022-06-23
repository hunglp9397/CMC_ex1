package com.hunglp1.cmc_ex1.repository;

import com.hunglp1.cmc_ex1.model.Permission;
import com.hunglp1.cmc_ex1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    List<Permission> findByUsers_Username(String username);

    void deletePermissionByPermissionName(String permissionname);
}
