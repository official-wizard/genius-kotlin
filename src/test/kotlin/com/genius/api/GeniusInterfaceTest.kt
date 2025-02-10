package com.genius.api

import co.infinum.retromock.Retromock
import com.genius.api.cli.GeniusClient
import com.genius.api.cli.GeniusInterface
import com.genius.api.core.Credentials
import com.genius.api.data.io.*
import com.genius.api.test.ResourceBodyFactory
import com.genius.com.genius.api.data.io.ArtistSongs
import com.google.gson.Gson
import org.junit.jupiter.api.Test
import retrofit2.Response
import kotlin.test.assertNotNull

class GeniusInterfaceTest {

    @Test
    fun `check getReferent response parser`() {

        // obtain mocked version of the API
        val api = createMockedApi()

        val response: Response<Referents.Response> = api.getReferents(
            webPageId = 10347
        ).execute()

        assert(response.isSuccessful)
        assertNotNull(response.body())
    }

    @Test
    fun `check getAnnotations response parser`() {

        // obtain mocked version of the API
        val api = createMockedApi()

        val response: Response<Annotations.Response> = api.getAnnotations(
            id = 10225840
        ).execute()

        assert(response.isSuccessful)
        assertNotNull(response.body())
    }

    @Test
    fun `check getSong response parser`() {

        // obtain mocked version of the API
        val api = createMockedApi()

        val response: Response<Songs.Response> = api.getSong(
            id = 378195
        ).execute()

        assert(response.isSuccessful)
        assertNotNull(response.body())
    }

    @Test
    fun `check getArtist response parser`() {

        // obtain mocked version of the API
        val api = createMockedApi()

        val response: Response<Artists.Response> = api.getArtist(
            id = 16775
        ).execute()

        assert(response.isSuccessful)
        assertNotNull(response.body())
    }

    @Test
    fun `check getArtistSongs response parser`() {

        // obtain mocked version of the API
        val api = createMockedApi()

        val response: Response<ArtistSongs.Response> = api.getArtistSongs(
            id = 16775
        ).execute()

        assert(response.isSuccessful)
        assertNotNull(response.body())
    }

    @Test
    fun `check getPage response parser`() {

        // obtain mocked version of the API
        val api = createMockedApi()

        val response: Response<Page.Response> = api.getPage(
            rawAnnotatableUrl = "https://docs.genius.com"
        ).execute()

        assert(response.isSuccessful)
        assertNotNull(response.body())
    }

    @Test
    fun `check search response parser`() {

        // obtain mocked version of the API
        val api = createMockedApi()

        val response: Response<Search.Response> = api.search(
            query = "Kendrick Lamar"
        ).execute()

        assert(response.isSuccessful)
        assertNotNull(response.body())
    }

    @Test
    fun `check getAccount response parser`() {

        // obtain mocked version of the API
        val api = createMockedApi()

        val response: Response<Account.Response> = api.getAccount().execute()

        assert(response.isSuccessful)
        assertNotNull(response.body())
    }

    private fun createMockedApi(): GeniusInterface {

        val client = GeniusClient(Credentials("<oauth-key>"), "https://api.genius.com")
        val retro = client.retroClient

        val mockRetrofit: Retromock = Retromock.Builder()
            .defaultBodyFactory(ResourceBodyFactory())
            .retrofit(retro)
            .build()

        return mockRetrofit.create(GeniusInterface::class.java)
    }
}