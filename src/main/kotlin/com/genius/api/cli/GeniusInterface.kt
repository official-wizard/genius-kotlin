package com.genius.api.cli

import co.infinum.retromock.meta.Mock
import co.infinum.retromock.meta.MockResponse
import com.genius.api.data.io.*
import com.genius.api.data.io.Account
import com.genius.api.data.io.Page
import com.genius.api.data.io.ArtistSongs
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * List of endpoints you can communicate with Genius.
 */

interface GeniusInterface {

    /**
     * An annotation is a piece of content about a part of a document. The document may be a song (hosted on Genius) or a web page (hosted anywhere). The part of a document that an annotation is attached to is called a referent.
     *
     * Annotation data returned from the API includes both the substance of the annotation and the necessary information for displaying it in its original context.
     */
    @Mock @MockResponse(body = "/Annotations.json")
    @GET("/annotations/{id}")
    fun getAnnotations(
        @Path("id") id: Long,
        @Query("text_format") textFormat: Format = Format.dom
    ): Call<Annotations.Response>

    /**
     * Referents are the sections of a piece of content to which annotations are attached. Each referent is associated with a web page or a song and may have one or more annotations. Referents can be searched by the document they are attached to or by the user that created them.
     *
     * When a new annotation is created either a referent is created with it or that annotation is attached to an existing referent.
     */
    @Mock @MockResponse(body = "/Referents.json")
    @GET("/referents")
    fun getReferents(
        @Query("web_page_id") webPageId: Long? = null,
        @Query("song_id") songId: Long? = null,
        @Query("created_by_id") createdById: Long? = null,
        @Query("text_format") textFormat: Format = Format.dom,
        @Query("per_page") perPage: Int = 15,
        @Query("page") page: Int = 1
    ): Call<Referents.Response>

    /**
     * A song is a document hosted on Genius. It's usually music lyrics.
     *
     * Data for a song includes details about the document itself and information about all the referents that are attached to it, including the text to which they refer.
     */
    @Mock @MockResponse(body = "/Songs.json")
    @GET("/songs/{id}")
    fun getSong(
        @Path("id") id: Long,
        @Query("text_format") textFormat: Format = Format.dom
    ): Call<Songs.Response>

    /**
     * An artist is how Genius represents the creator of one or more songs (or other documents hosted on Genius). It's usually a musician or group of musicians.
     */
    @Mock @MockResponse(body = "/Artists.json")
    @GET("/artists/{id}")
    fun getArtist(
        @Path("id") id: Long,
        @Query("text_format") textFormat: Format = Format.dom
    ): Call<Artists.Response>


    /**
     * An artist is how Genius represents the creator of one or more songs (or other documents hosted on Genius). It's usually a musician or group of musicians.
     */
    @Mock @MockResponse(body = "/Artists.json")
    @GET("/artists/{id}/songs")
    fun getArtistSongs(
        @Path("id") id: Long,
        @Query("sort") sort: SongsSort = SongsSort.title,
        @Query("per_page") perPage: Int = 15,
        @Query("page") page: Int = 1
    ): Call<ArtistSongs.Response>

    /**
     * Information about a web page retrieved by the page's full URL (including protocol). The returned data includes Genius's ID for the page, which may be used to look up associated referents with the /referents endpoint.
     *
     * Data is only available for pages that already have at least one annotation.
     *
     * Provide as many of the following variants of the URL as possible:
     */
    @Mock @MockResponse(body = "/Page.json")
    @GET("/web_pages/lookup")
    fun getPage(
        @Query("raw_annotatable_url") rawAnnotatableUrl: String? = null,
        @Query("canonical_url") canonicalUrl: String? = null,
        @Query("og_url") ogUrl: String? = null,
        @Query("text_format") textFormat: Format = Format.dom
    ): Call<Page.Response>

    /**
     * The search capability covers all content hosted on Genius (all songs).
     */
    @Mock @MockResponse(body = "/Search.json")
    @GET("/search")
    fun search(
        @Query("q") query: String,
        @Query("text_format") textFormat: Format = Format.dom
    ): Call<Search.Response>

    /**
     * Account information includes general contact information and Genius-specific details about a user.
     */
    @Mock @MockResponse(body = "/Account.json")
    @GET("/account")
    fun getAccount(
        @Query("text_format") textFormat: Format = Format.dom
    ): Call<Account.Response>

    enum class Format {
        plain, dom, html
    }

    enum class SongsSort {
        title, popularity
    }
}