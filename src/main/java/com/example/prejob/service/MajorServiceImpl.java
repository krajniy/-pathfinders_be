package com.example.prejob.service;

import com.example.prejob.entity.Major;
import com.example.prejob.repository.MajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The MajorServiceImpl class implements the MajorService interface and provides methods for retrieving and manipulating
 * <p>
 * Major objects.
 *
 * @author Elena Ivanishcheva
 */

@Service
public class MajorServiceImpl implements MajorService {
    @Autowired
    MajorRepository majorRepository;

    /**
     * Retrieves all majors from the database.
     *
     * @return A list of Major objects.
     */
    @Override
    public List<Major> getAllMajors() {
        return majorRepository.findAll();
    }
}
