package com.example.prejob.controller;

import com.example.prejob.entity.Article;
import com.example.prejob.repository.ArticleRepository;
import com.example.prejob.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping()
    public ResponseEntity<List<Article>> getArticles(
            @RequestParam("roleId") Long roleId,
            @RequestParam(value = "industryId", required = false) Long industryId,
            @RequestParam(value = "majorId", required = false) Long majorId,
            @RequestParam(value = "sizeId", required = false) Long sizeId) {
        try {
        if (industryId == null && majorId == null && sizeId == null) {
            return new ResponseEntity<>(articleService.findAllByRoleId(roleId), HttpStatus.OK);
        } else if (industryId == null && majorId == null) {
            return new ResponseEntity<>(articleService.findAllByRoleIdAndSizeId(roleId, sizeId), HttpStatus.OK);
        } else if (industryId == null && sizeId == null) {
            return new ResponseEntity<>(articleService.findAllByRoleIdAndMajorId(roleId, majorId), HttpStatus.OK);
        } else if (majorId == null && sizeId == null) {
            return new ResponseEntity<>(articleService.findAllByRoleIdAndIndustryId(roleId, industryId), HttpStatus.OK);
        } else if (majorId == null) {
            return new ResponseEntity<>(articleService.findAllByRoleIdAndIndustryIdAndSizeId(roleId, industryId, sizeId), HttpStatus.OK);
        } else if (sizeId == null) {
            return new ResponseEntity<>(articleService.findAllByRoleIdAndIndustryIdAndMajorId(roleId, industryId, majorId), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(articleService.findAllByRoleIdAndIndustryIdAndMajorIdAndSizeId(roleId, industryId, majorId, sizeId), HttpStatus.OK);
        }
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
}
