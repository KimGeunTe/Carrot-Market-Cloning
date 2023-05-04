package com.example.rabbitmarket.Article

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rabbitmarket.databinding.ArticleItemBinding
import java.text.SimpleDateFormat
import java.util.*

class ArticleAdapter: RecyclerView.Adapter<ArticleAdapter.ViewHolder>() {

    private val items: MutableList<ArticleData.ArticleModel> = mutableListOf()

    inner class ViewHolder(private val binding: ArticleItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(articleModel: ArticleData.ArticleModel) {
            val format = SimpleDateFormat("mm분 전")
            val date = Date(articleModel.article_tv_date)
            binding.articletvNickname.text = articleModel.articletv_nickname
            binding.articleTvDate.text = format.format(date).toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ArticleItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(newItems: List<ArticleData.ArticleModel>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }


}