package com.example.rabbitmarket.chatlist

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rabbitmarket.databinding.ChatItemBinding
import java.text.SimpleDateFormat
import java.util.*

class ChatAdapter: RecyclerView.Adapter<ChatAdapter.ViewHolder>() {

    private val items: MutableList<ChatData.ArticleModel> = mutableListOf()

    inner class ViewHolder(private val binding: ChatItemBinding) : RecyclerView.ViewHolder(binding.root) {

        fun bind(articleModel: ChatData.ArticleModel) {
            val format = SimpleDateFormat("mm분 전")
            val date = Date(articleModel.chat_tv_date)
            binding.chatIvPhoto.setImageResource(articleModel.chat_iv_photo)
            binding.chatTvMsg.text = articleModel.chat_tv_msg
            binding.chatTvDate.text = format.format(date).toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ChatItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)

        Log.d("asdf", "onCreateViewHolder()")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setData(newItems: List<ChatData.ArticleModel>) {
        items.clear()
        items.addAll(newItems)
        notifyDataSetChanged()
    }


}
