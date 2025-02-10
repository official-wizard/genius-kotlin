package com.genius.api.data

import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class Format(
    @SerializedName("plain") val plain: String?,
    @SerializedName("dom") val dom: JsonElement?,
    @SerializedName("html") val html: String?
)