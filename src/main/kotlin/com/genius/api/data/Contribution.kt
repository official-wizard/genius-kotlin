package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Contribution(
    @SerializedName("contributions") val contributions: List<String>,
    @SerializedName("artist") val artist: Artist,
    @SerializedName("user") val user: User
)