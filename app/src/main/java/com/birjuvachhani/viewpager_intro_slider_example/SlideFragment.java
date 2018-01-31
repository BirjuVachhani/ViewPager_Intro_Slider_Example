package com.birjuvachhani.viewpager_intro_slider_example;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by birju.vachhani on 31/01/18.
 */

public class SlideFragment extends Fragment {

    Context context;
    DataHolder dataHolder;

    public SlideFragment(Context context, DataHolder dataHolder) {
        this.context = context;
        this.dataHolder = dataHolder;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.slide_layout,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        LinearLayout background = (LinearLayout) view.findViewById(R.id.background);
        ImageView mimage = (ImageView) view.findViewById(R.id.image);
        TextView mtitle = (TextView) view.findViewById(R.id.title);
        TextView mdesc = (TextView) view.findViewById(R.id.desc);

        background.setBackgroundColor(dataHolder.getBackgroundColor());
        mimage.setImageResource(dataHolder.getImageId());
        mtitle.setText(dataHolder.getTitle());
        mdesc.setText(dataHolder.getDesc());

    }
}
