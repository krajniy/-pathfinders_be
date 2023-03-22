package com.example.prejob.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * The Major class represents a major entity in the major database table.
 *
 * @author Elena Ivanishcheva
 */

@Entity
@Table(name = "major")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Major {

    /**
     * The ID of the major.
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    /**
     * The name of the major.
     */

    @Column(name = "name", nullable = false)
    private String name;

    /**
     * The list of articles associated with this major.
     */

    @OneToMany(mappedBy = "major", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Article> articles = new ArrayList<>();

}
