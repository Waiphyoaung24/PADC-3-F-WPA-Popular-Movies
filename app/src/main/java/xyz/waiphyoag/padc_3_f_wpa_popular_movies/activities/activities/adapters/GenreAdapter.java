package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.waiphyoag.padc_3_f_wpa_popular_movies.R;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.viewholders.ItemTrailersList;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.viewholders.ItemsGenreViewHolder;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.viewholders.ItemsViewsHolder;

/**
 * Created by WaiPhyoAg on 12/23/17.
 */

public class GenreAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View genreitemviews = layoutInflater.inflate(R.layout.item_genre_list, parent, false);
        ItemsGenreViewHolder itemsGenreViewHolder = new ItemsGenreViewHolder(genreitemviews);
        return itemsGenreViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
