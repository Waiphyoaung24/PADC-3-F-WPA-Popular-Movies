package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import xyz.waiphyoag.padc_3_f_wpa_popular_movies.R;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.Data.vo.MoviesVO;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.delegates.MovieItemDelegates;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.viewholders.ItemsViewsHolder;

/**
 * Created by WaiPhyoAg on 12/7/17.
 */

public class MoviesAdapter extends RecyclerView.Adapter<ItemsViewsHolder> {
    private MovieItemDelegates mmovieItemDelegates;
    private List<MoviesVO> mMovieList;
    public MoviesAdapter(MovieItemDelegates movieItemDelegates)
    {
        mmovieItemDelegates=movieItemDelegates;
        mMovieList=new ArrayList<>();
    }
    @Override
    public ItemsViewsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View movieitemsView = inflater.inflate(R.layout.item_movies, parent, false);
        ItemsViewsHolder itemsViewsHolder = new ItemsViewsHolder(movieitemsView, mmovieItemDelegates);
        return itemsViewsHolder;
    }

    @Override
    public void onBindViewHolder(ItemsViewsHolder holder, int position) {
        holder.setMovies(mMovieList.get(position));


    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }

    public void setMovies(List<MoviesVO>moviesList)
    {
        mMovieList=moviesList;
        notifyDataSetChanged();
    }
}
