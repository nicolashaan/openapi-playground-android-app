
# ComplianceJobEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Compliance Job ID | 
**type** | [**ComplianceJobTypeEntity**](ComplianceJobTypeEntity.md) |  | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation time of the compliance job. | 
**uploadUrl** | [**java.net.URI**](java.net.URI.md) | URL to which the user will upload their tweet or user IDs | 
**uploadExpiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Expiration time of the upload URL | 
**downloadUrl** | [**java.net.URI**](java.net.URI.md) | URL from which the user will retrieve their compliance results | 
**downloadExpiresAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Expiration time of the download URL | 
**status** | [**ComplianceJobStatusEntity**](ComplianceJobStatusEntity.md) |  | 
**name** | **kotlin.String** | User-provided name for a compliance job |  [optional]



