package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Translation(
    @SerializedName("api_path") val apiPath: String,
    @SerializedName("id") val id: Long,
    @SerializedName("language") val language: String,
    @SerializedName("lyrics_state") val lyricsState: String,
    @SerializedName("path") val path: String,
    @SerializedName("title") val title: String,
    @SerializedName("url") val url: String
)