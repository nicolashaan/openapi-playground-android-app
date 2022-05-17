
# InlineObject3

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **kotlin.String** | The content of the Tweet. |  [optional]
**directMessageDeepLink** | **kotlin.String** | Link to take the conversation from the public timeline to a private Direct Message. |  [optional]
**quoteTweetId** | **kotlin.String** | Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**forSuperFollowersOnly** | **kotlin.Boolean** | Exclusive Tweet for super followers. |  [optional]
**reply** | [**Model2TweetsReply**](Model2TweetsReply.md) |  |  [optional]
**media** | [**Model2TweetsMedia**](Model2TweetsMedia.md) |  |  [optional]
**poll** | [**Model2TweetsPoll**](Model2TweetsPoll.md) |  |  [optional]
**replySettings** | [**inline**](#ReplySettings) | Settings to indicate who can reply to the Tweet. |  [optional]
**geo** | [**Model2TweetsGeo**](Model2TweetsGeo.md) |  |  [optional]


<a name="ReplySettings"></a>
## Enum: reply_settings
Name | Value
---- | -----
replySettings | following, mentionedUsers



