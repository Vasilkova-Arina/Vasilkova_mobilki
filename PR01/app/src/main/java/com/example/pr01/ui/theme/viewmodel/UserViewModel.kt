package com.example.pr01.ui.theme.viewmodel

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.RetrofitClient
import kotlinx.coroutines.launch

class UserViewModel: ViewModel() {
    fun fetch(){
        viewModelScope.launch {
            try{
                val userResponse = RetrofitClient.userApi.getUsers()
                val users = userResponse.users
                for (user in users) {
                    Log.d("UserViewModel", "${user.id}\n${user.firstName}\n${user.lastName}\n${user.age}\n${user.phone}")
                }
            } catch (e: Exception){
                Log.e(TAG, "${e.message}", e)
            }
        }
    }


}