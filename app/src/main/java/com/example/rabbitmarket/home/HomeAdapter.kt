package com.example.rabbitmarket.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rabbitmarket.databinding.ProductLtemBinding
import java.text.SimpleDateFormat
import java.util.*


class HomeAdapter : RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    private val items: MutableList<HomeData.ArticleModel> = mutableListOf()

    inner class ViewHolder(private val binding: ProductLtemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(articleModel: HomeData.ArticleModel) {
            val format = SimpleDateFormat("mm분 전")
            val date = Date(articleModel.createdAt)
            binding.homeIvProductPic.setImageResource(articleModel.home_iv_product_pic)
            binding.homeTvProductName.text = articleModel.home_tv_name
            binding.createdAt.text = format.format(date).toString()
            binding.homeTvPrice.text = articleModel.home_tv_price
            binding.homeIvInterest.setImageResource(articleModel.home_iv_interest)
            binding.homeTvInterest.text = articleModel.home_tv_interest
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ProductLtemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(newItems: MutableList<HomeData.ArticleModel>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }


}