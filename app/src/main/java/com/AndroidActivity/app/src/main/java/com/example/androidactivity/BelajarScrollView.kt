package com.example.androidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import jp.wasabeef.glide.transformations.BlurTransformation

class BelajarScrollView : AppCompatActivity() {
    var ivbg: ImageView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_belajar_scroll_view2)
        ivbg = findViewById(R.id.ivBackground)
        Glide.with(this)
            .load(R.drawable.bgnahimiya)
            .transform(BlurTransformation(23,3))
            .into(ivbg!!)
    }
}