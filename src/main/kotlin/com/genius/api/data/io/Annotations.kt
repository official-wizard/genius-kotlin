package com.genius.api.data.io

import com.genius.api.data.Annotation
import com.google.gson.annotations.SerializedName

class Annotations {

    class Response: ResponseMessage<Response.Body>() {
        data class Body(
            @SerializedName("annotation") val annotation: Annotation
        )
    }
}