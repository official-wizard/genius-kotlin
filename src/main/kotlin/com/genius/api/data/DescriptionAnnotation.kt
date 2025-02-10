package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class DescriptionAnnotation(
    @SerializedName("type") val type: String,
    @SerializedName("annotator_id") val annotatorId: Long,
    @SerializedName("annotator_long") val annotatorLong: String,
    @SerializedName("api_path") val apiPath: String,
    @SerializedName("classification") val classification: String,
    @SerializedName("fragment") val fragment: String,
    @SerializedName("is_description") val isDescription: Boolean,
    @SerializedName("path") val path: String,
    @SerializedName("range") val range: Range,
    @SerializedName("song_id") val songId: Long?,
    @SerializedName("url") val url: String,
    @SerializedName("verified_annotator_ids") val verifiedAnnotatorIds: List<Long>,
    @SerializedName("annotatable") val annotatable: Annotatable,
    @SerializedName("annotations") val annotations: List<Annotation>,
)