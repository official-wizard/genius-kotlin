package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class Album(
    @SerializedName("api_path") val apiPath: String,
    @SerializedName("cover_art_url") val coverArtUrl: String,
    @SerializedName("full_title") val fullTitle: String,
    @SerializedName("id") val id: Long,
    @SerializedName("name") val name: String,
    @SerializedName("primary_artist_names") val primaryArtistNames: String,
    @SerializedName("release_date_for_display") val releaseDateForDisplay: String,
    @SerializedName("url") val url: String,
    @SerializedName("artist") val artist: Artist,
    @SerializedName("primary_artists") val primaryArtists: List<Artist>
)