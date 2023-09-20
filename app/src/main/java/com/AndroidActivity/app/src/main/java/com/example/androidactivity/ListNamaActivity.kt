package com.example.androidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class ListNamaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_nama)
        val arrayAdapter:ArrayAdapter<*>
        val users = arrayOf(
            "Steve Smith", "Ross Taylor", "Rohit Sharma"
        )
//        deklarasi variable list view
        var mListView: ListView = findViewById(R.id.lvNama)
//        panggil object array (this, layout_sample, data)
        arrayAdapter = ArrayAdapter(this,
        android.R.layout.simple_list_item_activated_1, users)
//        isi adapter
        mListView.adapter = arrayAdapter
    }
}