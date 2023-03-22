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

@RestController
@RequestMapping("api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ResponseEntity<List<Role>> getAllRoles(){
        try {
            return new ResponseEntity<>(roleService.getAllRoles(), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
