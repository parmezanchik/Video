package com.example.video.ui.theme

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items // Необхідно імпортувати items для використання у LazyColumn
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.video.viewmodel.VideoViewModel
import com.example.video.model.Video // Імпортуйте ваш клас Video

@Composable
fun VideoListScreen(viewModel: VideoViewModel = viewModel()) {
    // Отримання списку відео з ViewModel
    val videos by viewModel.videos.collectAsState(initial = emptyList()) // Додаємо значення за замовчуванням

    LaunchedEffect(Unit) {
        viewModel.fetchVideos() // Завантаження відео
    }

    // Відображення списку відео
    LazyColumn {
        items(videos) { video -> // Використовуйте items для LazyColumn
            VideoCard(video) // Створюємо окрему функцію для відеокартки
        }
    }
}

@Composable
fun VideoCard(video: Video) {
    Card(
        modifier = Modifier
            .padding(8.dp)
            .clickable {
                // Навігація на екран плеєра з відео
            }
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = video.title) // Відображення заголовка відео
            // Додайте тут зображення мініатюри, якщо потрібно
        }
    }
}
