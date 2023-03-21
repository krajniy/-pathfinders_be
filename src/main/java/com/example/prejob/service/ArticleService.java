package com.example.prejob.service;

import com.example.prejob.entity.Article;

import java.util.List;

public interface ArticleService {

    List<Article> getAllArticles();


    List<Article> getArticlesByFilter(Long roleId, Long industryId, Long majorId, Long sizeId);

    List<Article> findAllByRoleId(Long roleId);

    List<Article> findAllByRoleIdAndSizeId(Long roleId, Long sizeId);

    List<Article> findAllByRoleIdAndMajorId(Long roleId, Long majorId);

    List<Article> findAllByRoleIdAndIndustryId(Long roleId, Long industryId);

    List<Article> findAllByRoleIdAndIndustryIdAndSizeId(Long roleId, Long industryId, Long sizeId);

    List<Article> findAllByRoleIdAndIndustryIdAndMajorId(Long roleId, Long industryId, Long majorId);

    List<Article> findAllByRoleIdAndIndustryIdAndMajorIdAndSizeId(Long roleId, Long industryId, Long majorId, Long sizeId);
}
