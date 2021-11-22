package com.company.model;

import java.util.Date;

public class Series extends Streaming{

    private int seasons;

    public Series(int id, Date releaseDate, Integer duration, int seasons){
        super(id, releaseDate,duration);
        this.seasons=seasons;
    }

    public int getSeasons(){
        return seasons;
    }
    public void setSeasons(int seasons){
        this.seasons=seasons;
    }
}
