package com.ms.data.repo
import com.ms.data.remote.ApiService
import com.ms.domain.entity.CategoryResponse
import com.ms.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService: ApiService) : MealsRepo {
    override fun getMealsFromRemote(): CategoryResponse =
        apiService.getMeals()
}