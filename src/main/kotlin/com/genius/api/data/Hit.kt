package com.genius.api.data

import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class Hit(
    @SerializedName("highlights") val highlights: List<JsonElement>, // ??
    @SerializedName("index") val index: String,
    @SerializedName("type") val type: String,
    @SerializedName("result") val result: Song
)