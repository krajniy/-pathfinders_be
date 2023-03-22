package com.example.prejob.repository;

import com.example.prejob.entity.Industry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The IndustryRepository interface provides access to the industry database table.
 *
 * @author Elena Ivanishcheva
 */
@Repository
public interface IndustryRepository extends JpaRepository<Industry, Long> {
}
