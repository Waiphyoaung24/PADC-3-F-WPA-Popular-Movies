package xyz.waiphyoag.padc_3_f_wpa_popular_movies.activities.activities.Data.vo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by WaiPhyoAg on 12/21/17.
 */

public class MoviesVO {
    @SerializedName("vote_count")
    private int vote_count;
    private int id;
    private boolean video;
    @SerializedName("vote_average")
    private String vote_average;
    private String title;
    private double popularity;
    @SerializedName("poster_path")

    private String poster_path;
    @SerializedName("original_language")

    private String original_language;
    @SerializedName("original_title")

    private String original_title;
    @SerializedName("genre_ids")

    private List<Integer>genre_id;
    @SerializedName("backdrop_path")

    private String backdrop_path;
    private boolean adult;
    private String overview;
    @SerializedName("release_date")

    private String release_date;

    public int getVote_count() {
        return vote_count;
    }

    public int getId() {
        return id;
    }

    public boolean isVideo() {
        return video;
    }

    public String getVote_average() {
        return vote_average;
    }

    public String getTitle() {
        return title;
    }

    public double getPopularity() {
        return popularity;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public List<Integer> getGenre_id() {
        return genre_id;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public boolean isAdult() {
        return adult;
    }

    public String getOverview() {
        return overview;
    }

    public String getRelease_date() {
        return release_date;
    }
}
