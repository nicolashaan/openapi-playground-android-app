# BookmarksApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsersIdBookmarks**](BookmarksApi.md#getUsersIdBookmarks) | **GET** /2/users/{id}/bookmarks | Bookmarks by User
[**postUsersIdBookmarks**](BookmarksApi.md#postUsersIdBookmarks) | **POST** /2/users/{id}/bookmarks | Add Tweet to Bookmarks
[**usersIdBookmarksDelete**](BookmarksApi.md#usersIdBookmarksDelete) | **DELETE** /2/users/{id}/bookmarks/{tweet_id} | Remove a bookmarked Tweet


<a name="getUsersIdBookmarks"></a>
# **getUsersIdBookmarks**
> GenericTweetsTimelineResponse getUsersIdBookmarks(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Bookmarks by User

Returns Tweet objects that have been bookmarked by the requesting user

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = BookmarksApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results.
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : GenericTweetsTimelineResponse = apiInstance.getUsersIdBookmarks(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookmarksApi#getUsersIdBookmarks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookmarksApi#getUsersIdBookmarks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**GenericTweetsTimelineResponse**](GenericTweetsTimelineResponse.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="postUsersIdBookmarks"></a>
# **postUsersIdBookmarks**
> BookmarkMutationResponse postUsersIdBookmarks(id, addBookmarkRequest)

Add Tweet to Bookmarks

Adds a Tweet (ID in the body) to the requesting user&#39;s (in the path) bookmarks

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = BookmarksApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to add bookmarks
val addBookmarkRequest : AddBookmarkRequest =  // AddBookmarkRequest | 
try {
    val result : BookmarkMutationResponse = apiInstance.postUsersIdBookmarks(id, addBookmarkRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookmarksApi#postUsersIdBookmarks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookmarksApi#postUsersIdBookmarks")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to add bookmarks |
 **addBookmarkRequest** | [**AddBookmarkRequest**](AddBookmarkRequest.md)|  |

### Return type

[**BookmarkMutationResponse**](BookmarkMutationResponse.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="usersIdBookmarksDelete"></a>
# **usersIdBookmarksDelete**
> BookmarkMutationResponse usersIdBookmarksDelete(id, tweetId)

Remove a bookmarked Tweet

Removes a Tweet from the requesting user&#39;s bookmarked Tweets.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = BookmarksApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user whose bookmark is to be removed.
val tweetId : kotlin.String = tweetId_example // kotlin.String | The ID of the tweet that the user is removing from bookmarks
try {
    val result : BookmarkMutationResponse = apiInstance.usersIdBookmarksDelete(id, tweetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BookmarksApi#usersIdBookmarksDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BookmarksApi#usersIdBookmarksDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user whose bookmark is to be removed. |
 **tweetId** | **kotlin.String**| The ID of the tweet that the user is removing from bookmarks |

### Return type

[**BookmarkMutationResponse**](BookmarkMutationResponse.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

