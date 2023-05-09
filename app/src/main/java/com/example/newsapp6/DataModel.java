package com.example.newsapp6;

public class DataModel {
    private String heading;
    private int image;
    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public DataModel(String heading, int image) {
        this.heading = heading;
        this.image = image;
    }


}
