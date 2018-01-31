package com.birjuvachhani.viewpager_intro_slider_example;

/**
 * Created by birju.vachhani on 31/01/18.
 */

public class DataHolder {

    String title;
    String desc;
    int imageId;
    int backgroundColor;

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }

    public int getImageId() {
        return imageId;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public DataHolder(String title, String desc, int imageId, int backgroundColor) {

        this.title = title;
        this.desc = desc;
        this.imageId = imageId;
        this.backgroundColor = backgroundColor;
    }
}
