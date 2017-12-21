package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.waiphyoag.padc_3_f_wpa_popular_movies.R;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.delegates.MovieItemDelegates;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.viewholders.ItemsViewsHolder;

/**
 * Created by WaiPhyoAg on 12/7/17.
 */

public class MoviesAdapter extends RecyclerView.Adapter {
    private MovieItemDelegates mmovieItemDelegates;
    public MoviesAdapter(MovieItemDelegates movieItemDelegates)
    {
        mmovieItemDelegates=movieItemDelegates;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieitemsView = inflater.inflate(R.layout.item_movies, parent, false);
        ItemsViewsHolder itemsViewsHolder = new ItemsViewsHolder(movieitemsView, mmovieItemDelegates);
        return itemsViewsHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 6;
    }
}
