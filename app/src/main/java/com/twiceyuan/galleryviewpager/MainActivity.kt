package com.twiceyuan.galleryviewpager

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.twiceyuan.galleryviewpager.infiniteViewPager.InfinitePagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager.offscreenPageLimit = 3
        viewPager.adapter = InfinitePagerAdapter(ImagePagerAdapter())
        viewPager.setPageTransformer(true, GalleryTransformer)
    }
}
