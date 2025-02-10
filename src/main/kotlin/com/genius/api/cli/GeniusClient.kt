package com.genius.api.cli

import com.genius.api.core.CoreClient
import com.genius.api.core.Credentials

/**
 * The core client for accessing the [GeniusInterface].
 */
class GeniusClient(credentials: Credentials, baseUrl: String, debugging: Boolean = false): CoreClient(credentials, baseUrl, debugging) {

    // the API interface for interacting with the remote server
    val api: GeniusInterface = retroClient.create(GeniusInterface::class.java)
}