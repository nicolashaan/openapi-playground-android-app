
# PollEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | Unique identifier of this poll. | 
**options** | [**kotlin.collections.List&lt;PollOptionEntity&gt;**](PollOptionEntity.md) |  | 
**votingStatus** | [**inline**](#VotingStatus) |  |  [optional]
**endDatetime** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) |  |  [optional]
**durationMinutes** | **kotlin.Int** |  |  [optional]


<a name="VotingStatus"></a>
## Enum: voting_status
Name | Value
---- | -----
votingStatus | open, closed



