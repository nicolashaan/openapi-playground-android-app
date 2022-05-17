# ListsApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUserListMemberships**](ListsApi.md#getUserListMemberships) | **GET** 2/users/{id}/list_memberships | Get a User&#39;s List Memberships
[**listAddMember**](ListsApi.md#listAddMember) | **POST** 2/lists/{id}/members | Add a List member
[**listIdCreate**](ListsApi.md#listIdCreate) | **POST** 2/lists | Create List
[**listIdDelete**](ListsApi.md#listIdDelete) | **DELETE** 2/lists/{id} | Delete List
[**listIdGet**](ListsApi.md#listIdGet) | **GET** 2/lists/{id} | List lookup by List ID
[**listIdUpdate**](ListsApi.md#listIdUpdate) | **PUT** 2/lists/{id} | Update List
[**listRemoveMember**](ListsApi.md#listRemoveMember) | **DELETE** 2/lists/{id}/members/{user_id} | Remove a List member
[**listUserFollow**](ListsApi.md#listUserFollow) | **POST** 2/users/{id}/followed_lists | Follow a List
[**listUserOwnedLists**](ListsApi.md#listUserOwnedLists) | **GET** 2/users/{id}/owned_lists | Get a User&#39;s Owned Lists
[**listUserPin**](ListsApi.md#listUserPin) | **POST** 2/users/{id}/pinned_lists | Pin a List
[**listUserPinnedLists**](ListsApi.md#listUserPinnedLists) | **GET** 2/users/{id}/pinned_lists | Get a User&#39;s Pinned Lists
[**listUserUnfollow**](ListsApi.md#listUserUnfollow) | **DELETE** 2/users/{id}/followed_lists/{list_id} | Unfollow a List
[**listUserUnpin**](ListsApi.md#listUserUnpin) | **DELETE** 2/users/{id}/pinned_lists/{list_id} | Unpin a List
[**userFollowedLists**](ListsApi.md#userFollowedLists) | **GET** 2/users/{id}/followed_lists | Get User&#39;s Followed Lists



Get a User&#39;s List Memberships

Get a User&#39;s List Memberships.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.Long = 789 // kotlin.Long | This parameter is used to get a specified 'page' of results.
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.

launch(Dispatchers.IO) {
    val result : MultiListResponseEntity = webService.getUserListMemberships(id, maxResults, paginationToken, listFields, expansions, userFields)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json


Add a List member

Causes a user to become a member of a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the List to add a member
val listAddMemberRequestEntity : ListAddMemberRequestEntity =  // ListAddMemberRequestEntity | 

launch(Dispatchers.IO) {
    val result : ListMemberResponseEntity = webService.listAddMember(id, listAddMemberRequestEntity)
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



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json


Create List

Creates a new List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val listCreateRequestEntity : ListCreateRequestEntity =  // ListCreateRequestEntity | 

launch(Dispatchers.IO) {
    val result : ListCreateResponseEntity = webService.listIdCreate(listCreateRequestEntity)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **listCreateRequestEntity** | [**ListCreateRequestEntity**](ListCreateRequestEntity.md)|  | [optional]

### Return type

[**ListCreateResponseEntity**](ListCreateResponseEntity.md)

### Authorization



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json


Delete List

Delete a List that you own.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the List to delete

launch(Dispatchers.IO) {
    val result : ListDeleteResponseEntity = webService.listIdDelete(id)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| The ID of the List to delete |

### Return type

[**ListDeleteResponseEntity**](ListDeleteResponseEntity.md)

### Authorization



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json


List lookup by List ID

Returns a List

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the List to get
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.

launch(Dispatchers.IO) {
    val result : SingleListLookupResponseEntity = webService.listIdGet(id, listFields, expansions, userFields)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json


Update List

Update a List that you own.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the List to modify
val listUpdateRequestEntity : ListUpdateRequestEntity =  // ListUpdateRequestEntity | 

launch(Dispatchers.IO) {
    val result : ListUpdateResponseEntity = webService.listIdUpdate(id, listUpdateRequestEntity)
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



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json


Remove a List member

Causes a user to be removed from the members of a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the List to remove a member
val userId : kotlin.String = userId_example // kotlin.String | The ID of user that will be removed from the List

launch(Dispatchers.IO) {
    val result : ListMemberResponseEntity = webService.listRemoveMember(id, userId)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json


Follow a List

Causes a user to follow a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the authenticated source user that will follow the List
val listFollowRequestEntity : ListFollowRequestEntity =  // ListFollowRequestEntity | 

launch(Dispatchers.IO) {
    val result : ListFollowedResponseEntity = webService.listUserFollow(id, listFollowRequestEntity)
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



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json


Get a User&#39;s Owned Lists

Get a User&#39;s Owned Lists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.Long = 789 // kotlin.Long | This parameter is used to get a specified 'page' of results.
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.

launch(Dispatchers.IO) {
    val result : MultiListResponseEntity = webService.listUserOwnedLists(id, maxResults, paginationToken, listFields, expansions, userFields)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json


Pin a List

Causes a user to pin a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the authenticated source user that will pin the List
val listPinRequestEntity : ListPinRequestEntity =  // ListPinRequestEntity | 

launch(Dispatchers.IO) {
    val result : ListPinnedResponseEntity = webService.listUserPin(id, listPinRequestEntity)
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



### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json


Get a User&#39;s Pinned Lists

Get a User&#39;s Pinned Lists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.

launch(Dispatchers.IO) {
    val result : MultiListNoPaginationResponseEntity = webService.listUserPinnedLists(id, listFields, expansions, userFields)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json


Unfollow a List

Causes a user to unfollow a List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the authenticated source user that will unfollow the List
val listId : kotlin.String = listId_example // kotlin.String | The ID of the List to unfollow

launch(Dispatchers.IO) {
    val result : ListFollowedResponseEntity = webService.listUserUnfollow(id, listId)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json


Unpin a List

Causes a user to remove a pinned List.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the authenticated source user that will remove the pinned List
val listId : kotlin.String = listId_example // kotlin.String | The ID of the List to unpin

launch(Dispatchers.IO) {
    val result : ListPinnedResponseEntity = webService.listUserUnpin(id, listId)
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



### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json


Get User&#39;s Followed Lists

Returns a user&#39;s followed Lists.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.openapi_playground_app.data.entities.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ListsApi::class.java)
val id : kotlin.String = id_example // kotlin.String | The ID of the user for whom to return results
val maxResults : kotlin.Int = 56 // kotlin.Int | The maximum number of results
val paginationToken : kotlin.Long = 789 // kotlin.Long | This parameter is used to get a specified 'page' of results.
val listFields : kotlin.collections.Set<kotlin.String> = ["created_at","description","follower_count","member_count","name","private"] // kotlin.collections.Set<kotlin.String> | A comma separated list of List fields to display.
val expansions : kotlin.collections.Set<kotlin.String> = ["owner_id"] // kotlin.collections.Set<kotlin.String> | A comma separated list of fields to expand.
val userFields : kotlin.collections.Set<kotlin.String> = ["username","verified","profile_image_url"] // kotlin.collections.Set<kotlin.String> | A comma separated list of User fields to display.

launch(Dispatchers.IO) {
    val result : MultiListResponseEntity = webService.userFollowedLists(id, maxResults, paginationToken, listFields, expansions, userFields)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

