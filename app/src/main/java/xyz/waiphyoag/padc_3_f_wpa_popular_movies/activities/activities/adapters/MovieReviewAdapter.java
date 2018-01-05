package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.waiphyoag.padc_3_f_wpa_popular_movies.R;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.viewholders.MovieReviewViewHolder;

/**
 * Created by WaiPhyoAg on 1/5/18.
 */

public class MovieReviewAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        Context context = parent.getContext();
        LayoutInflater layoutInflater=LayoutInflater.from(context);
        View movieReview=layoutInflater.inflate(R.layout.item_movie_reviews,parent,false);
        MovieReviewViewHolder movieReviewViewHolder=new MovieReviewViewHolder(movieReview);
        return movieReviewViewHolder;


    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
