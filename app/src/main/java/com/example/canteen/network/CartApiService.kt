package com.example.canteen.network

import com.example.canteen.models.Cart
import com.example.canteen.responses.BaseResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CartApiService {
    @GET("cart/{userid}")
    fun getAllCarts(@Path("userid") userId: String): Call<BaseResponse<List<Cart>>>
}