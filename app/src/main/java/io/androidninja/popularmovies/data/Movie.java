package io.androidninja.popularmovies.data;

import java.util.ArrayList;
import java.util.Date;

public class Movie {

    private String status_message;
    private int status_code;
    private String poster_path;
    private boolean adult;
    private String overview;
    private Date release_date;
    private ArrayList<Integer> genre_ids;
    private int id;
    private String original_title;
    private String original_language;
    private String title;
    private String backdrop_path;
    private float popularity;
    private int vote_count;
    private boolean video;
    private float vote_average;

    public String getStatusMessage() {
        return status_message;
    }

    public int getStatusCode() {
        return status_code;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public Date getRelease_date() {
        return release_date;
    }

    public ArrayList<Integer> getGenre_ids() {
        return genre_ids;
    }

    public int getId() {
        return id;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getTitle() {
        return title;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public float getPopularity() {
        return popularity;
    }

    public int getVote_count() {
        return vote_count;
    }

    public boolean isVideo() {
        return video;
    }

    public float getVote_average() {
        return vote_average;
    }

    @Override
    public String toString() {
        return "Movie{" +
            "status_message='" + status_message + '\'' +
            ", status_code=" + status_code +
            ", poster_path='" + poster_path + '\'' +
            ", adult=" + adult +
            ", overview='" + overview + '\'' +
            ", release_date=" + release_date +
            ", genre_ids=" + genre_ids +
            ", id=" + id +
            ", original_title='" + original_title + '\'' +
            ", original_language='" + original_language + '\'' +
            ", title='" + title + '\'' +
            ", backdrop_path='" + backdrop_path + '\'' +
            ", popularity=" + popularity +
            ", vote_count=" + vote_count +
            ", video=" + video +
            ", vote_average=" + vote_average +
            '}';
    }
}
