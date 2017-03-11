package io.androidninja.popularmovies.data;

import java.util.List;

public class MovieResponseData {

    private String status_message;
    private int status_code;
    private int page;
    private List<Movie> results;
    private int total_results;
    private int total_pages;

    public String getStatusMessage() {
        return status_message;
    }

    public int getStatusCode() {
        return status_code;
    }

    public int getPage() {
        return page;
    }

    public List<Movie> getResults() {
        return results;
    }

    public int getTotalResults() {
        return total_results;
    }

    public int getTotalPages() {
        return total_pages;
    }
}
