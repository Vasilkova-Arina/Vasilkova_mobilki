package com.example.pr01.usersmodel.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.usersmodel.Post
import com.example.pr01.usersmodel.RetrofitClient
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
    fun createPost(post: Post){
        viewModelScope.launch {
            try{
                val post = RetrofitClient.PostApi.addPost(post)
                Log.d("PostViewModel", post.toString())
            }catch (e: Exception){
                Log.e("PostViewModel",e.message.toString(), e)
            }
        }
    }
}