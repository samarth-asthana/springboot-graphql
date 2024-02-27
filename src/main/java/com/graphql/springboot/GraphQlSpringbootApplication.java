package com.graphql.springboot;

import com.graphql.springboot.model.Movie;
import com.graphql.springboot.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GraphQlSpringbootApplication implements CommandLineRunner {

	@Autowired
	MovieRepository movieRepository;

	public static void main(String[] args) {
		SpringApplication.run(GraphQlSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Movie movie1= new Movie();
		movie1.setImdbRating(10.0);
		movie1.setMovieName("Inception");
		movie1.setProducer("Nolan");
		movie1.setGenre("Sci-fi");
		movie1.setLeadActorName("Leonardo");

		Movie movie2= new Movie();
		movie2.setImdbRating(9.0);
		movie2.setMovieName("Interstellar");
		movie2.setProducer("Nolan");
		movie2.setGenre("Sci-fi");
		movie2.setLeadActorName("Matthew");

		Movie movie3= new Movie();
		movie3.setImdbRating(8.0);
		movie3.setMovieName("Tenet");
		movie3.setProducer("Nolan");
		movie3.setGenre("Sci-fi");
		movie3.setLeadActorName("John");

		movieRepository.save(movie1);
		movieRepository.save(movie2);
		movieRepository.save(movie3);

	}
}
