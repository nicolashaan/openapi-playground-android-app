# ComplianceApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBatchComplianceJob**](ComplianceApi.md#createBatchComplianceJob) | **POST** /2/compliance/jobs | Create compliance job
[**getBatchComplianceJob**](ComplianceApi.md#getBatchComplianceJob) | **GET** /2/compliance/jobs/{id} | Get compliance job
[**listBatchComplianceJobs**](ComplianceApi.md#listBatchComplianceJobs) | **GET** /2/compliance/jobs | List compliance jobs


<a name="createBatchComplianceJob"></a>
# **createBatchComplianceJob**
> SingleComplianceJobResponseEntity createBatchComplianceJob(inlineObject5Entity)

Create compliance job

Creates a compliance for the given job type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ComplianceApi()
val inlineObject5Entity : InlineObject5Entity =  // InlineObject5Entity | 
try {
    val result : SingleComplianceJobResponseEntity = apiInstance.createBatchComplianceJob(inlineObject5Entity)
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
 **inlineObject5Entity** | [**InlineObject5Entity**](InlineObject5Entity.md)|  |

### Return type

[**SingleComplianceJobResponseEntity**](SingleComplianceJobResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json

<a name="getBatchComplianceJob"></a>
# **getBatchComplianceJob**
> SingleComplianceJobResponseEntity getBatchComplianceJob(id)

Get compliance job

Returns a single compliance job by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ComplianceApi()
val id : kotlin.String = id_example // kotlin.String | ID of the compliance job to retrieve.
try {
    val result : SingleComplianceJobResponseEntity = apiInstance.getBatchComplianceJob(id)
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

[**SingleComplianceJobResponseEntity**](SingleComplianceJobResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

<a name="listBatchComplianceJobs"></a>
# **listBatchComplianceJobs**
> MultiComplianceJobResponseEntity listBatchComplianceJobs(type, status)

List compliance jobs

Returns recent compliance jobs for a given job type and optional job status

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiInstance = ComplianceApi()
val type : ComplianceJobTypeEntity =  // ComplianceJobTypeEntity | Type of compliance job to list.
val status : ComplianceJobStatusEntity =  // ComplianceJobStatusEntity | Status of compliance job to list.
try {
    val result : MultiComplianceJobResponseEntity = apiInstance.listBatchComplianceJobs(type, status)
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
 **type** | [**ComplianceJobTypeEntity**](.md)| Type of compliance job to list. | [enum: tweets, users]
 **status** | [**ComplianceJobStatusEntity**](.md)| Status of compliance job to list. | [optional] [enum: created, in_progress, failed, complete]

### Return type

[**MultiComplianceJobResponseEntity**](MultiComplianceJobResponseEntity.md)

### Authorization


Configure BearerToken:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

