package com.example.rabbitmarket.home

class HomeData {
    data class ArticleModel(
        var home_iv_product_pic: Int,  // 이미지 home_iv_product_pic
        var home_tv_name: String, // 이름 home_tv_product_name
        var home_tv_address: String, // 지역 home_tv_address
        var createdAt: Long, // 업로드 날짜 createdAt
        var home_tv_price: String, // 가격 home_tv_price
        var sale_complete: String, // 거래완료 & 거래중 sale_complete
        var home_iv_interest: Int, // 좋아요 이미지 home_iv_interest
        var home_tv_interest: String // 좋아요 개수 home_tv_interest
    )
}