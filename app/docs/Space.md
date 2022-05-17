
# SpaceEntity

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **kotlin.String** | The unique identifier of this Space. | 
**state** | [**inline**](#State) | The current state of the space. | 
**startedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the space was started as a date string |  [optional]
**isTicketed** | **kotlin.Boolean** | Denotes if the space is a ticketed space |  [optional]
**participantCount** | **kotlin.Int** | The number of participants in a space |  [optional]
**title** | **kotlin.String** | The title of the space |  [optional]
**hostIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | The user ids for the hosts of the space |  [optional]
**updatedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | When the space was last updated |  [optional]
**createdAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | Creation time of the space |  [optional]
**creatorId** | **kotlin.String** | Unique identifier of this User. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. |  [optional]
**lang** | **kotlin.String** | The language of the space |  [optional]
**speakerIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of user ids for people who were speakers in a space |  [optional]
**invitedUserIds** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of user ids for people who were invited to a space |  [optional]
**scheduledStart** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | A date time stamp for when a space is scheduled to begin |  [optional]
**endedAt** | [**java.time.OffsetDateTime**](java.time.OffsetDateTime.md) | End time of the space |  [optional]
**topics** | [**kotlin.collections.List&lt;SpaceTopicsEntity&gt;**](SpaceTopicsEntity.md) | The topics of a space, as selected by its creator |  [optional]
**subscriberCount** | **kotlin.Int** | The number of people who have either purchased a ticket or set a reminder for this space. |  [optional]


<a name="State"></a>
## Enum: state
Name | Value
---- | -----
state | live, scheduled, ended



