package com.example.prejob.repository;

import com.example.prejob.entity.Major;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The MajorRepository interface provides access to the major database table.
 *
 * @author Elena Ivanishcheva
 */
@Repository
public interface MajorRepository extends JpaRepository<Major, Long> {
}
