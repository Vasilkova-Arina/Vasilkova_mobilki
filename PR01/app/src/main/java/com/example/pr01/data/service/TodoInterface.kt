package com.example.pr01.data.service

import com.example.pr01.data.model.Todo
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.PUT
import retrofit2.http.Path

interface TodoInterface {
    @GET("todos/{id}")
    suspend fun getTodo(@Path("id") Todoid: Int): Todo
    @PUT("todos/{id}")
    suspend fun updateTodo(@Path("id") Todoid: Int, @Body todo: Todo): Todo
}