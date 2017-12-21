package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.activities;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Adapter;


import butterknife.BindView;
import butterknife.ButterKnife;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.R;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.adapters.TrailersAdapter;

/**
 * Created by WaiPhyoAg on 12/13/17.
 */

public class MovieDetailActivity extends AppCompatActivity {

     @BindView(R.id.rv_movie_trailers)
    RecyclerView rvTrailers;
    private TrailersAdapter TrailersAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            Window w = getWindow(); // in Activity's onCreate() for instance
            w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        }
        setContentView(R.layout.activity_movie_details);

        ButterKnife.bind(this,this);

        TrailersAdapter =new TrailersAdapter();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        rvTrailers.setLayoutManager(linearLayoutManager);
        rvTrailers.setAdapter(TrailersAdapter);

    }
}
