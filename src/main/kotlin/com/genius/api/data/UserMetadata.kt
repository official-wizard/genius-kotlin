package com.genius.api.data

import com.google.gson.annotations.SerializedName

data class UserMetadata(
    @SerializedName("permissions") val permissions: List<String>,
    @SerializedName("excluded_permissions") val excludedPermissions: List<String>,
    @SerializedName("interactions") val interactions: Interaction,
    @SerializedName("iq_by_action") val iqByAction: IQByAction
) {

    data class IQByAction(
        @SerializedName("accept") val accept: Action,
        @SerializedName("reject") val reject: Action,
        @SerializedName("delete") val delete: Action,
    )

    data class Action(
        @SerializedName("primary") val primary: Primary
    )

    data class Primary(
        @SerializedName("multiplier") val multiplier: Int,
        @SerializedName("base") val base: Int,
        @SerializedName("applicable") val applicable: Boolean
    )

    data class Interaction(
        @SerializedName("cosign") val cosign: Boolean,
        @SerializedName("pyong") val pyong: Boolean,
        @SerializedName("vote") val vote: String?
    )
}