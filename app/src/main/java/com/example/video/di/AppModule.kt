package com.example.video.di

import android.app.Application
import android.content.Context
import com.example.video.dao.VideoDao
import com.example.video.database.VideoDatabase
import com.example.video.network.VideoApi
import com.example.video.network.RetrofitInstance
import com.example.video.repository.VideoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideVideoApi(): VideoApi {
        return RetrofitInstance.api
    }

    @Provides
    @Singleton
    fun provideVideoDatabase(application: Application): VideoDatabase {
        return VideoDatabase.getDatabase(application)
    }

    @Provides
    @Singleton
    fun provideVideoRepository(application: Application): VideoRepository {
        return VideoRepository(application)
    }
}