package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Annotation(
    @SerializedName("api_path") val apiPath: String,
    @SerializedName("body") val body: Format,
    @SerializedName("comment_count") val commentCount: Int,
    @SerializedName("community") val community: Boolean,
    @SerializedName("custom_preview") val customPreview: String?,
    @SerializedName("has_voters") val hasVoters: Boolean,
    @SerializedName("id") val id: Long,
    @SerializedName("pinned") val pinned: Boolean,
    @SerializedName("share_url") val shareUrl: String,
    @SerializedName("source") val source: String?,
    @SerializedName("state") val state: String,
    @SerializedName("url") val url: String,
    @SerializedName("verified") val verified: Boolean,
    @SerializedName("votes_total") val votesTotal: Int,
    @SerializedName("current_user_metadata") val currentUserMetadata: UserMetadata,
    @SerializedName("authors") val authors: List<Author>,
    @SerializedName("cosigned_by") val cosignedBy: List<String>,
    @SerializedName("rejection_comment") val rejectionComment: String?,
    @SerializedName("referent") val referent: Referent
)