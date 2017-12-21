package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.R;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.delegates.MovieItemDelegates;

/**
 * Created by WaiPhyoAg on 12/7/17.
 */

public class ItemsViewsHolder extends RecyclerView.ViewHolder {
    private MovieItemDelegates mmovieItemDelegates;
    public ItemsViewsHolder(View itemView, MovieItemDelegates movieItemDelegates)
    {
        super(itemView);
        ButterKnife.bind(this,itemView);
        mmovieItemDelegates=movieItemDelegates;

    }
    @OnClick(R.id.cv_movie_item_root)
    public void onMovieItemTap()
    {
        mmovieItemDelegates.onTapMovieItem();
    }
}
