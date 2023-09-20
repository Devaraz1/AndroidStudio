package com.example.androidactivity

import android.annotation.SuppressLint
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class Count : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_count2)

        var inputAngka1:EditText = findViewById(R.id.inputAngka1)
        var inputAngka2:EditText = findViewById(R.id.inputAngka2)
        val btnTambah:Button = findViewById(R.id.btnTambah)
        val btnKurang:Button = findViewById(R.id.btnKurang)
        val btnModulus:Button = findViewById(R.id.btnModulus)
        val btnKali:Button = findViewById(R.id.btnKali)
        val btnBagi:Button = findViewById(R.id.btnBagi)
        val btnClear:Button = findViewById(R.id.btnClear)
        val tvhasil:TextView = findViewById(R.id.hasil)

        val  builder: AlertDialog.Builder = AlertDialog.Builder(this@Count)

        btnTambah.setOnClickListener{
            val hasilTambah = inputAngka1.text.toString().toInt() + inputAngka2.text.toString().toInt()
            tvhasil.text = hasilTambah.toString()
        }
        btnKurang.setOnClickListener{
            val hasilKurang = inputAngka1.text.toString().toInt() - inputAngka2.text.toString().toInt()
            tvhasil.text = hasilKurang.toString()
        }
        btnModulus.setOnClickListener{
            val hasilModulus = inputAngka1.text.toString().toInt() % inputAngka2.text.toString().toInt()
            tvhasil.text = hasilModulus.toString()
        }
        btnKali.setOnClickListener{
            val hasilKali = inputAngka1.text.toString().toInt() * inputAngka2.text.toString().toInt()
            tvhasil.text = hasilKali.toString()
        }
        btnBagi.setOnClickListener{
            val hasilBagi = inputAngka1.text.toString().toInt() / inputAngka2.text.toString().toInt()
            tvhasil.text = hasilBagi.toString()
        }
        btnClear.setOnClickListener{
            builder.setTitle("Perhatian!")
            builder.setTitle("Anda Yakin Ingin Menghapus Semua Data?!")
            builder.setCancelable(false)

            builder.setPositiveButton("Yes",DialogInterface.OnClickListener{dialog, which ->
                inputAngka1.setText("")
                inputAngka2.setText("")
                tvhasil.text = "0"
            })

            builder.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
            })

            val  alertDialog:AlertDialog = builder.create()

            alertDialog.show()
        }
    }
}