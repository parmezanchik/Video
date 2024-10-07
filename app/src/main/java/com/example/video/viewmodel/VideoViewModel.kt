package com.example.video.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.video.model.Video
import com.example.video.repository.VideoRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

class VideoViewModel @Inject constructor (private val repository: VideoRepository) : ViewModel() {
    private val _videos = MutableStateFlow<List<Video>>(emptyList())
    val videos: StateFlow<List<Video>> get() = _videos

    init {
        fetchVideos() // Завантажуємо відео при створенні ViewModel
    }

    fun fetchVideos() {
        viewModelScope.launch {
//            val videoList = repository.loadVideos()
//            _videos.value = videoList // Оновлюємо список відео
        }
    }
}
