package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.waiphyoag.padc_3_f_wpa_popular_movies.R;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.viewholders.ItemTrailersList;

/**
 * Created by WaiPhyoAg on 12/14/17.
 */

public class TrailersAdapter extends RecyclerView.Adapter {
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View traileritemsView = layoutInflater.inflate(R.layout.item_movie_trailers, parent, false);
        ItemTrailersList itemTrailersList = new ItemTrailersList(traileritemsView);
        return itemTrailersList;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
