# GeneralApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOpenApiSpec**](GeneralApi.md#getOpenApiSpec) | **GET** /2/openapi.json | Returns the open api spec document.


<a name="getOpenApiSpec"></a>
# **getOpenApiSpec**
> kotlin.Any getOpenApiSpec()

Returns the open api spec document.

Full open api spec in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = GeneralApi()
try {
    val result : kotlin.Any = apiInstance.getOpenApiSpec()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GeneralApi#getOpenApiSpec")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GeneralApi#getOpenApiSpec")
    e.printStackTrace()
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

