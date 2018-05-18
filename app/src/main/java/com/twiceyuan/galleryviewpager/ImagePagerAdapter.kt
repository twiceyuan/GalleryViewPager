package com.twiceyuan.galleryviewpager

import android.support.v4.view.PagerAdapter
import android.support.v7.widget.AppCompatImageView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout

/**
 * Created by twiceYuan on 9/13/16.
 * Email: i@twiceyuan.com
 * Site: http://twiceyuan.com
 */
class ImagePagerAdapter : PagerAdapter() {

    private var imgRes = intArrayOf(
            R.drawable.img_wallhaven_426244,
            R.drawable.img_wallhaven_431231,
            R.drawable.img_wallhaven_432740,
            R.drawable.img_wallhaven_426244,
            R.drawable.img_wallhaven_431231,
            R.drawable.img_wallhaven_432740,
            R.drawable.img_wallhaven_426244,
            R.drawable.img_wallhaven_431231,
            R.drawable.img_wallhaven_432740
    )

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val view = AppCompatImageView(container.context)
        view.scaleType = ImageView.ScaleType.FIT_XY
        view.adjustViewBounds = true
        view.layoutParams = LinearLayout.LayoutParams(900, 400)
        view.setImageResource(imgRes[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, any: Any) {
        container.removeView(any as View)
    }

    override fun getCount(): Int {
        return imgRes.size
    }

    override fun isViewFromObject(view: View, o: Any): Boolean {
        return view === o
    }
}
