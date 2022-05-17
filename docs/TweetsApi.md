# TweetsApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrDeleteRules**](TweetsApi.md#addOrDeleteRules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules
[**createTweet**](TweetsApi.md#createTweet) | **POST** /2/tweets | Creation of a Tweet
[**deleteTweetById**](TweetsApi.md#deleteTweetById) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID
[**findTweetById**](TweetsApi.md#findTweetById) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID
[**findTweetsById**](TweetsApi.md#findTweetsById) | **GET** /2/tweets | Tweet lookup by Tweet IDs
[**findTweetsThatQuoteATweet**](TweetsApi.md#findTweetsThatQuoteATweet) | **GET** /2/tweets/{id}/quote_tweets | Retrieve tweets that quote a tweet.
[**getRules**](TweetsApi.md#getRules) | **GET** /2/tweets/search/stream/rules | Rules lookup
[**hideReplyById**](TweetsApi.md#hideReplyById) | **PUT** /2/tweets/{id}/hidden | Hide replies
[**listsIdTweets**](TweetsApi.md#listsIdTweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID
[**sampleStream**](TweetsApi.md#sampleStream) | **GET** /2/tweets/sample/stream | Sample stream
[**searchStream**](TweetsApi.md#searchStream) | **GET** /2/tweets/search/stream | Filtered stream
[**spaceBuyers**](TweetsApi.md#spaceBuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
[**spaceTweets**](TweetsApi.md#spaceTweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space
[**tweetCountsFullArchiveSearch**](TweetsApi.md#tweetCountsFullArchiveSearch) | **GET** /2/tweets/counts/all | Full archive search counts
[**tweetCountsRecentSearch**](TweetsApi.md#tweetCountsRecentSearch) | **GET** /2/tweets/counts/recent | Recent search counts
[**tweetsFullarchiveSearch**](TweetsApi.md#tweetsFullarchiveSearch) | **GET** /2/tweets/search/all | Full-archive search
[**tweetsRecentSearch**](TweetsApi.md#tweetsRecentSearch) | **GET** /2/tweets/search/recent | Recent search
[**usersIdLike**](TweetsApi.md#usersIdLike) | **POST** /2/users/{id}/likes | Causes the user (in the path) to like the specified tweet
[**usersIdLikedTweets**](TweetsApi.md#usersIdLikedTweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID
[**usersIdMentions**](TweetsApi.md#usersIdMentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID
[**usersIdRetweets**](TweetsApi.md#usersIdRetweets) | **POST** /2/users/{id}/retweets | Causes the user (in the path) to retweet the specified tweet
[**usersIdTweets**](TweetsApi.md#usersIdTweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID
[**usersIdUnlike**](TweetsApi.md#usersIdUnlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the user (in the path) to unlike the specified tweet
[**usersIdUnretweets**](TweetsApi.md#usersIdUnretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the user (in the path) to unretweet the specified tweet


<a name="addOrDeleteRules"></a>
# **addOrDeleteRules**
> AddOrDeleteRulesResponse addOrDeleteRules(addOrDeleteRulesRequest, dryRun)

Add/Delete rules

Add or delete rules from a user&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val addOrDeleteRulesRequest : AddOrDeleteRulesRequest =  // AddOrDeleteRulesRequest | 
val dryRun : kotlin.Boolean = true // kotlin.Boolean | Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes.
try {
    val result : AddOrDeleteRulesResponse = apiInstance.addOrDeleteRules(addOrDeleteRulesRequest, dryRun)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#addOrDeleteRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#addOrDeleteRules")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **addOrDeleteRulesRequest** | [**AddOrDeleteRulesRequest**](AddOrDeleteRulesRequest.md)|  |
 **dryRun** | **kotlin.Boolean**| Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes. | [optional]

### Return type

[**AddOrDeleteRulesResponse**](AddOrDeleteRulesResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="createTweet"></a>
# **createTweet**
> TweetCreateResponse createTweet(inlineObject3)

Creation of a Tweet

Causes the user to create a tweet under the authorized account.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val inlineObject3 : InlineObject3 =  // InlineObject3 | 
try {
    val result : TweetCreateResponse = apiInstance.createTweet(inlineObject3)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#createTweet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#createTweet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**TweetCreateResponse**](TweetCreateResponse.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="deleteTweetById"></a>
# **deleteTweetById**
> TweetDeleteResponse deleteTweetById(id)

Tweet delete by Tweet ID

Delete specified Tweet (in the path) by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the Tweet to be deleted.
try {
    val result : TweetDeleteResponse = apiInstance.deleteTweetById(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#deleteTweetById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#deleteTweetById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the Tweet to be deleted. |

### Return type

[**TweetDeleteResponse**](TweetDeleteResponse.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="findTweetById"></a>
# **findTweetById**
> SingleTweetLookupResponse findTweetById(id, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Tweet lookup by Tweet ID

Returns a variety of information about the Tweet specified by the requested ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | A single Tweet ID.
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : SingleTweetLookupResponse = apiInstance.findTweetById(id, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#findTweetById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#findTweetById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| A single Tweet ID. |
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**SingleTweetLookupResponse**](SingleTweetLookupResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="findTweetsById"></a>
# **findTweetsById**
> MultiTweetLookupResponse findTweetsById(ids, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Tweet lookup by Tweet IDs

Returns a variety of information about the Tweet specified by the requested ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val ids : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A comma separated list of Tweet IDs. Up to 100 are allowed in a single request.
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : MultiTweetLookupResponse = apiInstance.findTweetsById(ids, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#findTweetsById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#findTweetsById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet IDs. Up to 100 are allowed in a single request. |
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

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

<a name="findTweetsThatQuoteATweet"></a>
# **findTweetsThatQuoteATweet**
> QuoteTweetLookupResponse findTweetsThatQuoteATweet(id, maxResults, exclude, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Retrieve tweets that quote a tweet.

Returns a variety of information about each tweet that quotes the Tweet specified by the requested ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the Quoted Tweet.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results to be returned.
val exclude : kotlin.collections.Set<kotlin.String> = ["replies","retweets"] // kotlin.collections.Set<kotlin.String> | The set of entities to exclude (e.g. 'replies' or 'retweets')
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : QuoteTweetLookupResponse = apiInstance.findTweetsThatQuoteATweet(id, maxResults, exclude, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#findTweetsThatQuoteATweet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#findTweetsThatQuoteATweet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the Quoted Tweet. |
 **maxResults** | **kotlin.Int**| The maximum number of results to be returned. | [optional] [default to 10]
 **exclude** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;) | [optional] [enum: replies, retweets]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**QuoteTweetLookupResponse**](QuoteTweetLookupResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="getRules"></a>
# **getRules**
> InlineResponse2001 getRules(ids, maxResults, paginationToken)

Rules lookup

Returns rules from a user&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val ids : kotlin.collections.List<kotlin.String> =  // kotlin.collections.List<kotlin.String> | A comma-separated list of Rule IDs.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This value is populated by passing the 'next_token' returned in a request to paginate through results.
try {
    val result : InlineResponse2001 = apiInstance.getRules(ids, maxResults, paginationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#getRules")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#getRules")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| A comma-separated list of Rule IDs. | [optional]
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 1000]
 **paginationToken** | **kotlin.String**| This value is populated by passing the &#39;next_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="hideReplyById"></a>
# **hideReplyById**
> InlineResponse200 hideReplyById(id, inlineObject4)

Hide replies

Hides or unhides a reply to an owned conversation.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the reply that you want to hide or unhide.
val inlineObject4 : InlineObject4 =  // InlineObject4 | 
try {
    val result : InlineResponse200 = apiInstance.hideReplyById(id, inlineObject4)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#hideReplyById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#hideReplyById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the reply that you want to hide or unhide. |
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="listsIdTweets"></a>
# **listsIdTweets**
> InlineResponse2002 listsIdTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

List Tweets timeline by List ID

Returns a list of Tweets associated with the provided List ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the List to list Tweets of
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results.
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : InlineResponse2002 = apiInstance.listsIdTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#listsIdTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#listsIdTweets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the List to list Tweets of |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="sampleStream"></a>
# **sampleStream**
> StreamingTweet sampleStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes)

Sample stream

Streams a deterministic 1% of public Tweets.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
val backfillMinutes : kotlin.Int = 56 // kotlin.Int | The number of minutes of backfill requested
try {
    val result : StreamingTweet = apiInstance.sampleStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#sampleStream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#sampleStream")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]
 **backfillMinutes** | **kotlin.Int**| The number of minutes of backfill requested | [optional]

### Return type

[**StreamingTweet**](StreamingTweet.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="searchStream"></a>
# **searchStream**
> FilteredStreamingTweet searchStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes)

Filtered stream

Streams Tweets matching the stream&#39;s active rule set.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
val backfillMinutes : kotlin.Int = 56 // kotlin.Int | The number of minutes of backfill requested
try {
    val result : FilteredStreamingTweet = apiInstance.searchStream(expansions, tweetFields, userFields, mediaFields, placeFields, pollFields, backfillMinutes)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#searchStream")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#searchStream")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]
 **backfillMinutes** | **kotlin.Int**| The number of minutes of backfill requested | [optional]

### Return type

[**FilteredStreamingTweet**](FilteredStreamingTweet.md)

### Authorization


Configure BearerToken:
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

val apiInstance = TweetsApi()
val id : kotlin.String = 1YqKDqWqdPLsV // kotlin.String | The space id from which tweets will be retrieved
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : MultiUserLookupResponse = apiInstance.spaceBuyers(id, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#spaceBuyers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#spaceBuyers")
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

val apiInstance = TweetsApi()
val id : kotlin.String = 1YqKDqWqdPLsV // kotlin.String | The space id from which tweets will be retrieved
val maxResults : kotlin.Int = 56 // kotlin.Int | The number of tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
try {
    val result : MultiTweetLookupResponse = apiInstance.spaceTweets(id, maxResults, tweetFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#spaceTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#spaceTweets")
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

<a name="tweetCountsFullArchiveSearch"></a>
# **tweetCountsFullArchiveSearch**
> TweetCountsResponse tweetCountsFullArchiveSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity)

Full archive search counts

Returns Tweet Counts that match a search query.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val query : kotlin.String = (from:TwitterDev OR from:TwitterAPI) has:media -is:retweet // kotlin.String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length
val startTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
val endTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
val sinceId : kotlin.String = sinceId_example // kotlin.String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
val untilId : kotlin.String = untilId_example // kotlin.String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
val nextToken : kotlin.String = nextToken_example // kotlin.String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
val granularity : Granularity =  // Granularity | The granularity for the search counts results.
try {
    val result : TweetCountsResponse = apiInstance.tweetCountsFullArchiveSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#tweetCountsFullArchiveSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#tweetCountsFullArchiveSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length |
 **startTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **kotlin.String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **kotlin.String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **nextToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **granularity** | [**Granularity**](.md)| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day]

### Return type

[**TweetCountsResponse**](TweetCountsResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="tweetCountsRecentSearch"></a>
# **tweetCountsRecentSearch**
> TweetCountsResponse tweetCountsRecentSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity)

Recent search counts

Returns Tweet Counts from the last 7 days that match a search query.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val query : kotlin.String = (from:TwitterDev OR from:TwitterAPI) has:media -is:retweet // kotlin.String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length
val startTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
val endTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
val sinceId : kotlin.String = sinceId_example // kotlin.String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
val untilId : kotlin.String = untilId_example // kotlin.String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
val nextToken : kotlin.String = nextToken_example // kotlin.String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
val granularity : Granularity =  // Granularity | The granularity for the search counts results.
try {
    val result : TweetCountsResponse = apiInstance.tweetCountsRecentSearch(query, startTime, endTime, sinceId, untilId, nextToken, paginationToken, granularity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#tweetCountsRecentSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#tweetCountsRecentSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length |
 **startTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **kotlin.String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **kotlin.String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **nextToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **granularity** | [**Granularity**](.md)| The granularity for the search counts results. | [optional] [default to hour] [enum: minute, hour, day]

### Return type

[**TweetCountsResponse**](TweetCountsResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="tweetsFullarchiveSearch"></a>
# **tweetsFullarchiveSearch**
> TweetSearchResponse tweetsFullarchiveSearch(query, startTime, endTime, sinceId, untilId, maxResults, sortOrder, nextToken, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Full-archive search

Returns Tweets that match a search query.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val query : kotlin.String = (from:TwitterDev OR from:TwitterAPI) has:media -is:retweet // kotlin.String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length
val startTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
val endTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
val sinceId : kotlin.String = sinceId_example // kotlin.String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
val untilId : kotlin.String = untilId_example // kotlin.String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of search results to be returned by a request.
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | This order in which to return results.
val nextToken : kotlin.String = nextToken_example // kotlin.String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : TweetSearchResponse = apiInstance.tweetsFullarchiveSearch(query, startTime, endTime, sinceId, untilId, maxResults, sortOrder, nextToken, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#tweetsFullarchiveSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#tweetsFullarchiveSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length |
 **startTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **kotlin.String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **kotlin.String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **maxResults** | **kotlin.Int**| The maximum number of search results to be returned by a request. | [optional] [default to 10]
 **sortOrder** | **kotlin.String**| This order in which to return results. | [optional] [enum: recency, relevancy]
 **nextToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**TweetSearchResponse**](TweetSearchResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="tweetsRecentSearch"></a>
# **tweetsRecentSearch**
> TweetSearchResponse tweetsRecentSearch(query, startTime, endTime, sinceId, untilId, maxResults, sortOrder, nextToken, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Recent search

Returns Tweets from the last 7 days that match a search query.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val query : kotlin.String = (from:TwitterDev OR from:TwitterAPI) has:media -is:retweet // kotlin.String | One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length
val startTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute).
val endTime : java.time.OffsetDateTime = 2013-10-20T19:20:30+01:00 // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute).
val sinceId : kotlin.String = sinceId_example // kotlin.String | Returns results with a Tweet ID greater than (that is, more recent than) the specified ID.
val untilId : kotlin.String = untilId_example // kotlin.String | Returns results with a Tweet ID less than (that is, older than) the specified ID.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of search results to be returned by a request.
val sortOrder : kotlin.String = sortOrder_example // kotlin.String | This order in which to return results.
val nextToken : kotlin.String = nextToken_example // kotlin.String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified.
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : TweetSearchResponse = apiInstance.tweetsRecentSearch(query, startTime, endTime, sinceId, untilId, maxResults, sortOrder, nextToken, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#tweetsRecentSearch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#tweetsRecentSearch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **query** | **kotlin.String**| One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length |
 **startTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). | [optional]
 **endTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). | [optional]
 **sinceId** | **kotlin.String**| Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. | [optional]
 **untilId** | **kotlin.String**| Returns results with a Tweet ID less than (that is, older than) the specified ID. | [optional]
 **maxResults** | **kotlin.Int**| The maximum number of search results to be returned by a request. | [optional] [default to 10]
 **sortOrder** | **kotlin.String**| This order in which to return results. | [optional] [enum: recency, relevancy]
 **nextToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. | [optional]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**TweetSearchResponse**](TweetSearchResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdLike"></a>
# **usersIdLike**
> UsersLikesCreateResponse usersIdLike(id, usersLikesCreateRequest)

Causes the user (in the path) to like the specified tweet

Causes the user (in the path) to like the specified tweet. The user in the path must match the user context authorizing the request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user that is requesting to like the tweet
val usersLikesCreateRequest : UsersLikesCreateRequest =  // UsersLikesCreateRequest | 
try {
    val result : UsersLikesCreateResponse = apiInstance.usersIdLike(id, usersLikesCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#usersIdLike")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#usersIdLike")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user that is requesting to like the tweet |
 **usersLikesCreateRequest** | [**UsersLikesCreateRequest**](UsersLikesCreateRequest.md)|  | [optional]

### Return type

[**UsersLikesCreateResponse**](UsersLikesCreateResponse.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="usersIdLikedTweets"></a>
# **usersIdLikedTweets**
> InlineResponse2002 usersIdLikedTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

Returns Tweet objects liked by the provided User ID

Returns a list of Tweets liked by the provided User ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the User to list the liked Tweets of
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results.
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : InlineResponse2002 = apiInstance.usersIdLikedTweets(id, maxResults, paginationToken, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#usersIdLikedTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#usersIdLikedTweets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the User to list the liked Tweets of |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdMentions"></a>
# **usersIdMentions**
> GenericTweetsTimelineResponse usersIdMentions(id, sinceId, untilId, maxResults, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

User mention timeline by User ID

Returns Tweet objects that mention username associated to the provided User ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the User to list mentions of
val sinceId : kotlin.String = 791775337160081409 // kotlin.String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
val untilId : kotlin.String = 1346889436626259968 // kotlin.String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results.
val startTime : java.time.OffsetDateTime = 2021-02-01T18:40:40.000Z // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
val endTime : java.time.OffsetDateTime = 2021-02-14T18:40:40.000Z // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : GenericTweetsTimelineResponse = apiInstance.usersIdMentions(id, sinceId, untilId, maxResults, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#usersIdMentions")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#usersIdMentions")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the User to list mentions of |
 **sinceId** | **kotlin.String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional]
 **untilId** | **kotlin.String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional]
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **startTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional]
 **endTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**GenericTweetsTimelineResponse**](GenericTweetsTimelineResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdRetweets"></a>
# **usersIdRetweets**
> UsersRetweetsCreateResponse usersIdRetweets(id, usersRetweetsCreateRequest)

Causes the user (in the path) to retweet the specified tweet

Causes the user (in the path) to retweet the specified tweet. The user in the path must match the user context authorizing the request.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user that is requesting to retweet the tweet
val usersRetweetsCreateRequest : UsersRetweetsCreateRequest =  // UsersRetweetsCreateRequest | 
try {
    val result : UsersRetweetsCreateResponse = apiInstance.usersIdRetweets(id, usersRetweetsCreateRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#usersIdRetweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#usersIdRetweets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user that is requesting to retweet the tweet |
 **usersRetweetsCreateRequest** | [**UsersRetweetsCreateRequest**](UsersRetweetsCreateRequest.md)|  | [optional]

### Return type

[**UsersRetweetsCreateResponse**](UsersRetweetsCreateResponse.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="usersIdTweets"></a>
# **usersIdTweets**
> GenericTweetsTimelineResponse usersIdTweets(id, sinceId, untilId, maxResults, exclude, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)

User Tweets timeline by User ID

Returns a list of Tweets authored by the provided User ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the User to list Tweets of
val sinceId : kotlin.String = 791775337160081409 // kotlin.String | The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified.
val untilId : kotlin.String = 1346889436626259968 // kotlin.String | The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified.
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val exclude : kotlin.collections.Set<kotlin.String> = ["replies","retweets"] // kotlin.collections.Set<kotlin.String> | The set of entities to exclude (e.g. 'replies' or 'retweets')
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results.
val startTime : java.time.OffsetDateTime = 2021-02-01T18:40:40.000Z // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified.
val endTime : java.time.OffsetDateTime = 2021-02-14T18:40:40.000Z // java.time.OffsetDateTime | YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified.
val expansions : kotlin.collections.Set<kotlin.String> = ["author_id","referenced_tweets.id","in_reply_to_user_id","geo.place_id","attachments.media_keys","attachments.poll_ids","entities.mentions.username","referenced_tweets.id.author_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
val mediaFields : kotlin.collections.Set<kotlin.String> = ["media_key","duration_ms","height","preview_image_url","type","url","width","public_metrics","non_public_metrics","organic_metrics","promoted_metrics","alt_text","variants"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Media fields to display.
val placeFields : kotlin.collections.Set<kotlin.String> = ["id","name","country_code","place_type","full_name","country","contained_within","geo"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Place fields to display.
val pollFields : kotlin.collections.Set<kotlin.String> = ["duration_minutes","options","voting_status","end_datetime"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Poll fields to display.
try {
    val result : GenericTweetsTimelineResponse = apiInstance.usersIdTweets(id, sinceId, untilId, maxResults, exclude, paginationToken, startTime, endTime, expansions, tweetFields, userFields, mediaFields, placeFields, pollFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#usersIdTweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#usersIdTweets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the User to list Tweets of |
 **sinceId** | **kotlin.String**| The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. | [optional]
 **untilId** | **kotlin.String**| The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. | [optional]
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional]
 **exclude** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;) | [optional] [enum: replies, retweets]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]
 **startTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. | [optional]
 **endTime** | **java.time.OffsetDateTime**| YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. | [optional]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: author_id, referenced_tweets.id, in_reply_to_user_id, geo.place_id, attachments.media_keys, attachments.poll_ids, entities.mentions.username, referenced_tweets.id.author_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]
 **mediaFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Media fields to display. | [optional] [enum: media_key, duration_ms, height, preview_image_url, type, url, width, public_metrics, non_public_metrics, organic_metrics, promoted_metrics, alt_text, variants]
 **placeFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Place fields to display. | [optional] [enum: id, name, country_code, place_type, full_name, country, contained_within, geo]
 **pollFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Poll fields to display. | [optional] [enum: id, options, voting_status, end_datetime, duration_minutes]

### Return type

[**GenericTweetsTimelineResponse**](GenericTweetsTimelineResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdUnlike"></a>
# **usersIdUnlike**
> UsersLikesDeleteResponse usersIdUnlike(id, tweetId)

Causes the user (in the path) to unlike the specified tweet

Causes the user (in the path) to unlike the specified tweet. The user must match the user context authorizing the request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user that is requesting to unlike the tweet
val tweetId : kotlin.String = tweetId_example // kotlin.String | The ID of the tweet that the user is requesting to unlike
try {
    val result : UsersLikesDeleteResponse = apiInstance.usersIdUnlike(id, tweetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#usersIdUnlike")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#usersIdUnlike")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user that is requesting to unlike the tweet |
 **tweetId** | **kotlin.String**| The ID of the tweet that the user is requesting to unlike |

### Return type

[**UsersLikesDeleteResponse**](UsersLikesDeleteResponse.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdUnretweets"></a>
# **usersIdUnretweets**
> UsersRetweetsDeleteResponse usersIdUnretweets(id, sourceTweetId)

Causes the user (in the path) to unretweet the specified tweet

Causes the user (in the path) to unretweet the specified tweet. The user must match the user context authorizing the request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = TweetsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user that is requesting to unretweet the tweet
val sourceTweetId : kotlin.String = sourceTweetId_example // kotlin.String | The ID of the tweet that the user is requesting to unretweet
try {
    val result : UsersRetweetsDeleteResponse = apiInstance.usersIdUnretweets(id, sourceTweetId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TweetsApi#usersIdUnretweets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TweetsApi#usersIdUnretweets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user that is requesting to unretweet the tweet |
 **sourceTweetId** | **kotlin.String**| The ID of the tweet that the user is requesting to unretweet |

### Return type

[**UsersRetweetsDeleteResponse**](UsersRetweetsDeleteResponse.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

