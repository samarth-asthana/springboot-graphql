package com.graphql.springboot.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name="movie")
@Getter
@Setter
@NoArgsConstructor
public class Movie implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer mid;

    @Column
    String movieName;

    @Column
    String leadActorName;

    @Column
    String Genre;

    @Column
    String producer;

    @Column
    Double imdbRating;
}
