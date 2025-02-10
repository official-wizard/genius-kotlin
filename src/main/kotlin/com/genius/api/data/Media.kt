package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Media(
    @SerializedName("provider") val provider: String,
    @SerializedName("start") val start: Int,
    @SerializedName("type") val type: String,
    @SerializedName("url") val url: String
)