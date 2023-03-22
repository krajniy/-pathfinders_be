package com.example.prejob.service;

import com.example.prejob.entity.Role;
import com.example.prejob.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The RoleServiceImpl class implements the RoleService interface and provides methods for retrieving and manipulating
 * <p>
 * Role objects.
 *
 * @author Elena Ivanishcheva
 */

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository repository;

    /**
     * Retrieves all roles from the database.
     *
     * @return A list of Role objects.
     */

    @Override
    public List<Role> getAllRoles() {
        return repository.findAll();
    }
}
