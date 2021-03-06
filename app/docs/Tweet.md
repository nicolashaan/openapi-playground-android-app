
# TweetEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. | 
**text** | **kotlin.String** | The content of the Tweet. | 
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation time of the Tweet. |  [optional]
**authorId** | **kotlin.String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**inReplyToUserId** | **kotlin.String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**conversationId** | **kotlin.String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**replySettings** | [**ReplySettingsEntity**](ReplySettingsEntity.md) |  |  [optional]
**referencedTweets** | [**kotlin.collections.List&lt;TweetReferencedTweetsEntity&gt;**](TweetReferencedTweetsEntity.md) | A list of Tweets this Tweet refers to. For example, if the parent Tweet is a Retweet, a Quoted Tweet or a Reply, it will include the related Tweet referenced to by its parent. |  [optional]
**attachments** | [**TweetAttachmentsEntity**](TweetAttachmentsEntity.md) |  |  [optional]
**contextAnnotations** | [**kotlin.collections.List&lt;ContextAnnotationEntity&gt;**](ContextAnnotationEntity.md) |  |  [optional]
**withheld** | [**TweetWithheldEntity**](TweetWithheldEntity.md) |  |  [optional]
**geo** | [**TweetGeoEntity**](TweetGeoEntity.md) |  |  [optional]
**entities** | [**FullTextEntitiesEntity**](FullTextEntitiesEntity.md) |  |  [optional]
**publicMetrics** | [**TweetPublicMetricsEntity**](TweetPublicMetricsEntity.md) |  |  [optional]
**possiblySensitive** | **kotlin.Boolean** | Indicates if this Tweet contains URLs marked as sensitive, for example content suitable for mature audiences. |  [optional]
**lang** | **kotlin.String** | Language of the Tweet, if detected by Twitter. Returned as a BCP47 language tag. |  [optional]
**source** | **kotlin.String** | The name of the app the user Tweeted from. |  [optional]
**nonPublicMetrics** | [**TweetNonPublicMetricsEntity**](TweetNonPublicMetricsEntity.md) |  |  [optional]
**promotedMetrics** | [**TweetPromotedMetricsEntity**](TweetPromotedMetricsEntity.md) |  |  [optional]
**organicMetrics** | [**TweetOrganicMetricsEntity**](TweetOrganicMetricsEntity.md) |  |  [optional]



