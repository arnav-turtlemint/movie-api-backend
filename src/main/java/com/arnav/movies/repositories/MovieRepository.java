package com.arnav.movies.repositories;

import com.arnav.movies.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<Movie, ObjectId> {

    // findById -> built in method to search with id
    // but if we want to search with imdbId
    // inorder not to expose the unique id,
    // we have to make that method ourselves
    // using AUTOMATIC QUERY


//    Optional<Movie> findMovieByImdbId(String imdbId);
}
