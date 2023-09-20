package com.example.androidactivity

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.ImageButton
import android.widget.ImageView

class OpenCamera : AppCompatActivity() {
    var ibCamera:ImageButton?=null
    var ivSample:ImageView?=null
    val pic_id = 123
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_open_camera)

        ibCamera = findViewById(R.id.ibCamera)
        ivSample = findViewById(R.id.ivSample)
        //Action For Camera Clicking
        ibCamera!!.setOnClickListener{
            intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent,pic_id)
        }
    }
    //New Fungction
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        //if we see the image
        if(requestCode == pic_id){
            //ambil data gambar yang kita capture dan konvert menjadi bitmap
            val photo:Bitmap = data?.extras?.get("data") as Bitmap
            ivSample?.setImageBitmap(photo)
    }
    }
}