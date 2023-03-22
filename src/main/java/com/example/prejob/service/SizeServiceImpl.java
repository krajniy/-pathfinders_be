package com.example.prejob.service;

import com.example.prejob.entity.Size;
import com.example.prejob.repository.SizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The SizeServiceImpl class implements the SizeService interface and provides methods for retrieving and manipulating
 * <p>
 * Size objects.
 *
 * @author Elena Ivanishcheva
 */

@Service
public class SizeServiceImpl implements SizeService {

    @Autowired
    SizeRepository sizeRepository;

    /**
     * Retrieves all sizes from the database.
     *
     * @return A list of Size objects.
     */

    @Override
    public List<Size> getAllSizes() {
        return sizeRepository.findAll();
    }
}
