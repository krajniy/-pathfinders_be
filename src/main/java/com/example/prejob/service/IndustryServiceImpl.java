package com.example.prejob.service;

import com.example.prejob.entity.Industry;
import com.example.prejob.repository.IndustryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The IndustryServiceImpl class implements the IndustryService interface and provides methods for retrieving and manipulating
 * <p>
 * Industry objects.
 *
 * @author Elena Ivanishcheva
 */
@Service
public class IndustryServiceImpl implements IndustryService {
    @Autowired
    IndustryRepository industryRepository;

    /**
     * Retrieves all industries from the database.
     *
     * @return A list of Industry objects.
     */
    @Override
    public List<Industry> getAllIndustries() {
        return industryRepository.findAll();
    }
}
