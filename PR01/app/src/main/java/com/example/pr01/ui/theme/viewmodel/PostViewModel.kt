package com.example.pr01.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.RetrofitClient
import com.example.pr01.data.model.Post
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
    fun createPost(post: Post){
        viewModelScope.launch {
            try{
                val post = RetrofitClient.postApi.addPost(post)
                Log.d("PostViewModel", "${post.id}\n${post.title}\n${post.body}\n${post.tags}\n${post.views}\n${post.userId}")
            }catch (e: Exception){
                Log.e("PostViewModel",e.message.toString(), e)
            }
        }
    }
}