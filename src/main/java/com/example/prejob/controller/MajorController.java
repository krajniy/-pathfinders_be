package com.example.prejob.controller;

import com.example.prejob.entity.Major;
import com.example.prejob.service.MajorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/majors")
public class MajorController {
    @Autowired
    MajorService majorService;

    @GetMapping()
    public ResponseEntity<List<Major>> getAllMajors(){
        try {
            return new ResponseEntity<>(majorService.getAllMajors(), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
