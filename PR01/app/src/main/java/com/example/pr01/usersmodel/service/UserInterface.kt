package com.example.pr01.usersmodel.service

import com.example.pr01.usersmodel.Post
import retrofit2.http.GET
import com.example.pr01.usersmodel.UsersResponse
import retrofit2.http.Body
import retrofit2.http.POST

interface UserInterface {
    @GET("users")
    suspend fun getUsers(): UsersResponse


}