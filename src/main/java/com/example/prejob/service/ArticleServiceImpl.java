package com.example.prejob.service;

import com.example.prejob.entity.Article;
import com.example.prejob.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public List<Article> getArticlesByFilter(Long roleId, Long industryId, Long majorId, Long sizeId) {
        return articleRepository.findAllByRoleIdAndIndustryIdAndMajorIdAndSizeId(roleId, industryId, majorId, sizeId);
    }

    @Override
    public List<Article> findAllByRoleId(Long roleId) {
        return articleRepository.findAllByRoleId(roleId);
    }

    @Override
    public List<Article> findAllByRoleIdAndSizeId(Long roleId, Long sizeId) {
        return articleRepository.findAllByRoleIdAndSizeId(roleId, sizeId);
    }

    @Override
    public List<Article> findAllByRoleIdAndMajorId(Long roleId, Long majorId) {
        return articleRepository.findAllByRoleIdAndMajorId(roleId, majorId);
    }

    @Override
    public List<Article> findAllByRoleIdAndIndustryId(Long roleId, Long industryId) {
        return articleRepository.findAllByRoleIdAndIndustryId(roleId, industryId);
    }

    @Override
    public List<Article> findAllByRoleIdAndIndustryIdAndSizeId(Long roleId, Long industryId, Long sizeId) {
        return articleRepository.findAllByRoleIdAndIndustryIdAndSizeId(roleId, industryId, sizeId);
    }

    @Override
    public List<Article> findAllByRoleIdAndIndustryIdAndMajorId(Long roleId, Long industryId, Long majorId) {
        return articleRepository.findAllByRoleIdAndIndustryIdAndMajorId(roleId, industryId, majorId);
    }

    @Override
    public List<Article> findAllByRoleIdAndIndustryIdAndMajorIdAndSizeId(Long roleId, Long industryId, Long majorId, Long sizeId) {
        return articleRepository.findAllByRoleIdAndIndustryIdAndMajorIdAndSizeId(roleId, industryId, majorId, sizeId);
    }


}
