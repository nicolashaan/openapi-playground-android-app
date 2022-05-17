# ComplianceApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBatchComplianceJob**](ComplianceApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job
[**getBatchComplianceJob**](ComplianceApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get compliance job
[**listBatchComplianceJobs**](ComplianceApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List compliance jobs


<a name="createBatchComplianceJob"></a>
# **createBatchComplianceJob**
> SingleComplianceJobResponse createBatchComplianceJob(inlineObject5)

Create compliance job

Creates a compliance for the given job type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ComplianceApi()
val inlineObject5 : InlineObject5 =  // InlineObject5 | 
try {
    val result : SingleComplianceJobResponse = apiInstance.createBatchComplianceJob(inlineObject5)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ComplianceApi#createBatchComplianceJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ComplianceApi#createBatchComplianceJob")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  |

### Return type

[**SingleComplianceJobResponse**](SingleComplianceJobResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="getBatchComplianceJob"></a>
# **getBatchComplianceJob**
> SingleComplianceJobResponse getBatchComplianceJob(id)

Get compliance job

Returns a single compliance job by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ComplianceApi()
val id : kotlin.String = id_example // kotlin.String | ID of the compliance job to retrieve.
try {
    val result : SingleComplianceJobResponse = apiInstance.getBatchComplianceJob(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ComplianceApi#getBatchComplianceJob")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ComplianceApi#getBatchComplianceJob")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| ID of the compliance job to retrieve. |

### Return type

[**SingleComplianceJobResponse**](SingleComplianceJobResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listBatchComplianceJobs"></a>
# **listBatchComplianceJobs**
> MultiComplianceJobResponse listBatchComplianceJobs(type, status)

List compliance jobs

Returns recent compliance jobs for a given job type and optional job status

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ComplianceApi()
val type : ComplianceJobType =  // ComplianceJobType | Type of compliance job to list.
val status : ComplianceJobStatus =  // ComplianceJobStatus | Status of compliance job to list.
try {
    val result : MultiComplianceJobResponse = apiInstance.listBatchComplianceJobs(type, status)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ComplianceApi#listBatchComplianceJobs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ComplianceApi#listBatchComplianceJobs")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **type** | [**ComplianceJobType**](.md)| Type of compliance job to list. | [enum: tweets, users]
 **status** | [**ComplianceJobStatus**](.md)| Status of compliance job to list. | [optional] [enum: created, in_progress, failed, complete]

### Return type

[**MultiComplianceJobResponse**](MultiComplianceJobResponse.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

