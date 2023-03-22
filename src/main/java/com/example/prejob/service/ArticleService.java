package com.example.prejob.service;

import com.example.prejob.entity.Article;

import java.util.List;

/**
 * ArticleService is an interface responsible for defining the methods for retrieving articles from the underlying database.
 *
 * @author Elena Ivanishcheva
 */
public interface ArticleService {
    /**
     * Retrieves all articles from the database.
     *
     * @return A list of all articles.
     */
    List<Article> getAllArticles();

    /**
     * Retrieves articles that match the given role, industry, major, and size IDs.
     *
     * @param roleId     The ID of the role.
     * @param industryId The ID of the industry.
     * @param majorId    The ID of the major.
     * @param sizeId     The ID of the size.
     * @return A list of articles that match the given criteria.
     */
    List<Article> getArticlesByFilter(Long roleId, Long industryId, Long majorId, Long sizeId);

    /**
     * Retrieves articles that match the given role ID.
     *
     * @param roleId The ID of the role.
     * @return A list of articles that match the given role ID.
     */
    List<Article> findAllByRoleId(Long roleId);

    /**
     * Retrieves articles that match the given role and size IDs.
     *
     * @param roleId The ID of the role.
     * @param sizeId The ID of the size.
     * @return A list of articles that match the given role and size IDs.
     */
    List<Article> findAllByRoleIdAndSizeId(Long roleId, Long sizeId);

    /**
     * Retrieves articles that match the given role and major IDs.
     *
     * @param roleId  The ID of the role.
     * @param majorId The ID of the major.
     * @return A list of articles that match the given role and major IDs.
     */
    List<Article> findAllByRoleIdAndMajorId(Long roleId, Long majorId);

    /**
     * Retrieves articles that match the given role and major IDs.
     *
     * @param roleId     The ID of the role.
     * @param industryId The ID of the industry.
     * @return A list of articles that match the given role and industry IDs.
     */

    List<Article> findAllByRoleIdAndIndustryId(Long roleId, Long industryId);

    /**
     * Retrieves articles that match the given role and major IDs.
     *
     * @param roleId     The ID of the role.
     * @param industryId The ID of the industry.
     * @param sizeId     The ID of the size.
     * @return A list of articles that match the given role, industry and size IDs.
     */
    List<Article> findAllByRoleIdAndIndustryIdAndSizeId(Long roleId, Long industryId, Long sizeId);

    /**
     * Retrieves articles that match the given role and major IDs.
     *
     * @param roleId     The ID of the role.
     * @param industryId The ID of the industry.
     * @param majorId    The ID of the size.
     * @return A list of articles that match the given role, industry and major IDs.
     */
    List<Article> findAllByRoleIdAndIndustryIdAndMajorId(Long roleId, Long industryId, Long majorId);

    /**
     * Retrieves articles that match the given role and major IDs.
     *
     * @param roleId     The ID of the role.
     * @param industryId The ID of the industry.
     * @param majorId    The ID of the size.
     * @param sizeId     The ID of the size.
     * @return A list of articles that match the given role, industry, major and size IDs.
     */
    List<Article> findAllByRoleIdAndIndustryIdAndMajorIdAndSizeId(Long roleId, Long industryId, Long majorId, Long sizeId);
}
