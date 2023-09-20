package com.example.belajarandroidactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.example.myprojectandorid.R

class countActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count)

        var tvNumber:TextView = findViewById(R.id.tvNumber)
        val btnCount:Button = findViewById(R.id.btnCount)
        var btnMin:Button = findViewById(R.id.btnMin)
        var btnReset:Button = findViewById(R.id.btnReset)



        tvNumber.text = "0"
        println(tvNumber.text)
        Log.d("Number", "Hasilnya : ${tvNumber.text}")

        btnCount.setOnClickListener {
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger ++
            tvNumber.text = countInteger.toString()
        }
        btnMin.setOnClickListener {
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger --
            tvNumber.text = countInteger.toString()
        }
        btnReset.setOnClickListener {
            var countInteger:Int = tvNumber.text.toString().toInt()
            countInteger = 0
            tvNumber.text = countInteger.toString()
        }
    }
}