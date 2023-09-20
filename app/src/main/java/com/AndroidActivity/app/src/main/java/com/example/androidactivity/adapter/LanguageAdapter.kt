package com.example.androidactivity.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.androidactivity.R
import com.example.androidactivity.model.Language

class LanguageAdapter(val data: ArrayList<Language>)
    : RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder>()
{
    class LanguageViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvBahasaPemrograman: TextView = view.findViewById(R.id.tvBahasaPemrograman)
        val ivBahasaPemrograman: ImageView = view.findViewById(R.id.ivBahasaPemrograman)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LanguageViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_bahasa_pemrograman2,parent,false)
        return LanguageViewHolder(view)
    }

    override fun onBindViewHolder(holder: LanguageViewHolder, position: Int) {
        val item = data.get(position)
        //Isi data dari model ke masing masing view
        holder.tvBahasaPemrograman.text = item.name
        holder.ivBahasaPemrograman.setImageResource(item.image)
    }

    override fun getItemCount(): Int = data.size

}