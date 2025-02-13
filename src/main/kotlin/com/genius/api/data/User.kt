package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("api_path") val apiPath: String,
    @SerializedName("avatar") val avatar: Avatar,
    @SerializedName("header_image_url") val headerImageUrl: String,
    @SerializedName("human_readable_role_for_display") val humanReadableRoleForDisplay: String,
    @SerializedName("id") val id: Long,
    @SerializedName("iq") val iq: Long,
    @SerializedName("login") val login: String,
    @SerializedName("name") val name: String,
    @SerializedName("role_for_display") val roleForDisplay: String,
    @SerializedName("url") val url: String,
    @SerializedName("current_user_metadata") val currentUserMetadata: UserMetadata
)