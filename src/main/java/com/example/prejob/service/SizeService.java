package com.example.prejob.service;

import com.example.prejob.entity.Size;

import java.util.List;

/**
 * The SizeService interface specifies methods for retrieving and manipulating Size objects.
 *
 * @author Elena Ivanishcheva
 */
public interface SizeService {

    /**
     * Retrieves all sizes from the database.
     *
     * @return A list of Size objects.
     */
    List<Size> getAllSizes();
}
