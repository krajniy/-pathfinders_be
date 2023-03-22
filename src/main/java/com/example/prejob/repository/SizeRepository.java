package com.example.prejob.repository;

import com.example.prejob.entity.Size;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The SizeRepository interface provides access to the size_table database table.
 *
 * @author Elena Ivanishcheva
 */

@Repository
public interface SizeRepository extends JpaRepository<Size, Long> {
}
