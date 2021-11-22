package com.company.model;

import java.util.Date;

public class Streaming {

    private int id;
    private Date releaseDate;
    private Integer duration;

    public Streaming (){};

    public Streaming (int id, Date releaseDate, Integer duration){
        this.id=id;
        this.releaseDate=releaseDate;
        this.duration=duration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getReleaseDate (){
        return releaseDate;
    };

    public void setReleaseDate (Date releaseDate){
        this.releaseDate=releaseDate;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

}
