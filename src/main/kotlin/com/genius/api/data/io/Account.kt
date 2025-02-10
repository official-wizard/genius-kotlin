package com.genius.api.data.io

import com.genius.api.data.User
import com.google.gson.annotations.SerializedName

class Account {

    class Response: ResponseMessage<Response.Body>() {
        data class Body(
            @SerializedName("user") val user: User
        )
    }
}