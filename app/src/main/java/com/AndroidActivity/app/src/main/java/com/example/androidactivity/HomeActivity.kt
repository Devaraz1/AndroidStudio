package com.example.androidactivity

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

class HomeActivity : AppCompatActivity() {
    var btnShare:MaterialButton?=null
    var btnNext:MaterialButton?=null
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        btnShare = findViewById(R.id.btnShare)
        btnNext = findViewById(R.id.btnNext)

        btnNext?.setOnClickListener{
            val intent = Intent(this,DetailActivity::class.java)
            startActivity(intent)
        }

        //Action Share
        btnShare?.setOnClickListener{
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_TEXT,"Saya Pesan 1 kopi")
            intent.setType("Text/Plain")
            startActivity(Intent.createChooser(intent,"Share To: "))
        }
    }
}