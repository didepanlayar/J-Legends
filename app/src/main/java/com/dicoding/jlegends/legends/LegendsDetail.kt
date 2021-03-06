package com.dicoding.jlegends.legends

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.jlegends.R

class LegendsDetail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_legends_detail)

        val actionbar = supportActionBar
        actionbar!!.title = "Detail"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvSetName: TextView = findViewById(R.id.tv_set_name)
        val imgSetPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvSetInfo: TextView = findViewById(R.id.tv_set_detail)
        val tvOverview: TextView = findViewById(R.id.tv_set_overview)

        val tName = intent.getStringExtra(EXTRA_NAME)
        val tImg = intent.getIntExtra(EXTRA_PHOTO, 0)
        val tDetail = intent.getStringExtra(EXTRA_DETAIL)
        val tOverView = intent.getStringExtra(EXTRA_OVERVIEW)

        tvSetName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgSetPhoto)
        tvSetInfo.text = tDetail
        tvOverview.text = tOverView
    }

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_OVERVIEW = "extra_overview"
        const val EXTRA_POSITION = "extra_position"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()

        return true
    }

}