package com.example.pr01.ui.theme.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pr01.data.RetrofitClient
import com.example.pr01.data.model.Todo
import kotlinx.coroutines.launch

class TodoViewModel: ViewModel() {
    fun todoUpdate(){
        viewModelScope.launch {
            try{
                val todo = RetrofitClient.todoApi.getTodo(145)
                Log.d("TodoViewModel", "${todo.id}\n${todo.todo}\n${todo.completed}\n${todo.userId}")

                val newTodo = todo.copy(
                    todo = "Пропылесосить ковер",
                    completed = false,
                    userId = 31
                )
                if (newTodo.id != null) {
                    val todoUpdate = RetrofitClient.todoApi.updateTodo(newTodo.id, newTodo)
                    Log.d(
                        "TodoViewModel",
                        "${todoUpdate.id}\n${todoUpdate.todo}\n${todoUpdate.completed}\n${todoUpdate.userId}"
                    )
                }
            } catch (e: Exception){
                Log.e("TodoViewModel",e.message.toString(), e)
            }
        }
    }
}