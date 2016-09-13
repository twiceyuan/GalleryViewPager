package com.twiceyuan.galleryviewpager;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.twiceyuan.galleryviewpager.infiniteViewPager.InfinitePagerAdapter;
import com.twiceyuan.galleryviewpager.infiniteViewPager.InfiniteViewPager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        InfiniteViewPager viewPager = (InfiniteViewPager) findViewById(R.id.id_viewpager);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(new InfinitePagerAdapter(new ImagePagerAdapter()));
        viewPager.setPageTransformer(true, new GalleryTransformer());
    }
}
