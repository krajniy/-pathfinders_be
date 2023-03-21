package com.example.prejob.service;

import com.example.prejob.entity.Size;
import com.example.prejob.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SizeServiceImpl implements SizeService {

    @Autowired
    SizeRepository sizeRepository;

    @Override
    public List<Size> getAllSizes() {
        return sizeRepository.findAll();
    }
}
