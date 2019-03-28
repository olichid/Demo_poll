package com.olichid.learning.demo_poll.repository;

import com.olichid.learning.demo_poll.model.Role;
import com.olichid.learning.demo_poll.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}
