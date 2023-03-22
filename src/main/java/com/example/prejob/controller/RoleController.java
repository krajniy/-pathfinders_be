package com.example.prejob.controller;

import com.example.prejob.entity.Role;
import com.example.prejob.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The RoleController class is responsible for handling HTTP requests related to the Role entity.
 *
 * @author Elena Ivanishcheva
 */

@RestController
@RequestMapping("api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    /**
     * Retrieves all roles from the database.
     *
     * @return A ResponseEntity object containing a list of Role objects and an HTTP status code.
     * HttpStatus.OK if the roles are successfully retrieved.
     * HttpStatus.NOT_FOUND if no roles are found in the database.
     * HttpStatus.INTERNAL_SERVER_ERROR if an error occurs while retrieving the roles.
     */

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ResponseEntity<List<Role>> getAllRoles() {
        try {
            return new ResponseEntity<>(roleService.getAllRoles(), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
