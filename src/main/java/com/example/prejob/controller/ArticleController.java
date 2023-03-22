package com.example.prejob.controller;

import com.example.prejob.entity.Article;
import com.example.prejob.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing articles.
 *
 * @author Elena Ivanishcheva
 */
@RestController
@RequestMapping("api/articles")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    /**
     * Retrieves articles based on given parameters.
     *
     * @param roleId     the ID of the role to filter by
     * @param industryId the ID of the industry to filter by (optional)
     * @param majorId    the ID of the major to filter by (optional)
     * @param sizeId     the ID of the size to filter by (optional)
     * @return a ResponseEntity containing a list of Article objects that match the given criteria
     */
    @CrossOrigin(origins = "*")
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
