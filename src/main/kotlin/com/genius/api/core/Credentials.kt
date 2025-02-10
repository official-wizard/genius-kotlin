package com.genius.api.core

/**
 * [Credentials] are the credentials necessary to authenticate to
 * the endpoints for Genius.
 *
 * Genius uses an oAuth2 token, which can be requested through the interface.
 *
 * You can access your Genius.com credentials here: https://genius.com/api-clients
 *
 * [accessToken] your oAuth access token
 */
data class Credentials(
    var accessToken: String
)
