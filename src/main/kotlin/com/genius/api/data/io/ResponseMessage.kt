package com.genius.api.data.io

import com.google.gson.annotations.SerializedName

open class ResponseMessage<T>(
    @SerializedName("meta") val meta: Meta = Meta(),
    @SerializedName("response")val response: T? = null
) {
    data class Meta(
        @SerializedName("status") val status: Int = 200,
        @SerializedName("message") val message: String? = null
    )
}