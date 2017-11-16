package com.bpl_t.joy.root.bpl.ImageNewsSlider;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bpl_t.joy.root.bpl.R;

import java.util.ArrayList;

/**
 * Created by root on 10/21/17.
 */

public class ImageAdapter extends PagerAdapter {
    private ArrayList<Integer> images;
    private LayoutInflater inflater;
    private Context context;

    public ImageAdapter(ArrayList<Integer> images, Context context) {
        this.images = images;
        inflater = LayoutInflater.from(context);
        this.context = context;
    }

    public ImageAdapter() {

    }

    @Override
    public int getCount() {
     return images.size();
    }

    @Override
    public Object instantiateItem(ViewGroup view, int position) {
        View myImageLayout = inflater.inflate(R.layout.slider_image, view, false);
        ImageView myImage =  myImageLayout.findViewById(R.id.image);
        myImage.setImageResource(images.get(position));
        view.addView(myImageLayout, 0);
        return myImageLayout;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

}
