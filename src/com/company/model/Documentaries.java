package com.company.model;

import java.util.Date;

public class Documentaries extends Streaming{

    private String name;

    public Documentaries(int id, Date releaseDate, Integer duration, String name){
        super(id, releaseDate,duration);
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }
}
