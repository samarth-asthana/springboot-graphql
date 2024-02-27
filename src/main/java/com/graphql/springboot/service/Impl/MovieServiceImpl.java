package com.graphql.springboot.service.Impl;

import com.graphql.springboot.dto.MovieCreateDto;
import com.graphql.springboot.model.Movie;
import com.graphql.springboot.repositories.MovieRepository;
import com.graphql.springboot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Override
    public List<Movie> fetchAllMovies() {
        return movieRepository.findAll();
    }

    @Override
    public Movie fetchMovie(String movieName) {
        return movieRepository.findFirstMovieByMovieName(movieName);
    }

    @Override
    public Movie createMovie(MovieCreateDto movieCreateDto) {
        Movie movie = new Movie();
        movie.setMovieName(movieCreateDto.getMovieName());
        movie.setGenre(movieCreateDto.getGenre());
        movie.setProducer(movieCreateDto.getProducer());
        movie.setLeadActorName(movieCreateDto.getLeadActorName());
        movie.setImdbRating(movieCreateDto.getImdbRating());
        return movieRepository.save(movie);
    }
}
