package com.developers.siddharth.webservicesassignment192.models;

import java.util.Date;

/**
 * Created by siddharth on 7/19/2017.
 */

public class DataHandler {
    String original_name;
    int vote_count;
    double popularity;

    public String getOriginal_name() {
        return original_name;
    }

    public void setOriginal_name(String original_name) {
        this.original_name = original_name;
    }

    public int getVote_count() {
        return vote_count;
    }

    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public double getPopularity() {
        return popularity;
    }

    public void setPopularity(double popularity) {
        this.popularity = popularity;
    }

   }
