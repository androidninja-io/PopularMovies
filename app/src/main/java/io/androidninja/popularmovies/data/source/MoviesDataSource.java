package io.androidninja.popularmovies.data.source;

import io.androidninja.popularmovies.data.MovieResponseData;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface MoviesDataSource {

    @GET("movie/{type}")
    Call<MovieResponseData> getMovies(@Path("type") String type, @Query("api_key") String api_key, @Query("page") int page);

}
