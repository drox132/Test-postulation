package com.company.model;

import java.util.Date;

public class Film extends Streaming {
    private boolean oscar;


    public Film (int id, Date releaseDate,Integer duration, boolean oscar){
        super(id, releaseDate, duration);
        this.oscar=oscar;

    }

    public boolean isOscar() {
        return oscar;
    }

    public void setOscar(boolean oscar) {
        this.oscar = oscar;
    }
}
