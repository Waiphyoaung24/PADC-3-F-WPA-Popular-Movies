package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.Data.vo.Model;

import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.network.HttpUrlConnectionDataAgent;
import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.network.MoviesDataAgent;

/**
 * Created by WaiPhyoAg on 1/5/18.
 */

public class MoviesModel {
    private static MoviesModel sObjInstance;
    private MoviesDataAgent mDataAgent;

    private MoviesModel()
    {
            mDataAgent= HttpUrlConnectionDataAgent.getsObjInstance();
    }
    public static MoviesModel getsObjInstance()
    {
        if (sObjInstance==null)
        {
            sObjInstance=new MoviesModel();
        }
        return sObjInstance;
    }

    public void loadMovies()

    {
        mDataAgent.loadMovies();
    }
}

