# ComplianceApi

All URIs are relative to *https://api.twitter.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBatchComplianceJob**](ComplianceApi.md#createBatchComplianceJob) | **POST** 2/compliance/jobs | Create compliance job
[**getBatchComplianceJob**](ComplianceApi.md#getBatchComplianceJob) | **GET** 2/compliance/jobs/{id} | Get compliance job
[**listBatchComplianceJobs**](ComplianceApi.md#listBatchComplianceJobs) | **GET** 2/compliance/jobs | List compliance jobs



Create compliance job

Creates a compliance for the given job type

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ComplianceApi::class.java)
val inlineObject5Entity : InlineObject5Entity =  // InlineObject5Entity | 

launch(Dispatchers.IO) {
    val result : SingleComplianceJobResponseEntity = webService.createBatchComplianceJob(inlineObject5Entity)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, application/problem+json


Get compliance job

Returns a single compliance job by ID

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ComplianceApi::class.java)
val id : kotlin.String = id_example // kotlin.String | ID of the compliance job to retrieve.

launch(Dispatchers.IO) {
    val result : SingleComplianceJobResponseEntity = webService.getBatchComplianceJob(id)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json


List compliance jobs

Returns recent compliance jobs for a given job type and optional job status

### Example
```kotlin
// Import classes:
//import org.openapitools.client.*
//import org.openapitools.client.infrastructure.*
//import fr.haan.open_api_playground_app.data.entities.*

val apiClient = ApiClient()
apiClient.setBearerToken("TOKEN")
val webService = apiClient.createWebservice(ComplianceApi::class.java)
val type : ComplianceJobTypeEntity =  // ComplianceJobTypeEntity | Type of compliance job to list.
val status : ComplianceJobStatusEntity =  // ComplianceJobStatusEntity | Status of compliance job to list.

launch(Dispatchers.IO) {
    val result : MultiComplianceJobResponseEntity = webService.listBatchComplianceJobs(type, status)
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
    ApiClient().setBearerToken("TOKEN")

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/problem+json

