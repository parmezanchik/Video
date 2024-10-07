package com.example.video.network


import com.example.video.model.Video
import retrofit2.http.GET

interface VideoApi {
    @GET("path/to/your/videos.json")
    suspend fun getVideos(): List<Video>
}