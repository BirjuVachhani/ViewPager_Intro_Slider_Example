package com.birjuvachhani.viewpager_intro_slider_example;

import android.content.Context;
import android.graphics.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by birju.vachhani on 31/01/18.
 */

public class ListGenerator {

    String[] titles;
    String[] descriptions;
    int[] colors = {R.color.dark_grey, R.color.red, R.color.dark_purple, R.color.light_blue};
    int[] images = {R.drawable.img1, R.drawable.img2, R.drawable.img3, R.drawable.img4};

    public ListGenerator(Context context) {
        titles = context.getResources().getStringArray(R.array.titles);
        descriptions = context.getResources().getStringArray(R.array.descriptions);
    }

    public List<DataHolder> generate() {
        List<DataHolder> mlist = new ArrayList<>();
        for (int i = 0; i < images.length && i < titles.length && i < descriptions.length && i < colors.length; i++) {
            String title = titles[i];
            String desc = descriptions[i];
            int imageId = images[i];
            int color = colors[i];
            DataHolder dataHolder = new DataHolder(title, desc, imageId, color);
            mlist.add(dataHolder);
        }
        return mlist;
    }
}
