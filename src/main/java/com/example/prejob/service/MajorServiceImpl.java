package com.example.prejob.service;

import com.example.prejob.entity.Major;
import com.example.prejob.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    MajorRepository majorRepository;

    @Override
    public List<Major> getAllMajors() {
        return majorRepository.findAll();
    }
}
