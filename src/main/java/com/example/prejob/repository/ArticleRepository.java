package com.example.prejob.repository;

import com.example.prejob.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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
