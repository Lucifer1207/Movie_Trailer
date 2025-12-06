package com.lucifer.movies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data //since all variables are private, we need getter setter methods to access them, so this will help us in this
@AllArgsConstructor //helps to create and manipulate constructor,that takes all the private arguments
@NoArgsConstructor //Another constructor that takes no arguments
public class Movie {

    @Id
    private ObjectId _id;

    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;

    private List<String> genres;
    private String poster;
    private List<String> backdrops;

    @DocumentReference //this will store only the reference of each review, and actual Reviews will be stored in different Collection
    // that's why we made Review a different Class
    private List<Review> reviewIds;

}
