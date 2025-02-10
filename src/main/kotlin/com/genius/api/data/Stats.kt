package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("accepted_annotations") val acceptedAnnotations: Int,
    @SerializedName("contributors") val contributors: Int,
    @SerializedName("iq_earners") val iqEarners: Int,
    @SerializedName("transcribers") val transcribers: Int,
    @SerializedName("unreviewed_annotations") val unreviewedAnnotations: Int,
    @SerializedName("verified_annotations") val verifiedAnnotations: Int,
    @SerializedName("concurrents") val concurrents: Int,
    @SerializedName("hot") val hot: Boolean,
    @SerializedName("page_views") val pageViews: Long
)