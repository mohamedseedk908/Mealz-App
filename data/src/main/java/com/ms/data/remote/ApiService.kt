package com.ms.data.remote

import com.ms.domain.entity.CategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
    fun getMeals(): CategoryResponse
}