package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Avatar(
    @SerializedName("tiny") val tiny: Details,
    @SerializedName("small") val small: Details,
    @SerializedName("medium") val medium: Details,
    @SerializedName("thumb") val thumb: Details,
) {

    data class Details(
        @SerializedName("url") val url: String,
        @SerializedName("bounding_box") val boundingBox: BoundingBox
    )

    data class BoundingBox(
        @SerializedName("width") val width: Int,
        @SerializedName("height") val height: Int
    )
}