package com.example.pr01.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.RetrofitClient
import com.example.pr01.data.model.Todo
import kotlinx.coroutines.launch

class TodoViewModel: ViewModel() {
    fun todoUpdate(todo: Todo){
        viewModelScope.launch {
            try{
                val todo = RetrofitClient.todoApi.updateTodo(todo.id, todo)
                Log.d("TodoViewModel", "${todo.id}\n${todo.todo}\n${todo.completed}\n${todo.userId}")
            } catch (e: Exception){
                Log.e("TodoViewModel",e.message.toString(), e)
            }
        }
    }
}