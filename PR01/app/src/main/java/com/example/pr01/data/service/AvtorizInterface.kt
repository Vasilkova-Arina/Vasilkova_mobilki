package com.example.pr01.data.service

import com.example.pr01.data.model.avtoriz.LoginRequest
import com.example.pr01.data.model.avtoriz.Profile
import com.example.pr01.data.model.avtoriz.Response
import retrofit2.http.Body
import retrofit2.http.POST


interface AvtorizInterface {
    @POST("users/auth-with-password")
    suspend fun login(@Body loginRequest: LoginRequest): Response
}