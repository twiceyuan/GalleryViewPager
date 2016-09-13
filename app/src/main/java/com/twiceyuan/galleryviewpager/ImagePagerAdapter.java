package com.twiceyuan.galleryviewpager;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by twiceYuan on 9/13/16.
 * Email: i@twiceyuan.com
 * Site: http://twiceyuan.com
 */
public class ImagePagerAdapter extends PagerAdapter {

    int[] imgRes = {
            R.drawable.img_wallhaven_426244,
            R.drawable.img_wallhaven_431231,
            R.drawable.img_wallhaven_432740,
            R.drawable.img_wallhaven_426244,
            R.drawable.img_wallhaven_431231,
            R.drawable.img_wallhaven_432740,
            R.drawable.img_wallhaven_426244,
            R.drawable.img_wallhaven_431231,
            R.drawable.img_wallhaven_432740,
    };

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {
        ImageView view = new ImageView(container.getContext());
        view.setScaleType(ImageView.ScaleType.FIT_XY);
        view.setAdjustViewBounds(true);
        view.setImageResource(imgRes[position]);
        view.setLayoutParams(new LinearLayout.LayoutParams(900, 400));
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }

    @Override
    public int getCount() {
        return imgRes.length;
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view == o;
    }
}
