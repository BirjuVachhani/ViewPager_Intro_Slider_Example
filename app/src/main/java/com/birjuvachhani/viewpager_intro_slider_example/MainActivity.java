package com.birjuvachhani.viewpager_intro_slider_example;

import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    private ViewPager viewPager;
    private PagerTitleStrip pagerTitleStrip;
    List<DataHolder> mlist = Collections.emptyList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.view_pager);
        pagerTitleStrip = (PagerTitleStrip) findViewById(R.id.title_strip);

        mlist = new ListGenerator(this).generate();

        SlideAdapter adapter = new SlideAdapter(this, mlist, getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        viewPager.setOnPageChangeListener(this);
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        pagerTitleStrip.setTextColor(mlist.get(position).getBackgroundColor());
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
