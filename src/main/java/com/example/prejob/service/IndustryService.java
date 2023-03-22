package com.example.prejob.service;

import com.example.prejob.entity.Industry;

import java.util.List;

/**
 * The IndustryService interface specifies methods for retrieving and manipulating Industry objects.
 *
 * @author Elena Ivanishcheva
 */
public interface IndustryService {

    /**
     * Retrieves all industries from the database.
     *
     * @return A list of Industry objects.
     */
    List<Industry> getAllIndustries();
}
