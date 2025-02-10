package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Referent(
    @SerializedName("_type") val type: String,
    @SerializedName("annotator_id") val annotatorId: Long,
    @SerializedName("annotator_login") val annotatorLogin: String,
    @SerializedName("api_path") val apiPath: String,
    @SerializedName("classification") val classification: String,
    @SerializedName("featured") val featured: Boolean,
    @SerializedName("fragment") val fragment: String,
    @SerializedName("id") val id: Long,
    @SerializedName("is_description") val isDescription: Boolean,
    @SerializedName("path") val path: String,
    @SerializedName("song_id") val songId: String?,
    @SerializedName("url") val url: String,
    @SerializedName("range") val range: Range,
    @SerializedName("verified_annotator_ids") val verifiedAnnotatorIds: List<Long>,
    @SerializedName("annotatable") val annotatable: Annotatable,
    @SerializedName("annotations") val annotations: List<Annotation>
)