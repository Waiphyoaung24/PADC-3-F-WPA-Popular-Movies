package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.viewholders;

import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.R;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.Data.vo.MoviesVO;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.delegates.MovieItemDelegates;

/**
 * Created by WaiPhyoAg on 12/7/17.
 */

public class ItemsViewsHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.tv_movie_titles)
    TextView tvTitle;
    @BindView(R.id.tv_rating_points)
    TextView tvRatingPoints;
    @BindView(R.id.iv_movie_logo)
    ImageView ivPosterPath;


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

    public void setMovies (MoviesVO movies)
    {
        tvTitle.setText(movies.getTitle());
        tvRatingPoints.setText(movies.getVote_average());

        if(movies.getPoster_path()!=null)
        {
            ivPosterPath.setVisibility(View.VISIBLE);
            Glide.with(ivPosterPath.getContext())
                    .load(movies.getPoster_path())
                    .into(ivPosterPath);

        }
        else {
            ivPosterPath.setVisibility(View.GONE);
        }
    }
}
