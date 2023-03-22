package com.example.prejob.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Industry class represents an industry entity in the industry database table.
 *
 * @author Elena Ivanishcheva
 */

@Entity
@Table(name = "industry")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Industry {
    /**
     * The ID of the industry.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * The name of the industry.
     */
    @Column(name = "name", nullable = false)
    private String name;
    /**
     * The list of articles associated with this industry.
     */
    @OneToMany(mappedBy = "industry", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Article> articles = new ArrayList<>();
}
