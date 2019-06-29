package com.example.movielistactivity.models;

import org.json.JSONException;
import org.json.JSONObject;

public class Movie {

    //values from API
    public String title;
    public String overview;
    public String posterpath;// only the path
    public String backdropPath;

    // intializing from the JSON date
    public Movie(JSONObject object) throws JSONException{
        title = object.getString("title");
        overview = object.getString("overview");
        posterpath = object.getString("poster_path");
        backdropPath = object.getString("backdrop_path");
    }

    public String getTitle() {
        return title;
    }

    public String getOverview() {
        return overview;
    }

    public String getPosterpath() {
        return posterpath;
    }

    public String getBackdropPath() {
        return backdropPath;
    }
}
