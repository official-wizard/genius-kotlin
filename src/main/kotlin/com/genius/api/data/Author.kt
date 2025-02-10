package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Author(
    @SerializedName("attribution") val attribution: Double,
    @SerializedName("pinned_role") val pinnedRole: String?,
    @SerializedName("user") val user: User
)