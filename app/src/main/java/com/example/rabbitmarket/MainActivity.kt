package com.example.rabbitmarket

import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.fragment.app.Fragment
import com.example.rabbitmarket.Article.ArticleFragment
import com.example.rabbitmarket.MyGps.MyGpsFragment
import com.example.rabbitmarket.chatlist.ChatFragment
import com.example.rabbitmarket.databinding.ActivityMainBinding
import com.example.rabbitmarket.home.HomeFragment
import com.example.rabbitmarket.mypage.MyPageFragment

// app:itemRippleColor="@null"  (클릭전에 글자 가리기)
// app:itemIconTint="@color/selector_menu_color" (클릭 전 후 색깔)

class MainActivity : AppCompatActivity() {

    // 사용자권한설정
    val MY_PERMISSION_ACCESS_ALL = 100

    // 바인딩 전역 변수
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 실행하면 권한이 부여되지 않으면 요청
        if (ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.ACCESS_FINE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
            || ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.ACCESS_COARSE_LOCATION
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            var permissions = arrayOf(
                android.Manifest.permission.ACCESS_FINE_LOCATION,
                android.Manifest.permission.ACCESS_COARSE_LOCATION
            )
            ActivityCompat.requestPermissions(this, permissions, MY_PERMISSION_ACCESS_ALL)
        }

        // bottomNavigationView & Fragment 초기화
        val bottomNavigationView = binding.bottomNavigationView
        val HomeFragment = HomeFragment()
        val Article = ArticleFragment()
        val MyGps = MyGpsFragment()
        val ChatFragment = ChatFragment()
        val MyPageFragment = MyPageFragment()

//         Fragment 연결 (하단메뉴바 클릭시 화면전환)
        bottomNavigationView.setOnItemSelectedListener { MenuItem ->
            when (MenuItem.itemId) {
                R.id.Home -> replaceFragment(HomeFragment)
                R.id.Article -> replaceFragment(Article)
                R.id.MyGps -> replaceFragment(MyGps)
                R.id.Chat -> replaceFragment(ChatFragment)
                R.id.MyPage -> replaceFragment(MyPageFragment)
            }
            true
        }
    }

    // Fragment Manager (프래그먼트매니저/프래그먼트를 교체)
    private fun replaceFragment(fragment: Fragment) {
        Log.d("MainActivity", "${fragment}")
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            commit()
        }
    }

    // 사용자가 권한을 거부(Deny)하면 앱을 종료하도록 처리
    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode === MY_PERMISSION_ACCESS_ALL) {
            if (grantResults.size > 0) {
                for (grant in grantResults) {
                    if (grant != PackageManager.PERMISSION_GRANTED) System.exit(0)
                }
            }

        }
    }
}
