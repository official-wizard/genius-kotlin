package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Page(
    @SerializedName("api_path") val apiPath: String,
    @SerializedName("domain") val domain: String,
    @SerializedName("id") val id: Long,
    @SerializedName("normalized_url") val normalizedUrl: String,
    @SerializedName("title") val title: String,
    @SerializedName("url") val url: String,
    @SerializedName("annotation_count") val annotationCount: Int
)