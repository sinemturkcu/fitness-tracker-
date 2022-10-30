package com.fitnessteam.fitnesstracker.repositories;

import com.fitnessteam.fitnesstracker.entities.Role;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Qualifier("role")
@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
    List<Role> findAllById(Long id);
}
