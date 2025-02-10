package com.genius.api.data.io

import com.genius.api.data.Referent
import com.google.gson.annotations.SerializedName

class Referents {

    class Response: ResponseMessage<Response.Body>() {
        data class Body(
            @SerializedName("referents") val referents: List<Referent>
        )
    }
}