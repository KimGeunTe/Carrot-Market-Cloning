package com.example.rabbitmarket.MyGps

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rabbitmarket.databinding.MygpsItemBinding

class MyGpsAdapter: RecyclerView.Adapter<MyGpsAdapter.ViewHolder>() {

    private val items: MutableList<MyGpsData.ArticleModel> = mutableListOf()

    inner class ViewHolder(private val binding: MygpsItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(articleModel: MyGpsData.ArticleModel) {
            binding.gpsIvImage.setImageResource(articleModel.gps_iv_image)
            binding.gpsTv.text = articleModel.gps_Tv
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = MygpsItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(newItems: List<MyGpsData.ArticleModel>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }


}
