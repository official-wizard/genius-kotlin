package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Range(
    @SerializedName("start") val start: String,
    @SerializedName("startOffset") val startOffset: String,
    @SerializedName("end") val end: String,
    @SerializedName("endOffset") val endOffset: String,
    @SerializedName("before") val before: String,
    @SerializedName("after") val after: String,
    @SerializedName("content") val content: String
)