package com.example.pr01.usersmodel.service

import com.example.pr01.usersmodel.Post
import retrofit2.http.Body
import retrofit2.http.POST

interface PostInterface {
    @POST("posts/add")
    suspend fun addPost(@Body post: Post): Post
}