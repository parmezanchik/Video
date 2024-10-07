package com.example.video.repository

import android.content.Context
import com.example.video.model.Video
import com.example.video.model.VideoResponse
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.BufferedReader
import java.io.InputStreamReader
import javax.inject.Inject

class VideoRepository @Inject constructor (private val context: Context) {
    private val gson = Gson()

    fun loadVideos(): VideoResponse {
        val inputStream = context.assets.open("videos.json")
        val reader = BufferedReader(InputStreamReader(inputStream))
        val type = object : TypeToken<VideoResponse>() {}.type
        return gson.fromJson(reader, type)
    }
}
