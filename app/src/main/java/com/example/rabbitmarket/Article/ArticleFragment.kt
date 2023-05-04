package com.example.rabbitmarket.Article

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rabbitmarket.R
import com.example.rabbitmarket.chatlist.ChatData
import com.example.rabbitmarket.databinding.FragmentArticleBinding

class ArticleFragment: Fragment(R.layout.fragment_article) {
    private lateinit var binding: FragmentArticleBinding
    private val articleAdapter = ArticleAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val fragmentArticleBinding = FragmentArticleBinding.bind(view)
        binding = fragmentArticleBinding
        binding.rvArticleRecycler.layoutManager = LinearLayoutManager(context)
        binding.rvArticleRecycler.adapter = articleAdapter
        var articleList = mutableListOf<ArticleData.ArticleModel>().apply {
            add(ArticleData.ArticleModel("안녕하세요. 당근마켓의 공지사항입니다.!!",1000))
            add(ArticleData.ArticleModel("반갑습니다. 당근마켓의 이벤트!!!!",1000))
            add(ArticleData.ArticleModel("안녕하세요. 중고물품 판매해요~~!",1000))
            add(ArticleData.ArticleModel("알바 구합니다!! 시급 만원 주 3일!!",1000))
            add(ArticleData.ArticleModel("사기꾼 잡아주세요. (xxx2s)아이디를 가진 물건이 올라온다면 사지마세요!",1000))
            add(ArticleData.ArticleModel("강아지 잃어버리신분 찾아요!! 양림동 휴먼시아에서 발견했어요!~",1000))
            add(ArticleData.ArticleModel("저의 가족 강아지 백구를 찾아요 ㅠㅠ 저번에 백운동 쪽에서 잃어버렸어요 ㅠ",1000))
            add(ArticleData.ArticleModel("안녕하세요. 당근마켓의 공지사항입니다.!!",1000))
            add(ArticleData.ArticleModel("반갑습니다. 당근마켓의 이벤트!!!!",1000))
            add(ArticleData.ArticleModel("안녕하세요. 중고물품 판매해요~~!",1000))
            add(ArticleData.ArticleModel("알바 구합니다!! 시급 만원 주 3일!!",1000))
            add(ArticleData.ArticleModel("사기꾼 잡아주세요. (xxx2s)아이디를 가진 물건이 올라온다면 사지마세요!",1000))
            add(ArticleData.ArticleModel("강아지 잃어버리신분 찾아요!! 양림동 휴먼시아에서 발견했어요!~",1000))
            add(ArticleData.ArticleModel("저의 가족 강아지 백구를 찾아요 ㅠㅠ 저번에 백운동 쪽에서 잃어버렸어요 ㅠ",1000))
            add(ArticleData.ArticleModel("안녕하세요. 당근마켓의 신고방법입니다. 저희 당근마켓은 항상 신뢰가는 거래가 만들어지는 그날까지 힘쓰도록 하겠습니다..!!",1000))
            add(ArticleData.ArticleModel("안녕하세요. 당근마켓의 공지사항입니다.!!",1000))
        }

        articleAdapter.setData(articleList)
    }

}
