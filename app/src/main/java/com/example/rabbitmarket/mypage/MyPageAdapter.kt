package com.example.rabbitmarket.mypage

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.rabbitmarket.R

class MyPageAdapter(idolList: ArrayList<Int>) : RecyclerView.Adapter<MyPageAdapter.PagerViewHolder>() {
    var item = idolList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = PagerViewHolder((parent))

    override fun getItemCount(): Int = item.size

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.idol.setImageResource(item[position])
    }

    inner class PagerViewHolder(parent: ViewGroup) : RecyclerView.ViewHolder
        (LayoutInflater.from(parent.context).inflate(R.layout.profile_item, parent, false)){

        val idol = itemView.findViewById<ImageView>(R.id.imageView_idol)
    }
}