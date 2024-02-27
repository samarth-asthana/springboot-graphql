package com.graphql.springboot.repositories;

import com.graphql.springboot.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends JpaRepository<Movie,Integer> {
    Movie findFirstMovieByMovieName(String movieName);
}
