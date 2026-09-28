package com.example.pr01.data.model

data class User(
    val id: Int,
    val firstName: String,
    val lastName: String,
    val age: Int,
    val phone: String,
    val isDeleted: Boolean = false
)