# GeneralApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOpenApiSpec**](GeneralApi.md#getOpenApiSpec) | **GET** 2/openapi.json | Returns the open api spec document.



Returns the open api spec document.

Full open api spec in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiClient = ApiClient()
val webService = apiClient.createWebservice(GeneralApi::class.java)

launch(Dispatchers.IO) {
    val result : kotlin.Any = webService.getOpenApiSpec()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**kotlin.Any**](kotlin.Any.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

