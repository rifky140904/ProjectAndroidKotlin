package com.dicoding.submission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailCharacterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_character)

        supportActionBar?.apply {
            title = getString(R.string.detail_string)
        }

        val photo = findViewById<ImageView>(R.id.img_item_photo)
        val name = findViewById<TextView>(R.id.tv_item_name)
        val detail = findViewById<TextView>(R.id.tv_item_detail)

        val intentData = intent
        photo.setImageResource(intentData.getIntExtra("photo", 0))
        name.text = intentData.getStringExtra("name")
        detail.text = intentData.getStringExtra("detail")
    }
}
