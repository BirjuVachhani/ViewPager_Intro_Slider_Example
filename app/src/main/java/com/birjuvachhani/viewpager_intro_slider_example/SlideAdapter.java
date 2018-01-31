package com.birjuvachhani.viewpager_intro_slider_example;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by birju.vachhani on 31/01/18.
 */

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;
    List<DataHolder> mlist;

    public SlideAdapter(Context context, List<DataHolder> mlist) {
        this.context = context;
        inflater = LayoutInflater.from(context);
        this.mlist = mlist;
    }

    @Override
    public int getCount() {
        return mlist.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = inflater.inflate(R.layout.slide_layout, container, false);
        DataHolder dataHolder = mlist.get(position);

        LinearLayout background = (LinearLayout) view.findViewById(R.id.background);
        ImageView mimage = (ImageView) view.findViewById(R.id.image);
        TextView mtitle = (TextView) view.findViewById(R.id.title);
        TextView mdesc = (TextView) view.findViewById(R.id.desc);

        background.setBackgroundColor(dataHolder.getBackgroundColor());
        mimage.setImageResource(dataHolder.getImageId());
        mtitle.setText(dataHolder.getTitle());
        mdesc.setText(dataHolder.getDesc());

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }
}
