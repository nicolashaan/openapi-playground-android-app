# UsersApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**findMyUser**](UsersApi.md#findMyUser) | **GET** /2/users/me | User lookup me
[**findUserById**](UsersApi.md#findUserById) | **GET** /2/users/{id} | User lookup by ID
[**findUserByUsername**](UsersApi.md#findUserByUsername) | **GET** /2/users/by/username/{username} | User lookup by username
[**findUsersById**](UsersApi.md#findUsersById) | **GET** /2/users | User lookup by IDs
[**findUsersByUsername**](UsersApi.md#findUsersByUsername) | **GET** /2/users/by | User lookup by usernames
[**listGetFollowers**](UsersApi.md#listGetFollowers) | **GET** /2/lists/{id}/followers | Returns user objects that follow a List by the provided List ID
[**listGetMembers**](UsersApi.md#listGetMembers) | **GET** /2/lists/{id}/members | Returns user objects that are members of a List by the provided List ID
[**tweetsIdLikingUsers**](UsersApi.md#tweetsIdLikingUsers) | **GET** /2/tweets/{id}/liking_users | Returns user objects that have liked the provided Tweet ID
[**tweetsIdRetweetingUsers**](UsersApi.md#tweetsIdRetweetingUsers) | **GET** /2/tweets/{id}/retweeted_by | Returns user objects that have retweeted the provided Tweet ID
[**usersIdBlock**](UsersApi.md#usersIdBlock) | **POST** /2/users/{id}/blocking | Block User by User ID
[**usersIdBlocking**](UsersApi.md#usersIdBlocking) | **GET** /2/users/{id}/blocking | Returns user objects that are blocked by provided user ID
[**usersIdFollow**](UsersApi.md#usersIdFollow) | **POST** /2/users/{id}/following | Follow User
[**usersIdFollowers**](UsersApi.md#usersIdFollowers) | **GET** /2/users/{id}/followers | Returns user objects that follow the provided user ID
[**usersIdFollowing**](UsersApi.md#usersIdFollowing) | **GET** /2/users/{id}/following | Following by User ID
[**usersIdMute**](UsersApi.md#usersIdMute) | **POST** /2/users/{id}/muting | Mute User by User ID
[**usersIdMuting**](UsersApi.md#usersIdMuting) | **GET** /2/users/{id}/muting | Returns user objects that are muted by the provided user ID
[**usersIdUnblock**](UsersApi.md#usersIdUnblock) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID
[**usersIdUnfollow**](UsersApi.md#usersIdUnfollow) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User
[**usersIdUnmute**](UsersApi.md#usersIdUnmute) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID


<a name="findMyUser"></a>
# **findMyUser**
> SingleUserLookupResponseEntity findMyUser(expansions, tweetFields, userFields)

User lookup me

This endpoint returns information about the requesting user.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val expansions : kotlin.collections.Set<kotlin.String> = ["pinned_tweet_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : SingleUserLookupResponseEntity = apiInstance.findMyUser(expansions, tweetFields, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findMyUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findMyUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**SingleUserLookupResponseEntity**](SingleUserLookupResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="findUserById"></a>
# **findUserById**
> SingleUserLookupResponseEntity findUserById(id, expansions, tweetFields, userFields)

User lookup by ID

This endpoint returns information about a user. Specify user by ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = 2244994945 // kotlin.String | Required. A User ID.
val expansions : kotlin.collections.Set<kotlin.String> = ["pinned_tweet_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : SingleUserLookupResponseEntity = apiInstance.findUserById(id, expansions, tweetFields, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUserById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUserById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| Required. A User ID. |
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**SingleUserLookupResponseEntity**](SingleUserLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="findUserByUsername"></a>
# **findUserByUsername**
> SingleUserLookupResponseEntity findUserByUsername(username, expansions, tweetFields, userFields)

User lookup by username

This endpoint returns information about a user. Specify user by username.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val username : kotlin.String = TwitterDev // kotlin.String | Required. A username.
val expansions : kotlin.collections.Set<kotlin.String> = ["pinned_tweet_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : SingleUserLookupResponseEntity = apiInstance.findUserByUsername(username, expansions, tweetFields, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUserByUsername")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUserByUsername")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| Required. A username. |
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**SingleUserLookupResponseEntity**](SingleUserLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="findUsersById"></a>
# **findUsersById**
> MultiUserLookupResponseEntity findUsersById(ids, expansions, tweetFields, userFields)

User lookup by IDs

This endpoint returns information about users. Specify users by their ID.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val ids : kotlin.collections.List<kotlin.String> = 2244994945,6253282,12 // kotlin.collections.List<kotlin.String> | Required. A list of User IDs, comma-separated. You can specify up to 100 IDs.
val expansions : kotlin.collections.Set<kotlin.String> = ["pinned_tweet_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : MultiUserLookupResponseEntity = apiInstance.findUsersById(ids, expansions, tweetFields, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUsersById")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUsersById")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Required. A list of User IDs, comma-separated. You can specify up to 100 IDs. |
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiUserLookupResponseEntity**](MultiUserLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="findUsersByUsername"></a>
# **findUsersByUsername**
> MultiUserLookupResponseEntity findUsersByUsername(usernames, expansions, tweetFields, userFields)

User lookup by usernames

This endpoint returns information about users. Specify users by their username.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val usernames : kotlin.collections.List<kotlin.String> = TwitterDev,TwitterAPI,jack // kotlin.collections.List<kotlin.String> | Required . A list of usernames, comma-separated. You can specify up to 100 usernames.
val expansions : kotlin.collections.Set<kotlin.String> = ["pinned_tweet_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : MultiUserLookupResponseEntity = apiInstance.findUsersByUsername(usernames, expansions, tweetFields, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#findUsersByUsername")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#findUsersByUsername")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **usernames** | [**kotlin.collections.List&lt;kotlin.String&gt;**](kotlin.String.md)| Required . A list of usernames, comma-separated. You can specify up to 100 usernames. |
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiUserLookupResponseEntity**](MultiUserLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listGetFollowers"></a>
# **listGetFollowers**
> ListLookupMultipleUsersLookupResponseEntity listGetFollowers(id, maxResults, paginationToken, expansions, tweetFields, userFields)

Returns user objects that follow a List by the provided List ID

Returns a list of users that follow a List by the provided List ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the List for which to return followers
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.Long = 789 // kotlin.Long | This parameter is used to get a specified 'page' of results.
val expansions : kotlin.collections.Set<kotlin.String> = ["pinned_tweet_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : ListLookupMultipleUsersLookupResponseEntity = apiInstance.listGetFollowers(id, maxResults, paginationToken, expansions, tweetFields, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#listGetFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#listGetFollowers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the List for which to return followers |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **kotlin.Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**ListLookupMultipleUsersLookupResponseEntity**](ListLookupMultipleUsersLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listGetMembers"></a>
# **listGetMembers**
> ListLookupMultipleUsersLookupResponseEntity listGetMembers(id, maxResults, paginationToken, expansions, tweetFields, userFields)

Returns user objects that are members of a List by the provided List ID

Returns a list of users that are members of a List by the provided List ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the List for which to return members
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.Long = 789 // kotlin.Long | This parameter is used to get a specified 'page' of results.
val expansions : kotlin.collections.Set<kotlin.String> = ["pinned_tweet_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val tweetFields : kotlin.collections.Set<kotlin.String> = ["created_at","author_id","entities","conversation_id","reply_settings","public_metrics"] // kotlin.collections.Set<kotlin.String> | A comma separated list of Tweet fields to display.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : ListLookupMultipleUsersLookupResponseEntity = apiInstance.listGetMembers(id, maxResults, paginationToken, expansions, tweetFields, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#listGetMembers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#listGetMembers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the List for which to return members |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **kotlin.Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: pinned_tweet_id]
 **tweetFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of Tweet fields to display. | [optional] [enum: id, created_at, text, author_id, in_reply_to_user_id, referenced_tweets, attachments, withheld, geo, entities, public_metrics, possibly_sensitive, source, lang, context_annotations, non_public_metrics, promoted_metrics, organic_metrics, conversation_id, reply_settings]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**ListLookupMultipleUsersLookupResponseEntity**](ListLookupMultipleUsersLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="tweetsIdLikingUsers"></a>
# **tweetsIdLikingUsers**
> GenericMultipleUsersLookupResponseEntity tweetsIdLikingUsers(id, maxResults, paginationToken)

Returns user objects that have liked the provided Tweet ID

Returns a list of users that have liked the provided Tweet ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the Tweet for which to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results.
try {
    val result : GenericMultipleUsersLookupResponseEntity = apiInstance.tweetsIdLikingUsers(id, maxResults, paginationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#tweetsIdLikingUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#tweetsIdLikingUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the Tweet for which to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponseEntity**](GenericMultipleUsersLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="tweetsIdRetweetingUsers"></a>
# **tweetsIdRetweetingUsers**
> GenericMultipleUsersLookupResponseEntity tweetsIdRetweetingUsers(id, maxResults, paginationToken)

Returns user objects that have retweeted the provided Tweet ID

Returns a list of users that have retweeted the provided Tweet ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the Tweet for which to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results.
try {
    val result : GenericMultipleUsersLookupResponseEntity = apiInstance.tweetsIdRetweetingUsers(id, maxResults, paginationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#tweetsIdRetweetingUsers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#tweetsIdRetweetingUsers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the Tweet for which to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponseEntity**](GenericMultipleUsersLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdBlock"></a>
# **usersIdBlock**
> UsersBlockingMutationResponseEntity usersIdBlock(id, inlineObjectEntity)

Block User by User ID

Causes the user (in the path) to block the target user. The user (in the path) must match the user context authorizing the request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user that is requesting to block the target user
val inlineObjectEntity : InlineObjectEntity =  // InlineObjectEntity | 
try {
    val result : UsersBlockingMutationResponseEntity = apiInstance.usersIdBlock(id, inlineObjectEntity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdBlock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdBlock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user that is requesting to block the target user |
 **inlineObjectEntity** | [**InlineObjectEntity**](InlineObjectEntity.md)|  | [optional]

### Return type

[**UsersBlockingMutationResponseEntity**](UsersBlockingMutationResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="usersIdBlocking"></a>
# **usersIdBlocking**
> GenericMultipleUsersLookupResponseEntity usersIdBlocking(id, maxResults, paginationToken)

Returns user objects that are blocked by provided user ID

Returns a list of users that are blocked by the provided user ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
try {
    val result : GenericMultipleUsersLookupResponseEntity = apiInstance.usersIdBlocking(id, maxResults, paginationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdBlocking")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdBlocking")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional]
 **paginationToken** | **kotlin.String**| This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponseEntity**](GenericMultipleUsersLookupResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdFollow"></a>
# **usersIdFollow**
> UsersFollowingCreateResponseEntity usersIdFollow(id, inlineObject2Entity)

Follow User

Causes the user(in the path) to follow, or “request to follow” for protected users, the target user. The user(in the path) must match the user context authorizing the request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user that is requesting to follow the target user
val inlineObject2Entity : InlineObject2Entity =  // InlineObject2Entity | 
try {
    val result : UsersFollowingCreateResponseEntity = apiInstance.usersIdFollow(id, inlineObject2Entity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdFollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdFollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user that is requesting to follow the target user |
 **inlineObject2Entity** | [**InlineObject2Entity**](InlineObject2Entity.md)|  | [optional]

### Return type

[**UsersFollowingCreateResponseEntity**](UsersFollowingCreateResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="usersIdFollowers"></a>
# **usersIdFollowers**
> GenericMultipleUsersLookupResponseEntity usersIdFollowers(id, maxResults, paginationToken)

Returns user objects that follow the provided user ID

Returns a list of users that follow the provided user ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
try {
    val result : GenericMultipleUsersLookupResponseEntity = apiInstance.usersIdFollowers(id, maxResults, paginationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdFollowers")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdFollowers")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional]
 **paginationToken** | **kotlin.String**| This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponseEntity**](GenericMultipleUsersLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdFollowing"></a>
# **usersIdFollowing**
> UsersFollowingLookupResponseEntity usersIdFollowing(id, maxResults, paginationToken)

Following by User ID

Returns a list of users that are being followed by the provided user ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This value is populated by passing the 'next_token' or 'previous_token' returned in a request to paginate through results.
try {
    val result : UsersFollowingLookupResponseEntity = apiInstance.usersIdFollowing(id, maxResults, paginationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdFollowing")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdFollowing")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional]
 **paginationToken** | **kotlin.String**| This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. | [optional]

### Return type

[**UsersFollowingLookupResponseEntity**](UsersFollowingLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdMute"></a>
# **usersIdMute**
> UsersMutingMutationResponseEntity usersIdMute(id, inlineObject1Entity)

Mute User by User ID

Causes the user (in the path) to mute the target user. The user (in the path) must match the user context authorizing the request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user that is requesting to mute the target user
val inlineObject1Entity : InlineObject1Entity =  // InlineObject1Entity | 
try {
    val result : UsersMutingMutationResponseEntity = apiInstance.usersIdMute(id, inlineObject1Entity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdMute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdMute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user that is requesting to mute the target user |
 **inlineObject1Entity** | [**InlineObject1Entity**](InlineObject1Entity.md)|  | [optional]

### Return type

[**UsersMutingMutationResponseEntity**](UsersMutingMutationResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="usersIdMuting"></a>
# **usersIdMuting**
> GenericMultipleUsersLookupResponseEntity usersIdMuting(id, maxResults, paginationToken)

Returns user objects that are muted by the provided user ID

Returns a list of users that are muted by the provided user ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.String = paginationToken_example // kotlin.String | This parameter is used to get the next 'page' of results.
try {
    val result : GenericMultipleUsersLookupResponseEntity = apiInstance.usersIdMuting(id, maxResults, paginationToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdMuting")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdMuting")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **kotlin.String**| This parameter is used to get the next &#39;page&#39; of results. | [optional]

### Return type

[**GenericMultipleUsersLookupResponseEntity**](GenericMultipleUsersLookupResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdUnblock"></a>
# **usersIdUnblock**
> UsersBlockingMutationResponseEntity usersIdUnblock(sourceUserId, targetUserId)

Unblock User by User ID

Causes the source user to unblock the target user. The source user must match the user context authorizing the request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val sourceUserId : kotlin.String = sourceUserId_example // kotlin.String | The ID of the user that is requesting to unblock the target user
val targetUserId : kotlin.String = targetUserId_example // kotlin.String | The ID of the user that the source user is requesting to unblock
try {
    val result : UsersBlockingMutationResponseEntity = apiInstance.usersIdUnblock(sourceUserId, targetUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdUnblock")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdUnblock")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceUserId** | **kotlin.String**| The ID of the user that is requesting to unblock the target user |
 **targetUserId** | **kotlin.String**| The ID of the user that the source user is requesting to unblock |

### Return type

[**UsersBlockingMutationResponseEntity**](UsersBlockingMutationResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdUnfollow"></a>
# **usersIdUnfollow**
> UsersFollowingDeleteResponseEntity usersIdUnfollow(sourceUserId, targetUserId)

Unfollow User

Causes the source user to unfollow the target user. The source user must match the user context authorizing the request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val sourceUserId : kotlin.String = sourceUserId_example // kotlin.String | The ID of the user that is requesting to unfollow the target user
val targetUserId : kotlin.String = targetUserId_example // kotlin.String | The ID of the user that the source user is requesting to unfollow
try {
    val result : UsersFollowingDeleteResponseEntity = apiInstance.usersIdUnfollow(sourceUserId, targetUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdUnfollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdUnfollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceUserId** | **kotlin.String**| The ID of the user that is requesting to unfollow the target user |
 **targetUserId** | **kotlin.String**| The ID of the user that the source user is requesting to unfollow |

### Return type

[**UsersFollowingDeleteResponseEntity**](UsersFollowingDeleteResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="usersIdUnmute"></a>
# **usersIdUnmute**
> UsersMutingMutationResponseEntity usersIdUnmute(sourceUserId, targetUserId)

Unmute User by User ID

Causes the source user to unmute the target user. The source user must match the user context authorizing the request

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = UsersApi()
val sourceUserId : kotlin.String = sourceUserId_example // kotlin.String | The ID of the user that is requesting to unmute the target user
val targetUserId : kotlin.String = targetUserId_example // kotlin.String | The ID of the user that the source user is requesting to unmute
try {
    val result : UsersMutingMutationResponseEntity = apiInstance.usersIdUnmute(sourceUserId, targetUserId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling UsersApi#usersIdUnmute")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UsersApi#usersIdUnmute")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sourceUserId** | **kotlin.String**| The ID of the user that is requesting to unmute the target user |
 **targetUserId** | **kotlin.String**| The ID of the user that the source user is requesting to unmute |

### Return type

[**UsersMutingMutationResponseEntity**](UsersMutingMutationResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

