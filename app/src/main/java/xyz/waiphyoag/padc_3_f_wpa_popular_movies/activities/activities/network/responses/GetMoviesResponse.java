package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.network.responses;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.Data.vo.MoviesVO;

/**
 * Created by WaiPhyoAg on 1/5/18.
 */

public class GetMoviesResponse {
    public int code;
    public String message;
    public String apiVersion;
    public String page;
    @SerializedName("popular-movies")
    public List<MoviesVO> movies;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public String getPage() {
        return page;
    }

    public List<MoviesVO> getMovies() {
        return movies;
    }
}
