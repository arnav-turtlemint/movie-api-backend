package com.arnav.movies.service;

import com.arnav.movies.Movie;
import com.arnav.movies.repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){

        return movieRepository.findAll();

    }

    // optional as findById might return null
    public Optional<Movie> singleMovie(ObjectId id){
        return movieRepository.findMovieById(id);
    }
}
