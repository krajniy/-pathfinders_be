package com.example.prejob.controller;

import com.example.prejob.entity.Size;
import com.example.prejob.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * The SizeController class is responsible for handling HTTP requests related to the Size entity.
 *
 * @author Elena Ivanishcheva
 */
@RestController
@RequestMapping("api/size")
public class SizeController {

    @Autowired
    SizeService sizeService;

    /**
     * Retrieves all sizes from the database.
     *
     * @return A ResponseEntity object containing a list of Size objects and an HTTP status code.
     * HttpStatus.OK if the sizes are successfully retrieved.
     * HttpStatus.NOT_FOUND if no sizes are found in the database.
     * HttpStatus.INTERNAL_SERVER_ERROR if an error occurs while retrieving the sizes.
     */

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ResponseEntity<List<Size>> getAllSizes() {
        try {
            return new ResponseEntity<>(sizeService.getAllSizes(), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
