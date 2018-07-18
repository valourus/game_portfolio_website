package com.valourus.portfolio.apimodels;

import java.sql.Blob;

public class Image {

    private int id;
    private Blob image;

    public void setImage(Blob image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public Blob getImage() {
        return image;
    }
}
