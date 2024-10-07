package com.example.video.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "videos")
data class Video(
    @PrimaryKey val id: Int,
    val title: String,
    val url: String
)
