package com.example.pr01.ui.theme.viewmodel

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.usersmodel.RetrofitClient
import com.example.pr01.usersmodel.service.UserAdd
import kotlinx.coroutines.launch

class UserViewModel: ViewModel() {
    fun fetch(){
        viewModelScope.launch {
            try{
                val userResponse = RetrofitClient.UserApi.getUsers()
                val users = userResponse.users
                for (user in users) {
                    Log.d(TAG, "${user}")
                }
            } catch (e: Exception){
                Log.e(TAG, "${e.message}", e)
            }
        }
    }

    fun userTask(user: UserAdd){
        viewModelScope.launch {
            try{
                val userAdd = RetrofitClient.UserApi.addUsers(user)
                Log.d("UserViewModel", user.toString())
            }catch (e: Exception){
                Log.e("UserViewModel",e.message.toString(), e)
            }
        }
    }
}