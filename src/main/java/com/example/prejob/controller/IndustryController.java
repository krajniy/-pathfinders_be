package com.example.prejob.controller;

import com.example.prejob.entity.Industry;
import com.example.prejob.service.IndustryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The IndustryController class handles HTTP requests related to the Industry entity.
 *
 * @author Elena Ivanishcheva
 */
@RestController
@RequestMapping("api/industries")
public class IndustryController {

    @Autowired
    IndustryService industryService;

    /**
     * Retrieves all industries from the database.
     *
     * @return A ResponseEntity object containing a list of Industry objects and an HTTP status code.
     * HttpStatus.OK if the industry are successfully retrieved.
     * HttpStatus.NOT_FOUND if no industry are found in the database.
     * HttpStatus.INTERNAL_SERVER_ERROR if an error occurs while retrieving the industry.
     */

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ResponseEntity<List<Industry>> getAllIndustries() {
        try {
            return new ResponseEntity<>(industryService.getAllIndustries(), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
