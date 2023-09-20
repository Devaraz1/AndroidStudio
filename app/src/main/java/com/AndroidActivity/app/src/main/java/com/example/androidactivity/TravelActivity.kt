package com.example.androidactivity

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TravelActivity : AppCompatActivity() {
    var ibCall : ImageButton? = null
    var ibNavigate : ImageButton? = null
    var ibShare : ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel)
        ibCall = findViewById(R.id.ibCall)
        ibNavigate = findViewById(R.id.ibNavigate)
        ibShare = findViewById(R.id.ibShare)

        //setonClickListener
        ibCall!!.setOnClickListener{
            val phoneNumber="0895629630009"
            val phoneIntent = Intent(Intent.ACTION_DIAL,Uri.parse("tel: $phoneNumber"))
            startActivity(phoneIntent)
        }
        ibNavigate?.setOnClickListener{
            val mapIntent = Intent(Intent.ACTION_VIEW,Uri.parse("geo:46.58711587495644, 7.961275397668843"))
            mapIntent.setPackage("com.google.android.apps.maps")
            startActivity(mapIntent)
        }
        ibShare
    }
}