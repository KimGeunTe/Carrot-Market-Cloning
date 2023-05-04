package com.example.rabbitmarket.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rabbitmarket.R
import com.example.rabbitmarket.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {
    var a = R.drawable.ic_feed_interest_fill_18
    var b = R.drawable.ic_feed_interest_outline_18
    private lateinit var binding: FragmentHomeBinding
    private val articleAdapter = HomeAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentHomeBidning = FragmentHomeBinding.bind(view)
        binding = fragmentHomeBidning
        binding.itemRecyclerView.layoutManager = LinearLayoutManager(context)
        binding.itemRecyclerView.adapter = articleAdapter
        var articleList = mutableListOf<HomeData.ArticleModel>().apply {
            add(HomeData.ArticleModel(R.drawable.img0, "아이폰12", "북구", 1000, "1,000,000원", "거래중", a, "100"))
            add(HomeData.ArticleModel(R.drawable.img1, "맥북프로 16인치", "서구", 3000, "1,950,000원", "판매중", b, "50"))
            add(HomeData.ArticleModel(R.drawable.img2, "드럼세탁기", "남구", 5000, "3,000,000원", "거래완료", b, "30"))
            add(HomeData.ArticleModel(R.drawable.img3, "에어프라이기", "북구", 7000, "110,000원", "거래중", a, "100"))
            add(HomeData.ArticleModel(R.drawable.img4, "책 모음", "서구", 13000, "95,000원", "판매중", a, "50"))
            add(HomeData.ArticleModel(R.drawable.img6, "맥북에어 14인치", "남구", 15000, "1,350,000원", "거래완료", b, "30"))
            add(HomeData.ArticleModel(R.drawable.img7, "아이패드", "북구", 19000, "950,000원", "거래중", a, "100"))
            add(HomeData.ArticleModel(R.drawable.img8, "에어팟 프로", "서구", 20000, "200,000원", "판매중", b, "50"))
            add(HomeData.ArticleModel(R.drawable.img9, "나이키 조던", "남구", 30000, "150,000원", "거래완료", a, "30"))
            add(HomeData.ArticleModel(R.drawable.img10, "나이키 후드집업", "동구", 40000, "95,000원", "판매중", b, "50"))
            add(HomeData.ArticleModel(R.drawable.img11, "나이키 슈트키즈", "동구", 50000, "100,000원", "거래완료", b, "30"))
            add(HomeData.ArticleModel(R.drawable.img1, "맥북프로16인치", "북구", 60000, "1,000,000원", "거래중", b, "100"))
            add(HomeData.ArticleModel(R.drawable.img0, "아이폰12", "서구", 70000, "950,000원", "판매중", a, "50"))
            add(HomeData.ArticleModel(R.drawable.img5, "아이폰13", "동구", 80000, "950,000원", "판매중", b, "50"))
            add(HomeData.ArticleModel(R.drawable.img2, "드럼세탁기", "남구", 90000, "850,000원", "거래완료", b, "30"))
            add(HomeData.ArticleModel(R.drawable.img3, "에어프라이기", "북구", 100000, "1,000,000원", "거래중", a, "100"))
            add(HomeData.ArticleModel(R.drawable.img4, "책모음", "동구", 150000, "950,000원", "판매중", a, "50"))
        }

        articleAdapter.setData(articleList)
    }



}




