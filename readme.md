

<p align="center" dir="auto">
    <a href="https://genius.com" rel="nofollow">
        <img src="icon.png" width="200" alt="Genius Logo" style="max-width: 100%;"/>
    </a>
</p>

<h1 align="center">Genius API Client</h1>

## Installation

To begin, import the library using jitpack.io.

You can include jitpack in your `pom.xml` by adding the following jitpack repository:

```xml
<repository>
    <id>jitpack.io</id>
    <url>https://www.jitpack.io</url>
</repository>
```

Then add this `genius-kotlin` dependency to your `pom.xml` project!

```xml
<dependency>    
    <groupId>com.github.official-wizard</groupId>    
    <artifactId>genius-kotlin</artifactId>    
    <version>1.0.0</version>
</dependency>
```

## Usage

### Basic Usage

You must obtain an oauth token from your [developer portal](https://genius.com/api-clients) on Genius, you can then initialize the API interface by doing the following:

```kotlin
val credentials: Credentials = Credentials("<oauth-token>")
val api: GeniusInterface = GeniusClient(credentials).api

// access the api interface in `api`
```

<details>
<summary>Annotations</summary>
<br>
An annotation is a piece of content about a part of a document. The document may be a song (hosted on Genius) or a web page (hosted anywhere). The part of a document that an annotation is attached to is called a referent.

Annotation data returned from the API includes both the substance of the annotation and the necessary information for displaying it in its original context.

**Available Parameters**

| Name        | Type | Description                                                                                                                                                 | Example    |
|:------------|:-----|:------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------|
| id          | Int  | ID of the annotation                                                                                                                                        | 10225840   |
| text_format | Enum | Format for text bodies related to the document. One or more of dom, plain, and html, separated by commas (defaults to dom). See details of each option here | Format.dom |

**Example**
```kotlin
val credentials: Credentials = Credentials("<oauth-token>")
val api: GeniusInterface = GeniusClient(credentials).api

val response: Response<Annotations.Response> = api.getAnnotations(
    id = 10225840
).execute()
```

</details>

<details>
<summary>Referents</summary>
<br>
Referents are the sections of a piece of content to which annotations are attached. Each referent is associated with a web page or a song and may have one or more annotations. Referents can be searched by the document they are attached to or by the user that created them.

When a new annotation is created either a referent is created with it or that annotation is attached to an existing referent.

**Available Parameters**

| Name        | Type  | Description                                                                                                                                                 | Example    |
|:------------|:------|:------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------|
| webPageId   | Long? | ID of a web page to get referents for                                                                                                                       | 10347      |
| songId      | Long? | ID of a song to get referents for                                                                                                                           | null       |
| createdById | Long? | ID of a user to get referents for                                                                                                                           | null       |
| textFormat  | Enum  | Format for text bodies related to the document. One or more of dom, plain, and html, separated by commas (defaults to dom). See details of each option here | Format.dom |
| perPage     | Int   | Number of results to return per request                                                                                                                     | 15         |
| page        | Int   | Paginated offset, (e.g., per_page=5&page=3 returns songs 11–15)                                                                                             | 1          |

**Example**
```kotlin
val credentials: Credentials = Credentials("<oauth-token>")
val api: GeniusInterface = GeniusClient(credentials).api

val response: Response<Referents.Response> = api.getReferents(
    webPageId = 10347
).execute()

```

</details>

<details>
<summary>Songs</summary>
<br>
A song is a document hosted on Genius. It's usually music lyrics.

Data for a song includes details about the document itself and information about all the referents that are attached to it, including the text to which they refer.

**Available Parameters**

| Name        | Type | Description                                                                                                                                                 | Example    |
|:------------|:-----|:------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------|
| id          | Long | ID of the song                                                                                                                                              | 378195     |
| text_format | Enum | Format for text bodies related to the document. One or more of dom, plain, and html, separated by commas (defaults to dom). See details of each option here | Format.dom |

**Example**
```kotlin
val credentials: Credentials = Credentials("<oauth-token>")
val api: GeniusInterface = GeniusClient(credentials).api

val response: Response<Songs.Response> = api.getSong(
    id = 378195
).execute()

```

</details>

<details>
<summary>Artists</summary>
<br>
An artist is how Genius represents the creator of one or more songs (or other documents hosted on Genius). It's usually a musician or group of musicians.

**Available Parameters**

| Name        | Type | Description                                                                                                                                                 | Example    |
|:------------|:-----|:------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----------|
| id          | Long | ID of the artist                                                                                                                                            | 16775      |
| text_format | Enum | Format for text bodies related to the document. One or more of dom, plain, and html, separated by commas (defaults to dom). See details of each option here | Format.dom |

**Example**
```kotlin
val credentials: Credentials = Credentials("<oauth-token>")
val api: GeniusInterface = GeniusClient(credentials).api

val response: Response<Artists.Response> = api.getArtist(
    id = 16775
).execute()
```

</details>

<details>
<summary>Artist's Songs</summary>
<br>
Documents (songs) for the artist specified. By default, 20 items are returned for each request.

**Available Parameters**

| Name        | Type | Description                                                                                                                                                 | Example        |
|:------------|:-----|:------------------------------------------------------------------------------------------------------------------------------------------------------------|:---------------|
| id          | Long | ID of the artist                                                                                                                                            | 16775          |
| sort        | Enum | title (default) or popularity                                                                                                                               | SongSort.title |
| text_format | Enum | Format for text bodies related to the document. One or more of dom, plain, and html, separated by commas (defaults to dom). See details of each option here | Format.dom     |

**Example**
```kotlin
val credentials: Credentials = Credentials("<oauth-token>")
val api: GeniusInterface = GeniusClient(credentials).api

val response: Response<ArtistSongs.Response> = api.getArtistSongs(
    id = 16775
).execute()
```

</details>

<details>
<summary>Web Pages</summary>
<br>
> A web page is a single, publicly accessible page to which annotations may be attached. Web pages map 1-to-1 with unique, canonical URLs.

Information about a web page retrieved by the page's full URL (including protocol). The returned data includes Genius's ID for the page, which may be used to look up associated referents with the /referents endpoint.

Data is only available for pages that already have at least one annotation.

Provide as many of the following variants of the URL as possible:

**Available Parameters**

| Name              | Type    | Description                                                                                                                                                                      | Example                 |
|:------------------|:--------|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------|
| rawAnnotatableUrl | String? | The URL as it would appear in a browser                                                                                                                                          | https://docs.genius.com |
| canonicalUrl      | String? | The URL as specified by an appropriate <link> tag in a page's <head>                                                                                                             | null                    |
| ogUrl             | String? | The URL as specified by an og:url <meta> tag in a page's <head>                                                                                                                  | null                    |

**Example**
```kotlin
val credentials: Credentials = Credentials("<oauth-token>")
val api: GeniusInterface = GeniusClient(credentials).api

val response: Response<Page.Response> = api.getPage(
    rawAnnotatableUrl = "https://docs.genius.com"
).execute()

```

</details>

<details>
<summary>Search</summary>
<br>
The search capability covers all content hosted on Genius (all songs).

**Available Parameters**

| Name         | Type    | Description                                                                                                                                                                     | Example        |
|:-------------|:--------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:---------------|
| query        | String  | The term to search for                                                                                                                                                          | Kendrick Lamar |

**Example**
```kotlin
val credentials: Credentials = Credentials("<oauth-token>")
val api: GeniusInterface = GeniusClient(credentials).api

val response: Response<Search.Response> = api.search(
    query = "Kendrick Lamar"
).execute()

```

</details>

<details>
<summary>Account</summary>
<br>
Account information includes general contact information and Genius-specific details about a user.

**Example**
```kotlin
val credentials: Credentials = Credentials("<oauth-token>")
val api: GeniusInterface = GeniusClient(credentials).api

val response: Response<Account.Response> = api.getAccount().execute()

```

</details>

## Testing

Apache maven must be correctly installed on the system.

To run tests for this project using Maven, execute the following command in your terminal:

```bash
mvn test
```

To compile the application, just run:

```bash
mvn clean package
```
