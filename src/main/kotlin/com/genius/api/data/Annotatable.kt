package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Annotatable(
    @SerializedName("api_path") val apiPath: String,
    @SerializedName("context") val context: String,
    @SerializedName("id") val id: Long,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("link_title") val linkTitle: String,
    @SerializedName("title") val title: String,
    @SerializedName("type") val type: String,
    @SerializedName("url") val url: String
)