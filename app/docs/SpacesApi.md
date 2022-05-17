# SpacesApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findSpaceById**](SpacesApi.md#findSpaceById) | **GET** /2/spaces/{id} | Space lookup by Space ID
[**findSpacesByCreatorIds**](SpacesApi.md#findSpacesByCreatorIds) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators
[**findSpacesByIds**](SpacesApi.md#findSpacesByIds) | **GET** /2/spaces | Space lookup up Space IDs
[**searchSpaces**](SpacesApi.md#searchSpaces) | **GET** /2/spaces/search | Search for Spaces
[**spaceBuyers**](SpacesApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
[**spaceTweets**](SpacesApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space


<a name="findSpaceById"></a>
# **findSpaceById**
> SingleSpaceLookupResponse findSpaceById(id, spaceFields, expansions)

Space lookup by Space ID

Returns a variety of information about the Space specified by the requested ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpacesApi()
val id : kotlin.String = id_example // kotlin.String | The space id to be retrieved
val spaceFields : kotlin.collections.Set<kotlin.String> = ["created_at","creator_id","host_ids","invited_user_ids","is_ticketed","lang","participant_count","scheduled_start","speaker_ids","started_at","title","updated_at"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Space fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["creator_id","host_ids","invited_user_ids","speaker_ids"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
try {
    val result : SingleSpaceLookupResponse = apiInstance.findSpaceById(id, spaceFields, expansions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#findSpaceById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#findSpaceById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The space id to be retrieved |
 **spaceFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**SingleSpaceLookupResponse**](SingleSpaceLookupResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="findSpacesByCreatorIds"></a>
# **findSpacesByCreatorIds**
> MultiSpaceLookupResponse findSpacesByCreatorIds(userIds, spaceFields, expansions)

Space lookup by their creators

Returns a variety of information about the Spaces created by the provided User IDs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpacesApi()
val userIds : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | The users to search through
val spaceFields : kotlin.collections.Set<kotlin.String> = ["created_at","creator_id","host_ids","invited_user_ids","is_ticketed","lang","participant_count","scheduled_start","speaker_ids","started_at","title","updated_at"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Space fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["creator_id","host_ids","invited_user_ids","speaker_ids"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
try {
    val result : MultiSpaceLookupResponse = apiInstance.findSpacesByCreatorIds(userIds, spaceFields, expansions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#findSpacesByCreatorIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#findSpacesByCreatorIds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userIds** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| The users to search through |
 **spaceFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**MultiSpaceLookupResponse**](MultiSpaceLookupResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="findSpacesByIds"></a>
# **findSpacesByIds**
> MultiSpaceLookupResponse findSpacesByIds(ids, spaceFields, expansions)

Space lookup up Space IDs

Returns a variety of information about the Spaces specified by the requested IDs

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpacesApi()
val ids : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A list of space ids
val spaceFields : kotlin.collections.Set<kotlin.String> = ["created_at","creator_id","host_ids","invited_user_ids","is_ticketed","lang","participant_count","scheduled_start","speaker_ids","started_at","title","updated_at"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Space fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["creator_id","host_ids","invited_user_ids","speaker_ids"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
try {
    val result : MultiSpaceLookupResponse = apiInstance.findSpacesByIds(ids, spaceFields, expansions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#findSpacesByIds")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#findSpacesByIds")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A list of space ids |
 **spaceFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**MultiSpaceLookupResponse**](MultiSpaceLookupResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="searchSpaces"></a>
# **searchSpaces**
> MultiSpaceLookupResponse searchSpaces(query, state, maxResults, spaceFields, expansions)

Search for Spaces

Returns Spaces that match the provided query.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpacesApi()
val query : kotlin.String = crypto // kotlin.String | The search query
val state : kotlin.String = live // kotlin.String | The state of spaces to search for
val maxResults : kotlin.Int = 56 // kotlin.Int | The number of results to return. The maximum for this value is 100.
val spaceFields : kotlin.collections.Set<kotlin.String> = ["created_at","creator_id","host_ids","invited_user_ids","is_ticketed","lang","participant_count","scheduled_start","speaker_ids","started_at","title","updated_at"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Space fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["creator_id","host_ids","invited_user_ids","speaker_ids"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
try {
    val result : MultiSpaceLookupResponse = apiInstance.searchSpaces(query, state, maxResults, spaceFields, expansions)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#searchSpaces")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#searchSpaces")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| The search query |
 **state** | **kotlin.String**| The state of spaces to search for | [optional] [default to all] [enum: live, scheduled, all]
 **maxResults** | **kotlin.Int**| The number of results to return. The maximum for this value is 100. | [optional]
 **spaceFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Space fields to display. | [optional] [enum: created_at, creator_id, host_ids, invited_user_ids, is_ticketed, lang, participant_count, scheduled_start, speaker_ids, started_at, title, updated_at]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: creator_id, host_ids, invited_user_ids, speaker_ids]

### Return type

[**MultiSpaceLookupResponse**](MultiSpaceLookupResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="spaceBuyers"></a>
# **spaceBuyers**
> MultiUserLookupResponse spaceBuyers(id, userFields)

Retrieve the list of users who purchased a ticket to the given space

Retrieves the list of users who purchased a ticket to the given space

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpacesApi()
val id : kotlin.String = 1YqKDqWqdPLsV // kotlin.String | The space id from which tweets will be retrieved
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : MultiUserLookupResponse = apiInstance.spaceBuyers(id, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spaceBuyers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spaceBuyers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The space id from which tweets will be retrieved |
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiUserLookupResponse**](MultiUserLookupResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="spaceTweets"></a>
# **spaceTweets**
> MultiTweetLookupResponse spaceTweets(id, maxResults, tweetFields)

Retrieve tweets from a Space

Retrieves tweets shared in the specified space

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = SpacesApi()
val id : kotlin.String = 1YqKDqWqdPLsV // kotlin.String | The space id from which tweets will be retrieved
val maxResults : kotlin.Int = 56 // kotlin.Int | The number of tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
try {
    val result : MultiTweetLookupResponse = apiInstance.spaceTweets(id, maxResults, tweetFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling SpacesApi#spaceTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling SpacesApi#spaceTweets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The space id from which tweets will be retrieved |
 **maxResults** | **kotlin.Int**| The number of tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100 | [optional]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]

### Return type

[**MultiTweetLookupResponse**](MultiTweetLookupResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

