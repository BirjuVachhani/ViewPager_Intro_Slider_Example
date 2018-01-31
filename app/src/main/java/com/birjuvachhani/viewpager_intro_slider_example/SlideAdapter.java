package com.birjuvachhani.viewpager_intro_slider_example;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;

import java.util.List;

/**
 * Created by birju.vachhani on 31/01/18.
 */

public class SlideAdapter extends FragmentPagerAdapter {

    Context context;
    LayoutInflater inflater;
    List<DataHolder> mlist;

    public SlideAdapter(Context context, List<DataHolder> mlist, android.support.v4.app.FragmentManager fragmentManager) {
        super(fragmentManager);
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.mlist = mlist;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Fragment getItem(int position) {
        DataHolder dataHolder = mlist.get(position);
        return new SlideFragment(dataHolder);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "PAGE " + (position + 1);
    }
}
