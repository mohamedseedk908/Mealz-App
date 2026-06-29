package com.ms.mealzapp.di

import com.ms.data.remote.ApiService
import com.ms.data.repo.MealsRepoImpl
import com.ms.domain.repo.MealsRepo
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
object RepoModule {
    @Provides
    fun provideRepo(apiService: ApiService) : MealsRepo {
        return MealsRepoImpl(apiService)
    }
}