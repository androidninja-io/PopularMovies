package io.androidninja.popularmovies;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.orhanobut.logger.Logger;
import io.androidninja.popularmovies.data.Movie;
import io.androidninja.popularmovies.data.MovieResponseData;
import io.androidninja.popularmovies.data.source.MoviesDataSource;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MoviesListActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_list);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://api.themoviedb.org/3/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
        MoviesDataSource moviesDataSource = retrofit.create(MoviesDataSource.class);
        Call<MovieResponseData> call = moviesDataSource.getMovies("popular", "89ec2480f6ed6cbf83e6033b2e1fd2c7", 1);
        call.enqueue(new Callback<MovieResponseData>() {
            @Override
            public void onResponse(Call<MovieResponseData> call, Response<MovieResponseData> response) {
                if(response.isSuccessful()) {
                    MovieResponseData data = response.body();
                    List<Movie> movies = data.getResults();
                    for(Movie movie : movies) {
                        Logger.d(movie);
                    }
                }
            }

            @Override
            public void onFailure(Call<MovieResponseData> call, Throwable t) {

            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_movies_list, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
