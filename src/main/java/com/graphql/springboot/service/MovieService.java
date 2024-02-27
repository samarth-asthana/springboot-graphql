package com.graphql.springboot.service;

import com.graphql.springboot.dto.MovieCreateDto;
import com.graphql.springboot.model.Movie;
import java.util.List;

public interface MovieService {
    public List<Movie> fetchAllMovies();
    public Movie fetchMovie(String movieName);
    public Movie createMovie(MovieCreateDto movieCreateDto);
};
