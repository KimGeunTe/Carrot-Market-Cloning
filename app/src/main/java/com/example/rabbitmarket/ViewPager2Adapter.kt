package com.example.rabbitmarket

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.rabbitmarket.Article.ArticleFragment
import com.example.rabbitmarket.MyGps.MyGpsFragment
import com.example.rabbitmarket.chatlist.ChatFragment
import com.example.rabbitmarket.home.HomeFragment
import com.example.rabbitmarket.mypage.MyPageFragment

//ViewPager2Adapter.kt
class ViewPager2Adapter(fragment : FragmentActivity) : FragmentStateAdapter(fragment){
    override fun getItemCount(): Int = 6

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> ArticleFragment()
            2 -> MyGpsFragment()
            3 -> ChatFragment()
            4 -> MyPageFragment()
            else -> HomeFragment()
        }
    }
}