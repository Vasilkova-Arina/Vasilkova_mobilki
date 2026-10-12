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
                Log.d("LoginViewModel", "Token: ${avtorizUser.token}\n Record: ${avtorizUser.record}")
                val product = RetrofitClient.productApi.getCurrentProduct("${avtorizUser.token}")
                val items = product.items
                for (item in items){
                    Log.d("LoginViewModel", "${item.id}\n" +
                            "${item.title}\n" +
                            "${item.price}\n" +
                            "${item.created}\n" +
                            "${item.updated}")
                }
                Log.d("LoginViewModel",
                            "${product.page}\n" +
                            "${product.perPage}\n" +
                            "${product.totalPages}\n" +
                            "${product.totalItems}")
            } catch (ex: Exception){
                Log.e("LoginViewModel",ex.message.toString(), ex)
            }
        }
    }
}