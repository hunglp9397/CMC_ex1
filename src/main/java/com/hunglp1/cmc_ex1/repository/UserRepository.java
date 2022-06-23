package com.hunglp1.cmc_ex1.repository;

import com.hunglp1.cmc_ex1.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    List<Users> findByPermissions_PermissionName(String permissionName);

    void deleteUsersByUsername(String username);

}
