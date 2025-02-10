package com.genius.api.data.io

import com.genius.api.data.Song
import com.google.gson.annotations.SerializedName

class Songs {

    class Response: ResponseMessage<Response.Body>() {
        data class Body(
            @SerializedName("song") val song: Song
        )
    }
}