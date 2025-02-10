package com.genius.api.data

import com.google.gson.JsonElement
import com.google.gson.annotations.SerializedName

data class FullArtist(
    @SerializedName("alternate_names") val alternateNames: List<String>,
    @SerializedName("api_path") val apiPath: String,
    @SerializedName("description") val description: JsonElement,
    @SerializedName("facebook_name") val facebookName: String,
    @SerializedName("header_image_url") val headerImageUrl: String,
    @SerializedName("id") val id: Long,
    @SerializedName("image_url") val imageUrl: String,
    @SerializedName("instagram_name") val instagramName: String,
    @SerializedName("is_meme_verified") val isMemeVerified: Boolean,
    @SerializedName("is_verified") val isVerified: Boolean,
    @SerializedName("name") val name: String,
    @SerializedName("translation_artist") val translationArtist: Boolean,
    @SerializedName("twitter_name") val twitterName: String,
    @SerializedName("url") val url: String,
    @SerializedName("current_user_metadata") val currentUserMetadata: UserMetadata,
    @SerializedName("followers_count") val followersCount: Long,
    @SerializedName("iq") val iq: Long,
    @SerializedName("description_annotation") val descriptionAnnotation: DescriptionAnnotation,
    @SerializedName("user") val user: User
)