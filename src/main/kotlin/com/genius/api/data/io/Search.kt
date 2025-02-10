package com.genius.api.data.io

import com.genius.api.data.Hit
import com.google.gson.annotations.SerializedName

class Search {

    class Response: ResponseMessage<Response.Body>() {
        class Body(
            @SerializedName("hits") val hits: List<Hit>
        )
    }
}