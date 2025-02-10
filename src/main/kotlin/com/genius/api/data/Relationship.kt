package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Relationship(
    @SerializedName("relationship_type") val relationshipType: String,
    @SerializedName("type") val type: String,
    @SerializedName("url") val url: String?,
    @SerializedName("song") val songs: List<Song>
)