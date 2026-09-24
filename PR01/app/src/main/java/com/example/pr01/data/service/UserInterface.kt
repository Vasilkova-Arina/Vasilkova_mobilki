package com.example.pr01.data.service

import retrofit2.http.GET
import com.example.pr01.data.model.UsersResponse

interface UserInterface {
    @GET("users")
    suspend fun getUsers(): UsersResponse


}