package com.example.prejob.service;

import com.example.prejob.entity.Role;
import com.example.prejob.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleRepository repository;

    @Override
    public List<Role> getAllRoles() {
        return repository.findAll();
    }
}
