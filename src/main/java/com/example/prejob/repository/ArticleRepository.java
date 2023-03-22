package com.example.prejob.repository;

import com.example.prejob.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * The ArticleRepository interface is responsible for defining the methods that can be used
 * to interact with the underlying database for the {@link Article} entity.
 * <p>
 * The interface also declares several custom query methods to retrieve articles based on different criteria, using the @Query annotation to define the JPQL (Java Persistence Query Language) query:
 * findAllByRoleIdAndIndustryIdAndMajorIdAndSizeId() - retrieves all articles that match the given role, industry, major, and size IDs.
 * findAllByRoleId() - retrieves all articles that match the given role ID.
 * findAllByRoleIdAndSizeId() - retrieves all articles that match the given role and size IDs.
 * findAllByRoleIdAndMajorId() - retrieves all articles that match the given role and major IDs.
 * findAllByRoleIdAndIndustryId() - retrieves all articles that match the given role and industry IDs.
 * findAllByRoleIdAndIndustryIdAndSizeId() - retrieves all articles that match the given role, industry, and size IDs.
 * findAllByRoleIdAndIndustryIdAndMajorId() - retrieves all articles that match the given role, industry, and major IDs.
 *
 * @author Elena Ivanishcheva
 */

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query("SELECT a FROM Article a " +
            "WHERE a.role.id = :roleId " +
            "AND a.industry.id = :industryId " +
            "AND a.major.id = :majorId " +
            "AND a.size.id = :sizeId")
    List<Article> findAllByRoleIdAndIndustryIdAndMajorIdAndSizeId(
            @Param("roleId") Long roleId,
            @Param("industryId") Long industryId,
            @Param("majorId") Long majorId,
            @Param("sizeId") Long sizeId);

    List<Article> findAllByRoleId(Long roleId);

    List<Article> findAllByRoleIdAndSizeId(Long roleId, Long sizeId);

    List<Article> findAllByRoleIdAndMajorId(Long roleId, Long majorId);

    List<Article> findAllByRoleIdAndIndustryId(Long roleId, Long industryId);

    List<Article> findAllByRoleIdAndIndustryIdAndSizeId(Long roleId, Long industryId, Long sizeId);

    List<Article> findAllByRoleIdAndIndustryIdAndMajorId(Long roleId, Long industryId, Long majorId);
}
