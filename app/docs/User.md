
# UserEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. | 
**name** | **kotlin.String** | The friendly name of this user, as shown on their profile. | 
**username** | **kotlin.String** | The Twitter handle (screen name) of this user. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation time of this user. |  [optional]
**&#x60;protected&#x60;** | **kotlin.Boolean** | Indicates if this user has chosen to protect their Tweets (in other words, if this user&#39;s Tweets are private). |  [optional]
**verified** | **kotlin.Boolean** | Indicate if this user is a verified Twitter User. |  [optional]
**withheld** | [**UserWithheldEntity**](UserWithheldEntity.md) |  |  [optional]
**profileImageUrl** | [**java.net.URI**](java.net.URI.md) | The URL to the profile image for this user. |  [optional]
**location** | **kotlin.String** | The location specified in the user&#39;s profile, if the user provided one. As this is a freeform value, it may not indicate a valid location, but it may be fuzzily evaluated when performing searches with location queries. |  [optional]
**url** | **kotlin.String** | The URL specified in the user&#39;s profile. |  [optional]
**description** | **kotlin.String** | The text of this user&#39;s profile description (also known as bio), if the user provided one. |  [optional]
**entities** | [**UserEntitiesEntity**](UserEntitiesEntity.md) |  |  [optional]
**pinnedTweetId** | **kotlin.String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**publicMetrics** | [**UserPublicMetricsEntity**](UserPublicMetricsEntity.md) |  |  [optional]



