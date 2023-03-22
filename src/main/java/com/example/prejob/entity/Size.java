package com.example.prejob.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * The Size class represents a size entity in the size_table database table.
 *
 * @author Elena Ivanishcheva
 */
@Entity
@Table(name = "size_table")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Size {
    /**
     * The ID of the size.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * The name of the size.
     */
    @Column(name = "name", nullable = false)
    private String name;

    /**
     * The list of articles associated with this size.
     */
    @OneToMany(mappedBy = "size", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Article> articles = new ArrayList<>();
}
