package com.example.pr01.usersmodel

import com.example.pr01.usersmodel.service.PostInterface
import com.example.pr01.usersmodel.service.UserInterface
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.InetSocketAddress
import java.net.Proxy

object RetrofitClient {
    val proxy = Proxy(Proxy.Type.HTTP, InetSocketAddress("10.207.106.59", 3128))
    val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }
    val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .proxy(proxy)
        .build()
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://dummyjson.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val UserApi: UserInterface = retrofit.create(UserInterface::class.java)
    val PostApi: PostInterface = retrofit.create(PostInterface::class.java)
}