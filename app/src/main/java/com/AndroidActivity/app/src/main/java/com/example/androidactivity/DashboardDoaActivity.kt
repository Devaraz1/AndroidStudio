package com.example.androidactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidactivity.adapter.DoaAdapter
import com.example.androidactivity.adapter.LanguageAdapter
import com.example.androidactivity.model.Doa

class DashboardDoaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_doa)
        val pilihanDoa : RecyclerView =
            findViewById(R.id.pilihanDoa)
        val data = arrayListOf<Doa>(
            Doa("Dzikir Dan Doa Sunah Sesudah Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2),
            Doa("Dzikir Dan Doa Sunah Sesudah Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2),
            Doa("Dzikir Dan Doa Sunah Sesudah Sholat",R.drawable.doa_harian2),
            Doa("Dzikir Harian",R.drawable.doa_harian2),
        )
        val more:CardView =
            findViewById(R.id.more)

        val adapter = DoaAdapter(data)
        pilihanDoa.adapter=adapter
        pilihanDoa.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        more.setOnClickListener{
            val intent =
                Intent(this,com.example.androidactivity.DoaHarianActivity::class.java)
            startActivity(intent)
        }
    }
    }