package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.R;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.Data.vo.Model.MoviesModel;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.Events.LoadedMovieEvent;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.PopularMovieApp;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.adapters.MoviesAdapter;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.delegates.MovieItemDelegates;

public class MainActivity extends AppCompatActivity implements MovieItemDelegates{
    @BindView(R.id.fab)
    FloatingActionButton fab;
    @BindView(R.id.rv_movies)
    RecyclerView rvMovies;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    private MoviesAdapter MoviesAdapter;


    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);
    }

    @Override
    protected void onStop() {
        super.onStop();
        EventBus.getDefault().unregister(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this,this );
        MoviesAdapter =new MoviesAdapter(this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);
        rvMovies.setLayoutManager(linearLayoutManager);
        rvMovies.setAdapter(MoviesAdapter);

        MoviesModel.getsObjInstance().loadMovies();


        setSupportActionBar(toolbar);


        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    @Override
    public void onTapMovieItem() {
        Intent intent=new Intent(getApplicationContext(),MovieDetailActivity.class);
        startActivity(intent);
    }

    @Override
    public void onTapOverviewButton() {

    }

    @Override
    public void onTapFullscreenButton() {

    }
    @Subscribe (threadMode = ThreadMode.MAIN)
    public void onMoviesLoad(LoadedMovieEvent event)
    {
        Log.d(PopularMovieApp.LOG_TAG,"onMoviesLoaded:" + event.getMoviesList().size());
        MoviesAdapter.setMovies(event.getMoviesList());

    }
}
