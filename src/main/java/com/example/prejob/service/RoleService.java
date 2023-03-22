package com.example.prejob.service;

import com.example.prejob.entity.Role;

import java.util.List;

/**
 * The RoleService interface specifies methods for retrieving and manipulating Role objects.
 *
 * @author Elena Ivanishcheva
 */
public interface RoleService {

    /**
     * Retrieves all roles from the database.
     *
     * @return A list of Role objects.
     */

    List<Role> getAllRoles();
}
