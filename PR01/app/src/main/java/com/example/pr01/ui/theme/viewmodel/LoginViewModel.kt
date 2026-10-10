package com.example.pr01.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.RetrofitClient
import com.example.pr01.data.model.avtoriz.LoginRequest
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {
    fun login(loginRequest: LoginRequest){
        viewModelScope.launch {
            try {
                val avtorizUser = RetrofitClient.authApi.login(loginRequest)
                Log.d("LoginViewModel", "Records: ${avtorizUser.token}\n ${avtorizUser.record}")
                val product = RetrofitClient.productApi.getCurrentProduct("${avtorizUser.token}")
                Log.d("LoginViewModel",
                    "${product.items}\n" +
                            "${product.page}" +
                            "${product.perPage}\n" +
                            "${product.totalPages}\n" +
                            "${product.totalItems}")
            } catch (ex: Exception){
                Log.e("LoginViewModel",ex.message.toString(), ex)
            }
        }
    }
}