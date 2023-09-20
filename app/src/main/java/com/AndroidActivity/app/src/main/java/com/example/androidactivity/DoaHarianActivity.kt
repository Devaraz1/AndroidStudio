package com.example.androidactivity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.androidactivity.adapter.DoaHarianAdapter
import com.example.androidactivity.model.DoaHarian

class DoaHarianActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doa_harian)
        val rvDoaHarian: RecyclerView = findViewById(R.id.rvDoaHarian)
        val data = arrayListOf<DoaHarian>(
            DoaHarian("Doa Sebelum Makan","اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ","Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar"),
            DoaHarian("Doa Sesudah Makan","اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنَ","Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin"),
            DoaHarian("Doa Sesudah  Minum","اَلْحَمْدُ ِللهِ الَّذِىْ جَعَلَهُ عَذْبًا فُرَاتًا بِرَحْمَتِهِ وَلَمْ يَجْعَلْهُ مِلْحًا اُجَاجًا بِذُنُوْبِنَا","Alhamdu lillaahil ladzi ja'alahuu 'adzbam furootam birohmatihii wa lamyaj'alhu milhan ujaajam bidzunuubinaa"),
            DoaHarian("Doa Ketika Makan Lupa Membaca Doa","بِسْمِ اللهِ فِىِ أَوَّلِهِ وَآخِرِهِ","Bismillaahi fii awwalihi wa aakhirihi")
        )
        val adapter = DoaHarianAdapter(data)
        rvDoaHarian.adapter = adapter
        rvDoaHarian.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
    }
}