package com.example.prejob.repository;

import com.example.prejob.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The RoleRepository interface provides access to the role database table.
 *
 * @author Elena Ivanishcheva
 */

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

}
