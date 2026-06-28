package com.ms.domain.repo

import com.ms.domain.entity.CategoryResponse

interface MealsRepo {
    fun getMealsFromRemote() : CategoryResponse
}