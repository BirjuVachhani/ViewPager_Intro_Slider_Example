package com.birjuvachhani.viewpager_intro_slider_example;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.view_pager);

        List<DataHolder> mlist = new ListGenerator(this).generate();

        SlideAdapter adapter = new SlideAdapter(this, mlist, getSupportFragmentManager());

        viewPager.setAdapter(adapter);
    }
}
