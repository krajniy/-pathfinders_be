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

@RestController
@RequestMapping("api/size")
public class SizeController {

    @Autowired
    SizeService sizeService;

    @CrossOrigin(origins = "*")
    @GetMapping()
    public ResponseEntity<List<Size>> getAllSizes(){
        try {
            return new ResponseEntity<>(sizeService.getAllSizes(), HttpStatus.OK);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
