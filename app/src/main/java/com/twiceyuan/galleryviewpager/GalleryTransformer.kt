package com.twiceyuan.galleryviewpager

import android.support.v4.view.ViewPager
import android.view.View

object GalleryTransformer : ViewPager.PageTransformer {

    private const val scale = 0.5f

    override fun transformPage(view: View, position: Float) {
        val scaleValue = 1 - Math.abs(position) * scale
        view.scaleX = scaleValue
        view.scaleY = scaleValue
        view.alpha = scaleValue
        view.pivotX = view.width * (1f - position - if (position > 0) 0.75f else -0.75f) * scale
        view.pivotY = view.height / 2f
        view.elevation = 1f - Math.abs(position)
    }
}
