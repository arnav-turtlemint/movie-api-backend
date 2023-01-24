package com.arnav.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;


// @Document lets framework know about
// each document in the "movies" collection
@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

    //@Id annotation for letting know id < will be unique >
    @Id
    private ObjectId id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;

    private List<String> genres;
    private String poster;
    private List<String> backdrops;

    // embedded relationship
    // manual ref relationship
    @DocumentReference
    private List<Review> reviewIds;



    

}
