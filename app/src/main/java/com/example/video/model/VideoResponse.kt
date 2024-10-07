package com.example.video.model

import com.google.gson.annotations.SerializedName

data class VideoResponse(

	@field:SerializedName("categories")
	val categories: List<CategoriesItem?>? = null
)

data class VideosItem(

	@field:SerializedName("sources")
	val sources: List<String?>? = null,

	@field:SerializedName("thumb")
	val thumb: String? = null,

	@field:SerializedName("subtitle")
	val subtitle: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("title")
	val title: String? = null
)

data class CategoriesItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("videos")
	val videos: List<VideosItem?>? = null
)
