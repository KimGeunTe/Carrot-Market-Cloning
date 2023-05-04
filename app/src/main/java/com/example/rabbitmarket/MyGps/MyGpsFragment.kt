package com.example.rabbitmarket.MyGps

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.rabbitmarket.R
import com.example.rabbitmarket.databinding.FragmentMygpsBinding

class MyGpsFragment: Fragment(R.layout.fragment_mygps) {
    private lateinit var binding: FragmentMygpsBinding
    private val articleAdapter = MyGpsAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentmygpsBidning = FragmentMygpsBinding.bind(view)
        binding = fragmentmygpsBidning
        binding.itemRecyclerGps.layoutManager = GridLayoutManager(context,4)
        binding.itemRecyclerGps.adapter = articleAdapter
        var articleList = mutableListOf<MyGpsData.ArticleModel>().apply {
            add(MyGpsData.ArticleModel(R.drawable.category_icon1, "전자제품"))
            add(MyGpsData.ArticleModel(R.drawable.category_icon2, "가구"))
            add(MyGpsData.ArticleModel(R.drawable.category_icon5, "여성의류"))
            add(MyGpsData.ArticleModel(R.drawable.category_icon7, "화장품"))
            add(MyGpsData.ArticleModel(R.drawable.category_icon9, "스포츠용품"))
            add(MyGpsData.ArticleModel(R.drawable.category_icon11, "책"))
            add(MyGpsData.ArticleModel(R.drawable.category_icon13, "고객센터"))
        }

        articleAdapter.setData(articleList)
    }
}