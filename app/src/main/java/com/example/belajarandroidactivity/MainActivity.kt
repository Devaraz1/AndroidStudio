package com.example.belajarandroidactivity

import android.app.Dialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import com.example.myprojectandorid.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var angkaSatu: EditText = findViewById(R.id.inputSatu)
        var angkaDua: EditText = findViewById(R.id.inputDua)
        val btnPlus = findViewById<TextView>(R.id.plus)
        val btnMinus: TextView = findViewById(R.id.minus)
        val btnCross: TextView = findViewById(R.id.cross)
        val btnDivide: TextView = findViewById(R.id.divide)
        val btnPersen:TextView = findViewById(R.id.btnPersen)
        val clear:TextView = findViewById(R.id.clear)
        var woi: TextView = findViewById(R.id.hasil)
        val builder:AlertDialog.Builder = AlertDialog.Builder(this@MainActivity)


        btnPlus.setOnClickListener{
            val kode1:Int = angkaSatu.text.toString().toInt()
            val kode2:Int = angkaDua.text.toString().toInt()
            var hasil:Int
            var wey:String
            hasil = kode1 + kode2
            woi.text = hasil.toString()
        }
        btnMinus.setOnClickListener{
            val kode1:Int = angkaSatu.text.toString().toInt()
            val kode2:Int = angkaDua.text.toString().toInt()
            var hasil:Int
            var wey:String
            hasil = kode1 - kode2
            woi.text = hasil.toString()
        }
        btnCross.setOnClickListener{
            val kode1:Int = angkaSatu.text.toString().toInt()
            val kode2:Int = angkaDua.text.toString().toInt()
            var hasil:Int
            var wey:String
            hasil = kode1 * kode2
            woi.text = hasil.toString()
        }
        clear.setOnClickListener{
            builder.setTitle("Perhatian!")
            builder.setMessage("Kamu yakin untuk mengclear?")
            builder.setCancelable(false)
            builder.setIcon(R.drawable.baseline_info_24)
            builder.setPositiveButton("Yes" , DialogInterface.OnClickListener { dialog, which ->
                woi.text = "0"
                angkaSatu.setText("")
                angkaDua.setText("")
            })
            builder.setNegativeButton("No", DialogInterface.OnClickListener { dialog, which ->  })
            val alertDialog:AlertDialog = builder.create()
            alertDialog.show()
        }
        btnDivide.setOnClickListener{
            val kode1:Int = angkaSatu.text.toString().toInt()
            val kode2:Int = angkaDua.text.toString().toInt()
            var hasil:Float
            var wey:String
            hasil = kode1.toFloat() / kode2.toFloat()
            woi.text = hasil.toString()
        }
        btnPersen.setOnClickListener{
            val kode1:Int = angkaSatu.text.toString().toInt()
            val kode2:Int = angkaDua.text.toString().toInt()
            var hasil:Float
            var wey:String
            hasil = kode1.toFloat() % kode2.toFloat()
            woi.text = hasil.toString()
        }
    }
}