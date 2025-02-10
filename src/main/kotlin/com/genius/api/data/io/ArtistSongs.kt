package com.genius.api.data.io

import com.genius.api.data.Song
import com.genius.api.data.io.ResponseMessage
import com.google.gson.annotations.SerializedName

class ArtistSongs {

    class Response: ResponseMessage<Response.Body>() {
        data class Body(
            @SerializedName("songs") val songs: List<Song>,
            @SerializedName("next_page") val nextPage: Int?
        )
    }
}