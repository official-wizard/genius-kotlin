package com.genius.api.data.io

import com.genius.api.data.Page
import com.google.gson.annotations.SerializedName

class Page {

    class Response: ResponseMessage<Response.Body>() {
        data class Body(
            @SerializedName("web_page") val webPage: Page
        )
    }
}