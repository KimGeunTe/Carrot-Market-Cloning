package com.example.rabbitmarket.mypage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.rabbitmarket.R
import com.example.rabbitmarket.databinding.FragmentProfileBinding

class MyPageFragment: Fragment(R.layout.fragment_profile) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    // 광고 배너
        val vvPager2 =  FragmentProfileBinding.bind(view)
        vvPager2.vPager2.adapter = MyPageAdapter(getIdolList()) // 어댑터 생성
        vvPager2.vPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL // 방향을 가로로
    }
    // 뷰 페이저에 들어갈 아이템
    private fun getIdolList(): ArrayList<Int> {
        return arrayListOf(R.drawable.roimg0, R.drawable.roimg1, R.drawable.roimg2)
    }
}


