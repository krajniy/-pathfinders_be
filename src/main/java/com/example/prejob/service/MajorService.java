package com.example.prejob.service;

import com.example.prejob.entity.Major;

import java.util.List;

/**
 * The MajorService interface specifies methods for retrieving and manipulating Major objects.
 *
 * @author Elena Ivanishcheva
 */
public interface MajorService {

    /**
     * Retrieves all majors from the database.
     *
     * @return A list of Major objects.
     */
    List<Major> getAllMajors();
}
