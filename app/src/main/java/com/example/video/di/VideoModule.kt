package com.example.video.di

import android.content.Context
import com.example.video.database.VideoDatabase
import com.example.video.dao.VideoDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object VideoModule {

    @Provides
    @Singleton
    fun provideDatabase(context: Context): VideoDatabase {
        return VideoDatabase.getDatabase(context)
    }

    @Provides
    fun provideVideoDao(database: VideoDatabase): VideoDao {
        return database.videoDao()
    }
}
