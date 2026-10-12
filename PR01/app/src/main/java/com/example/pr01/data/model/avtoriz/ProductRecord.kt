package com.example.pr01.data.model.avtoriz

data class ProductRecord (
    val items: List<Product>,
    val page: Int? = null,
    val perPage: Int? = null,
    val totalItems: Int? = null,
    val totalPages: Int? = null
)