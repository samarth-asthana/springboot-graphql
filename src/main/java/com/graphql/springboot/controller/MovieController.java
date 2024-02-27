package com.graphql.springboot.controller;

import com.graphql.springboot.dto.MovieCreateDto;
import com.graphql.springboot.model.Movie;
import com.graphql.springboot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/movie")
@Controller
public class MovieController {

    @Autowired
    MovieService movieService;

//    @GetMapping
    @QueryMapping("fetchAllMovies")
    public List<Movie> fetchAllMovie(){
        return movieService.fetchAllMovies();
    }

    //    @GetMapping("/{movieName}")
    //    public Movie fetchMovie(@PathVariable String movieName){
    @QueryMapping("fetchSpecificMovie")
    public Movie fetchMovie(@Argument String movieName){
        return movieService.fetchMovie(movieName);
    }

//    @PostMapping
    @MutationMapping("createMovie")
//    public Movie createMovie(@RequestBody MovieCreateDto movieCreateDto){
    public Movie createMovie(@Argument MovieCreateDto movieCreateDto){
        return movieService.createMovie((movieCreateDto));
    }
}
