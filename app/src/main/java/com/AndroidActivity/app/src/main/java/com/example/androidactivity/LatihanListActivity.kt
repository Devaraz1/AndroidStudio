package com.example.androidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class LatihanListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_latihan_list)
        val arrayAdapter : ArrayAdapter <*>
        val language = arrayOf(
            "Pyton", "C++", "Java", "Go Lang", "JavaScript", "Ruby",
            "C#", "SQL Server", "MongoDB", "TypeScript"
        )
        var seelistview: ListView = findViewById(R.id.rvBahasaPemrograman)
        arrayAdapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_activated_1, language)

        seelistview.adapter = arrayAdapter
    }
}