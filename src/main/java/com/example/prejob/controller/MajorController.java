package com.example.prejob.controller;

import com.example.prejob.entity.Major;
import com.example.prejob.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The MajorController class handles HTTP requests related to the Major entity.
 *
 * @author Elena Ivanishcheva
 */
@RestController
@RequestMapping("api/majors")
public class MajorController {
    @Autowired
    MajorService majorService;

    /**
     * Retrieves all majors from the database.
     *
     * @return A ResponseEntity object containing a list of Major objects and an HTTP status code.
     * HttpStatus.OK if the majors are successfully retrieved.
     * HttpStatus.NOT_FOUND if no majors are found in the database.
     * HttpStatus.INTERNAL_SERVER_ERROR if an error occurs while retrieving the majors.
     */

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ResponseEntity<List<Major>> getAllMajors() {
        try {
            return new ResponseEntity<>(majorService.getAllMajors(), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
