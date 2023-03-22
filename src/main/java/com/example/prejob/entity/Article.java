package com.example.prejob.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

/**
 * The Article class represents an article entity in the article database table.
 *
 * @author Elena Ivanishcheva
 */

@Entity
@Table(name = "article")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Article implements Serializable {

    /**
     * The ID of the article.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    /**
     * The title of the article.
     */
    @Column(name = "title")
    private String title;
    /**
     * The URL of the video associated with the article.
     */
    @Column(name = "video_url")
    private String videoUrl;
    /**
     * The industry associated with the article.
     */

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "industry_id")
    private Industry industry;

    /**
     * The major associated with the article.
     */

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "major_id")
    private Major major;

    /**
     * The role associated with the article.
     */
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    /**
     * The size associated with the article.
     */
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "size_id")
    private Size size;

}
