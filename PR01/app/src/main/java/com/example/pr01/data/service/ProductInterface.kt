package com.example.pr01.data.service

import com.example.pr01.data.model.UsersResponse
import com.example.pr01.data.model.avtoriz.ProductRecord
import com.example.pr01.data.model.avtoriz.Profile
import retrofit2.http.GET
import retrofit2.http.Header

interface ProductInterface {
    @GET("products/records")
    suspend fun getCurrentProduct(@Header("Avtorization") token: String): ProductRecord
}