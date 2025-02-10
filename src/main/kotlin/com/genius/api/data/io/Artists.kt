package com.genius.api.data.io

import com.genius.api.data.FullArtist
import com.google.gson.annotations.SerializedName

class Artists {

    class Response: ResponseMessage<Response.Body>() {
        data class Body(
            @SerializedName("artist") val artist: FullArtist
        )
    }
}