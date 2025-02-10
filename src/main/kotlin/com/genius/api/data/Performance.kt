package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Performance(
    @SerializedName("label") val label: String,
    @SerializedName("artists") val artists: List<Artist>
)