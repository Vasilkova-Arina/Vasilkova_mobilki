package com.example.pr01.data.service

import com.example.pr01.data.model.User
import retrofit2.http.GET
import com.example.pr01.data.model.UsersResponse
import retrofit2.http.DELETE
import retrofit2.http.Path

interface UserInterface {
    @GET("users")
    suspend fun getUsers(): UsersResponse

    @DELETE("users/{id}")
    suspend fun deleteUser(@Path("id") UserId: Int): User

}