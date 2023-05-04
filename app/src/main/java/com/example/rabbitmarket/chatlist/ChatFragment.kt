package com.example.rabbitmarket.chatlist

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.os.Build
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat.getSystemService
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.rabbitmarket.R
import com.example.rabbitmarket.databinding.FragmentChatBinding

class ChatFragment: Fragment(R.layout.fragment_chat) {
    private lateinit var binding: FragmentChatBinding
    private val articleAdapter = ChatAdapter()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        // 알람구현(진행중)
//        var button = binding.btnChat
//        button.setOnClickListener {
//            var builder = NotificationCompat.Builder(this,"당근마켓")
//                .setSmallIcon(R.drawable.ic_launcher_background)
//                .setContentTitle("알림 제목")
//                .setContentText("알림 내용")
//
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) { // 오레오 버전 이후에는 알림을 받을 때 채널이 필요
//                val channel_id = "MY_channel" // 알림을 받을 채널 id 설정
//                val channel_name = "채널이름" // 채널 이름 설정
//                val descriptionText = "설명글" // 채널 설명글 설정
//                val importance = NotificationManager.IMPORTANCE_DEFAULT // 알림 우선순위 설정
//                val channel = NotificationChannel(channel_id, channel_name, importance).apply {
//                    description = descriptionText
//                }
//
//                // 만든 채널 정보를 시스템에 등록
//                val notificationManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
//                notificationManager.createNotificationChannel(channel)
//
//                // 알림 표시: 알림의 고유 ID(ex: 1002), 알림 결과
//                notificationManager.notify(1002, builder.build())
//            }
//        }


        val fragmentChatBinding = FragmentChatBinding.bind(view)
        binding = fragmentChatBinding
        binding.rvRecyclerChat.layoutManager = LinearLayoutManager(context)
        binding.rvRecyclerChat.adapter = articleAdapter
        var articleList = mutableListOf<ChatData.ArticleModel>().apply {
            add(ChatData.ArticleModel(R.drawable.splash_symbol, "안녕하세요.",1000))
            add(ChatData.ArticleModel(R.drawable.splash_symbol, "저희 당근마켓을 이용해 주셔서 감사드립니다.",2000))
            add(ChatData.ArticleModel(R.drawable.splash_symbol, "현재 당근마켓에서는 신규고객님을 위한",3000))
            add(ChatData.ArticleModel(R.drawable.splash_symbol, "이벤트가 진행 중 입니다.",4000))
            add(ChatData.ArticleModel(R.drawable.splash_symbol, "자세한 이벤트 내용은",5000))
            add(ChatData.ArticleModel(R.drawable.splash_symbol, "공지사항으로 확인 바랍니다.",6000))
        }

        articleAdapter.setData(articleList)
    }



}