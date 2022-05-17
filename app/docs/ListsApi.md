# ListsApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserListMemberships**](ListsApi.md#getUserListMemberships) | **GET** /2/users/{id}/list_memberships | Get a User&#39;s List Memberships
[**listAddMember**](ListsApi.md#listAddMember) | **POST** /2/lists/{id}/members | Add a List member
[**listIdCreate**](ListsApi.md#listIdCreate) | **POST** /2/lists | Create List
[**listIdDelete**](ListsApi.md#listIdDelete) | **DELETE** /2/lists/{id} | Delete List
[**listIdGet**](ListsApi.md#listIdGet) | **GET** /2/lists/{id} | List lookup by List ID
[**listIdUpdate**](ListsApi.md#listIdUpdate) | **PUT** /2/lists/{id} | Update List
[**listRemoveMember**](ListsApi.md#listRemoveMember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member
[**listUserFollow**](ListsApi.md#listUserFollow) | **POST** /2/users/{id}/followed_lists | Follow a List
[**listUserOwnedLists**](ListsApi.md#listUserOwnedLists) | **GET** /2/users/{id}/owned_lists | Get a User&#39;s Owned Lists
[**listUserPin**](ListsApi.md#listUserPin) | **POST** /2/users/{id}/pinned_lists | Pin a List
[**listUserPinnedLists**](ListsApi.md#listUserPinnedLists) | **GET** /2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists
[**listUserUnfollow**](ListsApi.md#listUserUnfollow) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List
[**listUserUnpin**](ListsApi.md#listUserUnpin) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List
[**userFollowedLists**](ListsApi.md#userFollowedLists) | **GET** /2/users/{id}/followed_lists | Get User&#39;s Followed Lists


<a name="getUserListMemberships"></a>
# **getUserListMemberships**
> MultiListResponseEntity getUserListMemberships(id, maxResults, paginationToken, listFields, expansions, userFields)

Get a User&#39;s List Memberships

Get a User&#39;s List Memberships.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.Long = 789 // kotlin.Long | This parameter is used to get a specified 'page' of results.
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : MultiListResponseEntity = apiInstance.getUserListMemberships(id, maxResults, paginationToken, listFields, expansions, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#getUserListMemberships")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#getUserListMemberships")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **kotlin.Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **listFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListResponseEntity**](MultiListResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listAddMember"></a>
# **listAddMember**
> ListMemberResponseEntity listAddMember(id, listAddMemberRequestEntity)

Add a List member

Causes a user to become a member of a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the List to add a member
val listAddMemberRequestEntity : ListAddMemberRequestEntity =  // ListAddMemberRequestEntity | 
try {
    val result : ListMemberResponseEntity = apiInstance.listAddMember(id, listAddMemberRequestEntity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listAddMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listAddMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the List to add a member |
 **listAddMemberRequestEntity** | [**ListAddMemberRequestEntity**](ListAddMemberRequestEntity.md)|  | [optional]

### Return type

[**ListMemberResponseEntity**](ListMemberResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="listIdCreate"></a>
# **listIdCreate**
> ListCreateResponseEntity listIdCreate(listCreateRequestEntity)

Create List

Creates a new List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val listCreateRequestEntity : ListCreateRequestEntity =  // ListCreateRequestEntity | 
try {
    val result : ListCreateResponseEntity = apiInstance.listIdCreate(listCreateRequestEntity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listIdCreate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listIdCreate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listCreateRequestEntity** | [**ListCreateRequestEntity**](ListCreateRequestEntity.md)|  | [optional]

### Return type

[**ListCreateResponseEntity**](ListCreateResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="listIdDelete"></a>
# **listIdDelete**
> ListDeleteResponseEntity listIdDelete(id)

Delete List

Delete a List that you own.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the List to delete
try {
    val result : ListDeleteResponseEntity = apiInstance.listIdDelete(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listIdDelete")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listIdDelete")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the List to delete |

### Return type

[**ListDeleteResponseEntity**](ListDeleteResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listIdGet"></a>
# **listIdGet**
> SingleListLookupResponseEntity listIdGet(id, listFields, expansions, userFields)

List lookup by List ID

Returns a List

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the List to get
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : SingleListLookupResponseEntity = apiInstance.listIdGet(id, listFields, expansions, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listIdGet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listIdGet")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the List to get |
 **listFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**SingleListLookupResponseEntity**](SingleListLookupResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listIdUpdate"></a>
# **listIdUpdate**
> ListUpdateResponseEntity listIdUpdate(id, listUpdateRequestEntity)

Update List

Update a List that you own.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the List to modify
val listUpdateRequestEntity : ListUpdateRequestEntity =  // ListUpdateRequestEntity | 
try {
    val result : ListUpdateResponseEntity = apiInstance.listIdUpdate(id, listUpdateRequestEntity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listIdUpdate")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listIdUpdate")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the List to modify |
 **listUpdateRequestEntity** | [**ListUpdateRequestEntity**](ListUpdateRequestEntity.md)|  | [optional]

### Return type

[**ListUpdateResponseEntity**](ListUpdateResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="listRemoveMember"></a>
# **listRemoveMember**
> ListMemberResponseEntity listRemoveMember(id, userId)

Remove a List member

Causes a user to be removed from the members of a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the List to remove a member
val userId : kotlin.String = userId_example // kotlin.String | The ID of user that will be removed from the List
try {
    val result : ListMemberResponseEntity = apiInstance.listRemoveMember(id, userId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listRemoveMember")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listRemoveMember")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the List to remove a member |
 **userId** | **kotlin.String**| The ID of user that will be removed from the List |

### Return type

[**ListMemberResponseEntity**](ListMemberResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listUserFollow"></a>
# **listUserFollow**
> ListFollowedResponseEntity listUserFollow(id, listFollowRequestEntity)

Follow a List

Causes a user to follow a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the authenticated source user that will follow the List
val listFollowRequestEntity : ListFollowRequestEntity =  // ListFollowRequestEntity | 
try {
    val result : ListFollowedResponseEntity = apiInstance.listUserFollow(id, listFollowRequestEntity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listUserFollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listUserFollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the authenticated source user that will follow the List |
 **listFollowRequestEntity** | [**ListFollowRequestEntity**](ListFollowRequestEntity.md)|  | [optional]

### Return type

[**ListFollowedResponseEntity**](ListFollowedResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="listUserOwnedLists"></a>
# **listUserOwnedLists**
> MultiListResponseEntity listUserOwnedLists(id, maxResults, paginationToken, listFields, expansions, userFields)

Get a User&#39;s Owned Lists

Get a User&#39;s Owned Lists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.Long = 789 // kotlin.Long | This parameter is used to get a specified 'page' of results.
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : MultiListResponseEntity = apiInstance.listUserOwnedLists(id, maxResults, paginationToken, listFields, expansions, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listUserOwnedLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listUserOwnedLists")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **kotlin.Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **listFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListResponseEntity**](MultiListResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listUserPin"></a>
# **listUserPin**
> ListPinnedResponseEntity listUserPin(id, listPinRequestEntity)

Pin a List

Causes a user to pin a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the authenticated source user that will pin the List
val listPinRequestEntity : ListPinRequestEntity =  // ListPinRequestEntity | 
try {
    val result : ListPinnedResponseEntity = apiInstance.listUserPin(id, listPinRequestEntity)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listUserPin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listUserPin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the authenticated source user that will pin the List |
 **listPinRequestEntity** | [**ListPinRequestEntity**](ListPinRequestEntity.md)|  | [optional]

### Return type

[**ListPinnedResponseEntity**](ListPinnedResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="listUserPinnedLists"></a>
# **listUserPinnedLists**
> MultiListNoPaginationResponseEntity listUserPinnedLists(id, listFields, expansions, userFields)

Get a User&#39;s Pinned Lists

Get a User&#39;s Pinned Lists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : MultiListNoPaginationResponseEntity = apiInstance.listUserPinnedLists(id, listFields, expansions, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listUserPinnedLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listUserPinnedLists")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to return results |
 **listFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListNoPaginationResponseEntity**](MultiListNoPaginationResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listUserUnfollow"></a>
# **listUserUnfollow**
> ListFollowedResponseEntity listUserUnfollow(id, listId)

Unfollow a List

Causes a user to unfollow a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the authenticated source user that will unfollow the List
val listId : kotlin.String = listId_example // kotlin.String | The ID of the List to unfollow
try {
    val result : ListFollowedResponseEntity = apiInstance.listUserUnfollow(id, listId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listUserUnfollow")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listUserUnfollow")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the authenticated source user that will unfollow the List |
 **listId** | **kotlin.String**| The ID of the List to unfollow |

### Return type

[**ListFollowedResponseEntity**](ListFollowedResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listUserUnpin"></a>
# **listUserUnpin**
> ListPinnedResponseEntity listUserUnpin(id, listId)

Unpin a List

Causes a user to remove a pinned List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the authenticated source user that will remove the pinned List
val listId : kotlin.String = listId_example // kotlin.String | The ID of the List to unpin
try {
    val result : ListPinnedResponseEntity = apiInstance.listUserUnpin(id, listId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#listUserUnpin")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#listUserUnpin")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the authenticated source user that will remove the pinned List |
 **listId** | **kotlin.String**| The ID of the List to unpin |

### Return type

[**ListPinnedResponseEntity**](ListPinnedResponseEntity.md)

### Authorization


Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="userFollowedLists"></a>
# **userFollowedLists**
> MultiListResponseEntity userFollowedLists(id, maxResults, paginationToken, listFields, expansions, userFields)

Get User&#39;s Followed Lists

Returns a user&#39;s followed Lists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ListsApi()
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.Long = 789 // kotlin.Long | This parameter is used to get a specified 'page' of results.
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.
try {
    val result : MultiListResponseEntity = apiInstance.userFollowedLists(id, maxResults, paginationToken, listFields, expansions, userFields)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ListsApi#userFollowedLists")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ListsApi#userFollowedLists")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the user for whom to return results |
 **maxResults** | **kotlin.Int**| The maximum number of results | [optional] [default to 100]
 **paginationToken** | **kotlin.Long**| This parameter is used to get a specified &#39;page&#39; of results. | [optional]
 **listFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of List fields to display. | [optional] [enum: created_at, description, follower_count, id, member_count, name, owner_id, private]
 **expansions** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of fields to expand. | [optional] [enum: owner_id]
 **userFields** | [**kotlin.collections.Set&lt;kotlin.String&gt;**](kotlin.String.md)| A comma separated list of User fields to display. | [optional] [enum: id, created_at, name, username, protected, verified, withheld, profile_image_url, location, url, description, entities, pinned_tweet_id, public_metrics]

### Return type

[**MultiListResponseEntity**](MultiListResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""
Configure OAuth2UserToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

