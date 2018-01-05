package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.Events;

import java.util.List;

import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.Data.vo.MoviesVO;

/**
 * Created by WaiPhyoAg on 1/5/18.
 */

public class LoadedMovieEvent {
    private List<MoviesVO> moviesList;

    public LoadedMovieEvent(List<MoviesVO> moviesList) {
        this.moviesList = moviesList;
    }

    public List<MoviesVO> getMoviesList() {
        return moviesList;
    }
}
