# org.openapitools.client - Kotlin client library for Twitter API v2

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://api.twitter.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BookmarksApi* | [**getUsersIdBookmarks**](docs/BookmarksApi.md#getusersidbookmarks) | **GET** /2/users/{id}/bookmarks | Bookmarks by User
*BookmarksApi* | [**postUsersIdBookmarks**](docs/BookmarksApi.md#postusersidbookmarks) | **POST** /2/users/{id}/bookmarks | Add Tweet to Bookmarks
*BookmarksApi* | [**usersIdBookmarksDelete**](docs/BookmarksApi.md#usersidbookmarksdelete) | **DELETE** /2/users/{id}/bookmarks/{tweet_id} | Remove a bookmarked Tweet
*ComplianceApi* | [**createBatchComplianceJob**](docs/ComplianceApi.md#createbatchcompliancejob) | **POST** /2/compliance/jobs | Create compliance job
*ComplianceApi* | [**getBatchComplianceJob**](docs/ComplianceApi.md#getbatchcompliancejob) | **GET** /2/compliance/jobs/{id} | Get compliance job
*ComplianceApi* | [**listBatchComplianceJobs**](docs/ComplianceApi.md#listbatchcompliancejobs) | **GET** /2/compliance/jobs | List compliance jobs
*GeneralApi* | [**getOpenApiSpec**](docs/GeneralApi.md#getopenapispec) | **GET** /2/openapi.json | Returns the open api spec document.
*ListsApi* | [**getUserListMemberships**](docs/ListsApi.md#getuserlistmemberships) | **GET** /2/users/{id}/list_memberships | Get a User's List Memberships
*ListsApi* | [**listAddMember**](docs/ListsApi.md#listaddmember) | **POST** /2/lists/{id}/members | Add a List member
*ListsApi* | [**listIdCreate**](docs/ListsApi.md#listidcreate) | **POST** /2/lists | Create List
*ListsApi* | [**listIdDelete**](docs/ListsApi.md#listiddelete) | **DELETE** /2/lists/{id} | Delete List
*ListsApi* | [**listIdGet**](docs/ListsApi.md#listidget) | **GET** /2/lists/{id} | List lookup by List ID
*ListsApi* | [**listIdUpdate**](docs/ListsApi.md#listidupdate) | **PUT** /2/lists/{id} | Update List
*ListsApi* | [**listRemoveMember**](docs/ListsApi.md#listremovemember) | **DELETE** /2/lists/{id}/members/{user_id} | Remove a List member
*ListsApi* | [**listUserFollow**](docs/ListsApi.md#listuserfollow) | **POST** /2/users/{id}/followed_lists | Follow a List
*ListsApi* | [**listUserOwnedLists**](docs/ListsApi.md#listuserownedlists) | **GET** /2/users/{id}/owned_lists | Get a User's Owned Lists
*ListsApi* | [**listUserPin**](docs/ListsApi.md#listuserpin) | **POST** /2/users/{id}/pinned_lists | Pin a List
*ListsApi* | [**listUserPinnedLists**](docs/ListsApi.md#listuserpinnedlists) | **GET** /2/users/{id}/pinned_lists | Get a User's Pinned Lists
*ListsApi* | [**listUserUnfollow**](docs/ListsApi.md#listuserunfollow) | **DELETE** /2/users/{id}/followed_lists/{list_id} | Unfollow a List
*ListsApi* | [**listUserUnpin**](docs/ListsApi.md#listuserunpin) | **DELETE** /2/users/{id}/pinned_lists/{list_id} | Unpin a List
*ListsApi* | [**userFollowedLists**](docs/ListsApi.md#userfollowedlists) | **GET** /2/users/{id}/followed_lists | Get User's Followed Lists
*SpacesApi* | [**findSpaceById**](docs/SpacesApi.md#findspacebyid) | **GET** /2/spaces/{id} | Space lookup by Space ID
*SpacesApi* | [**findSpacesByCreatorIds**](docs/SpacesApi.md#findspacesbycreatorids) | **GET** /2/spaces/by/creator_ids | Space lookup by their creators
*SpacesApi* | [**findSpacesByIds**](docs/SpacesApi.md#findspacesbyids) | **GET** /2/spaces | Space lookup up Space IDs
*SpacesApi* | [**searchSpaces**](docs/SpacesApi.md#searchspaces) | **GET** /2/spaces/search | Search for Spaces
*SpacesApi* | [**spaceBuyers**](docs/SpacesApi.md#spacebuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
*SpacesApi* | [**spaceTweets**](docs/SpacesApi.md#spacetweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space
*TweetsApi* | [**addOrDeleteRules**](docs/TweetsApi.md#addordeleterules) | **POST** /2/tweets/search/stream/rules | Add/Delete rules
*TweetsApi* | [**createTweet**](docs/TweetsApi.md#createtweet) | **POST** /2/tweets | Creation of a Tweet
*TweetsApi* | [**deleteTweetById**](docs/TweetsApi.md#deletetweetbyid) | **DELETE** /2/tweets/{id} | Tweet delete by Tweet ID
*TweetsApi* | [**findTweetById**](docs/TweetsApi.md#findtweetbyid) | **GET** /2/tweets/{id} | Tweet lookup by Tweet ID
*TweetsApi* | [**findTweetsById**](docs/TweetsApi.md#findtweetsbyid) | **GET** /2/tweets | Tweet lookup by Tweet IDs
*TweetsApi* | [**findTweetsThatQuoteATweet**](docs/TweetsApi.md#findtweetsthatquoteatweet) | **GET** /2/tweets/{id}/quote_tweets | Retrieve tweets that quote a tweet.
*TweetsApi* | [**getRules**](docs/TweetsApi.md#getrules) | **GET** /2/tweets/search/stream/rules | Rules lookup
*TweetsApi* | [**hideReplyById**](docs/TweetsApi.md#hidereplybyid) | **PUT** /2/tweets/{id}/hidden | Hide replies
*TweetsApi* | [**listsIdTweets**](docs/TweetsApi.md#listsidtweets) | **GET** /2/lists/{id}/tweets | List Tweets timeline by List ID
*TweetsApi* | [**sampleStream**](docs/TweetsApi.md#samplestream) | **GET** /2/tweets/sample/stream | Sample stream
*TweetsApi* | [**searchStream**](docs/TweetsApi.md#searchstream) | **GET** /2/tweets/search/stream | Filtered stream
*TweetsApi* | [**spaceBuyers**](docs/TweetsApi.md#spacebuyers) | **GET** /2/spaces/{id}/buyers | Retrieve the list of users who purchased a ticket to the given space
*TweetsApi* | [**spaceTweets**](docs/TweetsApi.md#spacetweets) | **GET** /2/spaces/{id}/tweets | Retrieve tweets from a Space
*TweetsApi* | [**tweetCountsFullArchiveSearch**](docs/TweetsApi.md#tweetcountsfullarchivesearch) | **GET** /2/tweets/counts/all | Full archive search counts
*TweetsApi* | [**tweetCountsRecentSearch**](docs/TweetsApi.md#tweetcountsrecentsearch) | **GET** /2/tweets/counts/recent | Recent search counts
*TweetsApi* | [**tweetsFullarchiveSearch**](docs/TweetsApi.md#tweetsfullarchivesearch) | **GET** /2/tweets/search/all | Full-archive search
*TweetsApi* | [**tweetsRecentSearch**](docs/TweetsApi.md#tweetsrecentsearch) | **GET** /2/tweets/search/recent | Recent search
*TweetsApi* | [**usersIdLike**](docs/TweetsApi.md#usersidlike) | **POST** /2/users/{id}/likes | Causes the user (in the path) to like the specified tweet
*TweetsApi* | [**usersIdLikedTweets**](docs/TweetsApi.md#usersidlikedtweets) | **GET** /2/users/{id}/liked_tweets | Returns Tweet objects liked by the provided User ID
*TweetsApi* | [**usersIdMentions**](docs/TweetsApi.md#usersidmentions) | **GET** /2/users/{id}/mentions | User mention timeline by User ID
*TweetsApi* | [**usersIdRetweets**](docs/TweetsApi.md#usersidretweets) | **POST** /2/users/{id}/retweets | Causes the user (in the path) to retweet the specified tweet
*TweetsApi* | [**usersIdTweets**](docs/TweetsApi.md#usersidtweets) | **GET** /2/users/{id}/tweets | User Tweets timeline by User ID
*TweetsApi* | [**usersIdUnlike**](docs/TweetsApi.md#usersidunlike) | **DELETE** /2/users/{id}/likes/{tweet_id} | Causes the user (in the path) to unlike the specified tweet
*TweetsApi* | [**usersIdUnretweets**](docs/TweetsApi.md#usersidunretweets) | **DELETE** /2/users/{id}/retweets/{source_tweet_id} | Causes the user (in the path) to unretweet the specified tweet
*UsersApi* | [**findMyUser**](docs/UsersApi.md#findmyuser) | **GET** /2/users/me | User lookup me
*UsersApi* | [**findUserById**](docs/UsersApi.md#finduserbyid) | **GET** /2/users/{id} | User lookup by ID
*UsersApi* | [**findUserByUsername**](docs/UsersApi.md#finduserbyusername) | **GET** /2/users/by/username/{username} | User lookup by username
*UsersApi* | [**findUsersById**](docs/UsersApi.md#findusersbyid) | **GET** /2/users | User lookup by IDs
*UsersApi* | [**findUsersByUsername**](docs/UsersApi.md#findusersbyusername) | **GET** /2/users/by | User lookup by usernames
*UsersApi* | [**listGetFollowers**](docs/UsersApi.md#listgetfollowers) | **GET** /2/lists/{id}/followers | Returns user objects that follow a List by the provided List ID
*UsersApi* | [**listGetMembers**](docs/UsersApi.md#listgetmembers) | **GET** /2/lists/{id}/members | Returns user objects that are members of a List by the provided List ID
*UsersApi* | [**tweetsIdLikingUsers**](docs/UsersApi.md#tweetsidlikingusers) | **GET** /2/tweets/{id}/liking_users | Returns user objects that have liked the provided Tweet ID
*UsersApi* | [**tweetsIdRetweetingUsers**](docs/UsersApi.md#tweetsidretweetingusers) | **GET** /2/tweets/{id}/retweeted_by | Returns user objects that have retweeted the provided Tweet ID
*UsersApi* | [**usersIdBlock**](docs/UsersApi.md#usersidblock) | **POST** /2/users/{id}/blocking | Block User by User ID
*UsersApi* | [**usersIdBlocking**](docs/UsersApi.md#usersidblocking) | **GET** /2/users/{id}/blocking | Returns user objects that are blocked by provided user ID
*UsersApi* | [**usersIdFollow**](docs/UsersApi.md#usersidfollow) | **POST** /2/users/{id}/following | Follow User
*UsersApi* | [**usersIdFollowers**](docs/UsersApi.md#usersidfollowers) | **GET** /2/users/{id}/followers | Returns user objects that follow the provided user ID
*UsersApi* | [**usersIdFollowing**](docs/UsersApi.md#usersidfollowing) | **GET** /2/users/{id}/following | Following by User ID
*UsersApi* | [**usersIdMute**](docs/UsersApi.md#usersidmute) | **POST** /2/users/{id}/muting | Mute User by User ID
*UsersApi* | [**usersIdMuting**](docs/UsersApi.md#usersidmuting) | **GET** /2/users/{id}/muting | Returns user objects that are muted by the provided user ID
*UsersApi* | [**usersIdUnblock**](docs/UsersApi.md#usersidunblock) | **DELETE** /2/users/{source_user_id}/blocking/{target_user_id} | Unblock User by User ID
*UsersApi* | [**usersIdUnfollow**](docs/UsersApi.md#usersidunfollow) | **DELETE** /2/users/{source_user_id}/following/{target_user_id} | Unfollow User
*UsersApi* | [**usersIdUnmute**](docs/UsersApi.md#usersidunmute) | **DELETE** /2/users/{source_user_id}/muting/{target_user_id} | Unmute User by User ID


<a name="documentation-for-models"></a>
## Documentation for Models

 - [org.openapitools.client.models.AddBookmarkRequest](docs/AddBookmarkRequest.md)
 - [org.openapitools.client.models.AddOrDeleteRulesRequest](docs/AddOrDeleteRulesRequest.md)
 - [org.openapitools.client.models.AddOrDeleteRulesResponse](docs/AddOrDeleteRulesResponse.md)
 - [org.openapitools.client.models.AddRulesRequest](docs/AddRulesRequest.md)
 - [org.openapitools.client.models.AnimatedGif](docs/AnimatedGif.md)
 - [org.openapitools.client.models.AnimatedGifAllOf](docs/AnimatedGifAllOf.md)
 - [org.openapitools.client.models.BookmarkMutationResponse](docs/BookmarkMutationResponse.md)
 - [org.openapitools.client.models.BookmarkMutationResponseData](docs/BookmarkMutationResponseData.md)
 - [org.openapitools.client.models.CashtagEntity](docs/CashtagEntity.md)
 - [org.openapitools.client.models.CashtagFields](docs/CashtagFields.md)
 - [org.openapitools.client.models.ClientDisconnectedProblem](docs/ClientDisconnectedProblem.md)
 - [org.openapitools.client.models.ClientForbiddenProblem](docs/ClientForbiddenProblem.md)
 - [org.openapitools.client.models.ClientForbiddenProblemAllOf](docs/ClientForbiddenProblemAllOf.md)
 - [org.openapitools.client.models.ComplianceJob](docs/ComplianceJob.md)
 - [org.openapitools.client.models.ComplianceJobStatus](docs/ComplianceJobStatus.md)
 - [org.openapitools.client.models.ComplianceJobType](docs/ComplianceJobType.md)
 - [org.openapitools.client.models.ConflictProblem](docs/ConflictProblem.md)
 - [org.openapitools.client.models.ConnectionExceptionProblem](docs/ConnectionExceptionProblem.md)
 - [org.openapitools.client.models.ConnectionExceptionProblemAllOf](docs/ConnectionExceptionProblemAllOf.md)
 - [org.openapitools.client.models.ContextAnnotation](docs/ContextAnnotation.md)
 - [org.openapitools.client.models.ContextAnnotationDomainFields](docs/ContextAnnotationDomainFields.md)
 - [org.openapitools.client.models.ContextAnnotationEntityFields](docs/ContextAnnotationEntityFields.md)
 - [org.openapitools.client.models.DeleteRulesRequest](docs/DeleteRulesRequest.md)
 - [org.openapitools.client.models.DeleteRulesRequestDelete](docs/DeleteRulesRequestDelete.md)
 - [org.openapitools.client.models.DisallowedResourceProblem](docs/DisallowedResourceProblem.md)
 - [org.openapitools.client.models.DisallowedResourceProblemAllOf](docs/DisallowedResourceProblemAllOf.md)
 - [org.openapitools.client.models.DuplicateRuleProblem](docs/DuplicateRuleProblem.md)
 - [org.openapitools.client.models.DuplicateRuleProblemAllOf](docs/DuplicateRuleProblemAllOf.md)
 - [org.openapitools.client.models.EntityIndicesInclusiveExclusive](docs/EntityIndicesInclusiveExclusive.md)
 - [org.openapitools.client.models.EntityIndicesInclusiveInclusive](docs/EntityIndicesInclusiveInclusive.md)
 - [org.openapitools.client.models.Error](docs/Error.md)
 - [org.openapitools.client.models.Expansions](docs/Expansions.md)
 - [org.openapitools.client.models.FieldUnauthorizedProblem](docs/FieldUnauthorizedProblem.md)
 - [org.openapitools.client.models.FieldUnauthorizedProblemAllOf](docs/FieldUnauthorizedProblemAllOf.md)
 - [org.openapitools.client.models.FilteredStreamingTweet](docs/FilteredStreamingTweet.md)
 - [org.openapitools.client.models.FilteredStreamingTweetOneOf](docs/FilteredStreamingTweetOneOf.md)
 - [org.openapitools.client.models.FilteredStreamingTweetOneOf1](docs/FilteredStreamingTweetOneOf1.md)
 - [org.openapitools.client.models.FilteredStreamingTweetOneOfMatchingRules](docs/FilteredStreamingTweetOneOfMatchingRules.md)
 - [org.openapitools.client.models.FullTextEntities](docs/FullTextEntities.md)
 - [org.openapitools.client.models.GenericMultipleUsersLookupResponse](docs/GenericMultipleUsersLookupResponse.md)
 - [org.openapitools.client.models.GenericMultipleUsersLookupResponseMeta](docs/GenericMultipleUsersLookupResponseMeta.md)
 - [org.openapitools.client.models.GenericProblem](docs/GenericProblem.md)
 - [org.openapitools.client.models.GenericTweetsTimelineResponse](docs/GenericTweetsTimelineResponse.md)
 - [org.openapitools.client.models.GenericTweetsTimelineResponseMeta](docs/GenericTweetsTimelineResponseMeta.md)
 - [org.openapitools.client.models.Geo](docs/Geo.md)
 - [org.openapitools.client.models.Granularity](docs/Granularity.md)
 - [org.openapitools.client.models.HashtagEntity](docs/HashtagEntity.md)
 - [org.openapitools.client.models.HashtagFields](docs/HashtagFields.md)
 - [org.openapitools.client.models.InlineObject](docs/InlineObject.md)
 - [org.openapitools.client.models.InlineObject1](docs/InlineObject1.md)
 - [org.openapitools.client.models.InlineObject2](docs/InlineObject2.md)
 - [org.openapitools.client.models.InlineObject3](docs/InlineObject3.md)
 - [org.openapitools.client.models.InlineObject4](docs/InlineObject4.md)
 - [org.openapitools.client.models.InlineObject5](docs/InlineObject5.md)
 - [org.openapitools.client.models.InlineResponse200](docs/InlineResponse200.md)
 - [org.openapitools.client.models.InlineResponse2001](docs/InlineResponse2001.md)
 - [org.openapitools.client.models.InlineResponse2002](docs/InlineResponse2002.md)
 - [org.openapitools.client.models.InlineResponse2002Meta](docs/InlineResponse2002Meta.md)
 - [org.openapitools.client.models.InvalidRequestProblem](docs/InvalidRequestProblem.md)
 - [org.openapitools.client.models.InvalidRequestProblemAllOf](docs/InvalidRequestProblemAllOf.md)
 - [org.openapitools.client.models.InvalidRequestProblemAllOfErrors](docs/InvalidRequestProblemAllOfErrors.md)
 - [org.openapitools.client.models.InvalidRuleProblem](docs/InvalidRuleProblem.md)
 - [org.openapitools.client.models.List](docs/List.md)
 - [org.openapitools.client.models.ListAddMemberRequest](docs/ListAddMemberRequest.md)
 - [org.openapitools.client.models.ListCreateRequest](docs/ListCreateRequest.md)
 - [org.openapitools.client.models.ListCreateResponse](docs/ListCreateResponse.md)
 - [org.openapitools.client.models.ListDeleteResponse](docs/ListDeleteResponse.md)
 - [org.openapitools.client.models.ListDeleteResponseData](docs/ListDeleteResponseData.md)
 - [org.openapitools.client.models.ListFollowRequest](docs/ListFollowRequest.md)
 - [org.openapitools.client.models.ListFollowedResponse](docs/ListFollowedResponse.md)
 - [org.openapitools.client.models.ListFollowedResponseData](docs/ListFollowedResponseData.md)
 - [org.openapitools.client.models.ListLookupMultipleUsersLookupResponse](docs/ListLookupMultipleUsersLookupResponse.md)
 - [org.openapitools.client.models.ListLookupMultipleUsersLookupResponseMeta](docs/ListLookupMultipleUsersLookupResponseMeta.md)
 - [org.openapitools.client.models.ListMemberResponse](docs/ListMemberResponse.md)
 - [org.openapitools.client.models.ListMemberResponseData](docs/ListMemberResponseData.md)
 - [org.openapitools.client.models.ListPinRequest](docs/ListPinRequest.md)
 - [org.openapitools.client.models.ListPinnedResponse](docs/ListPinnedResponse.md)
 - [org.openapitools.client.models.ListPinnedResponseData](docs/ListPinnedResponseData.md)
 - [org.openapitools.client.models.ListUpdateRequest](docs/ListUpdateRequest.md)
 - [org.openapitools.client.models.ListUpdateResponse](docs/ListUpdateResponse.md)
 - [org.openapitools.client.models.ListUpdateResponseData](docs/ListUpdateResponseData.md)
 - [org.openapitools.client.models.Media](docs/Media.md)
 - [org.openapitools.client.models.MentionEntity](docs/MentionEntity.md)
 - [org.openapitools.client.models.MentionFields](docs/MentionFields.md)
 - [org.openapitools.client.models.Model2TweetsGeo](docs/Model2TweetsGeo.md)
 - [org.openapitools.client.models.Model2TweetsMedia](docs/Model2TweetsMedia.md)
 - [org.openapitools.client.models.Model2TweetsPoll](docs/Model2TweetsPoll.md)
 - [org.openapitools.client.models.Model2TweetsReply](docs/Model2TweetsReply.md)
 - [org.openapitools.client.models.MultiComplianceJobResponse](docs/MultiComplianceJobResponse.md)
 - [org.openapitools.client.models.MultiComplianceJobResponseMeta](docs/MultiComplianceJobResponseMeta.md)
 - [org.openapitools.client.models.MultiListNoPaginationResponse](docs/MultiListNoPaginationResponse.md)
 - [org.openapitools.client.models.MultiListNoPaginationResponseMeta](docs/MultiListNoPaginationResponseMeta.md)
 - [org.openapitools.client.models.MultiListResponse](docs/MultiListResponse.md)
 - [org.openapitools.client.models.MultiListResponseMeta](docs/MultiListResponseMeta.md)
 - [org.openapitools.client.models.MultiSpaceLookupResponse](docs/MultiSpaceLookupResponse.md)
 - [org.openapitools.client.models.MultiTweetLookupResponse](docs/MultiTweetLookupResponse.md)
 - [org.openapitools.client.models.MultiTweetLookupResponseMeta](docs/MultiTweetLookupResponseMeta.md)
 - [org.openapitools.client.models.MultiUserLookupResponse](docs/MultiUserLookupResponse.md)
 - [org.openapitools.client.models.NonCompliantRulesProblem](docs/NonCompliantRulesProblem.md)
 - [org.openapitools.client.models.OperationalDisconnectProblem](docs/OperationalDisconnectProblem.md)
 - [org.openapitools.client.models.OperationalDisconnectProblemAllOf](docs/OperationalDisconnectProblemAllOf.md)
 - [org.openapitools.client.models.Photo](docs/Photo.md)
 - [org.openapitools.client.models.PhotoAllOf](docs/PhotoAllOf.md)
 - [org.openapitools.client.models.Place](docs/Place.md)
 - [org.openapitools.client.models.PlaceType](docs/PlaceType.md)
 - [org.openapitools.client.models.Point](docs/Point.md)
 - [org.openapitools.client.models.Poll](docs/Poll.md)
 - [org.openapitools.client.models.PollOption](docs/PollOption.md)
 - [org.openapitools.client.models.Problem](docs/Problem.md)
 - [org.openapitools.client.models.ProblemOrError](docs/ProblemOrError.md)
 - [org.openapitools.client.models.QuoteTweetLookupResponse](docs/QuoteTweetLookupResponse.md)
 - [org.openapitools.client.models.QuoteTweetLookupResponseMeta](docs/QuoteTweetLookupResponseMeta.md)
 - [org.openapitools.client.models.ReplySettings](docs/ReplySettings.md)
 - [org.openapitools.client.models.ResourceNotFoundProblem](docs/ResourceNotFoundProblem.md)
 - [org.openapitools.client.models.ResourceNotFoundProblemAllOf](docs/ResourceNotFoundProblemAllOf.md)
 - [org.openapitools.client.models.ResourceUnauthorizedProblem](docs/ResourceUnauthorizedProblem.md)
 - [org.openapitools.client.models.ResourceUnauthorizedProblemAllOf](docs/ResourceUnauthorizedProblemAllOf.md)
 - [org.openapitools.client.models.ResourceUnavailableProblem](docs/ResourceUnavailableProblem.md)
 - [org.openapitools.client.models.ResourceUnavailableProblemAllOf](docs/ResourceUnavailableProblemAllOf.md)
 - [org.openapitools.client.models.Rule](docs/Rule.md)
 - [org.openapitools.client.models.RuleNoId](docs/RuleNoId.md)
 - [org.openapitools.client.models.RulesCapProblem](docs/RulesCapProblem.md)
 - [org.openapitools.client.models.RulesRequestSummary](docs/RulesRequestSummary.md)
 - [org.openapitools.client.models.RulesRequestSummaryOneOf](docs/RulesRequestSummaryOneOf.md)
 - [org.openapitools.client.models.RulesRequestSummaryOneOf1](docs/RulesRequestSummaryOneOf1.md)
 - [org.openapitools.client.models.RulesResponseMetadata](docs/RulesResponseMetadata.md)
 - [org.openapitools.client.models.SearchCount](docs/SearchCount.md)
 - [org.openapitools.client.models.SingleComplianceJobResponse](docs/SingleComplianceJobResponse.md)
 - [org.openapitools.client.models.SingleListLookupResponse](docs/SingleListLookupResponse.md)
 - [org.openapitools.client.models.SingleListLookupResponseIncludes](docs/SingleListLookupResponseIncludes.md)
 - [org.openapitools.client.models.SingleSpaceLookupResponse](docs/SingleSpaceLookupResponse.md)
 - [org.openapitools.client.models.SingleTweetLookupResponse](docs/SingleTweetLookupResponse.md)
 - [org.openapitools.client.models.SingleUserLookupResponse](docs/SingleUserLookupResponse.md)
 - [org.openapitools.client.models.Space](docs/Space.md)
 - [org.openapitools.client.models.SpaceTopics](docs/SpaceTopics.md)
 - [org.openapitools.client.models.StreamingTweet](docs/StreamingTweet.md)
 - [org.openapitools.client.models.Tweet](docs/Tweet.md)
 - [org.openapitools.client.models.TweetAttachments](docs/TweetAttachments.md)
 - [org.openapitools.client.models.TweetCountsResponse](docs/TweetCountsResponse.md)
 - [org.openapitools.client.models.TweetCountsResponseMeta](docs/TweetCountsResponseMeta.md)
 - [org.openapitools.client.models.TweetCreateResponse](docs/TweetCreateResponse.md)
 - [org.openapitools.client.models.TweetCreateResponseData](docs/TweetCreateResponseData.md)
 - [org.openapitools.client.models.TweetDeleteResponse](docs/TweetDeleteResponse.md)
 - [org.openapitools.client.models.TweetDeleteResponseData](docs/TweetDeleteResponseData.md)
 - [org.openapitools.client.models.TweetGeo](docs/TweetGeo.md)
 - [org.openapitools.client.models.TweetNonPublicMetrics](docs/TweetNonPublicMetrics.md)
 - [org.openapitools.client.models.TweetOrganicMetrics](docs/TweetOrganicMetrics.md)
 - [org.openapitools.client.models.TweetPromotedMetrics](docs/TweetPromotedMetrics.md)
 - [org.openapitools.client.models.TweetPublicMetrics](docs/TweetPublicMetrics.md)
 - [org.openapitools.client.models.TweetReferencedTweets](docs/TweetReferencedTweets.md)
 - [org.openapitools.client.models.TweetSearchResponse](docs/TweetSearchResponse.md)
 - [org.openapitools.client.models.TweetSearchResponseMeta](docs/TweetSearchResponseMeta.md)
 - [org.openapitools.client.models.TweetWithheld](docs/TweetWithheld.md)
 - [org.openapitools.client.models.URLFields](docs/URLFields.md)
 - [org.openapitools.client.models.URLImage](docs/URLImage.md)
 - [org.openapitools.client.models.UnsupportedAuthenticationProblem](docs/UnsupportedAuthenticationProblem.md)
 - [org.openapitools.client.models.UrlEntity](docs/UrlEntity.md)
 - [org.openapitools.client.models.UsageCapExceededProblem](docs/UsageCapExceededProblem.md)
 - [org.openapitools.client.models.UsageCapExceededProblemAllOf](docs/UsageCapExceededProblemAllOf.md)
 - [org.openapitools.client.models.User](docs/User.md)
 - [org.openapitools.client.models.UserEntities](docs/UserEntities.md)
 - [org.openapitools.client.models.UserEntitiesUrl](docs/UserEntitiesUrl.md)
 - [org.openapitools.client.models.UserPublicMetrics](docs/UserPublicMetrics.md)
 - [org.openapitools.client.models.UserWithheld](docs/UserWithheld.md)
 - [org.openapitools.client.models.UsersBlockingMutationResponse](docs/UsersBlockingMutationResponse.md)
 - [org.openapitools.client.models.UsersBlockingMutationResponseData](docs/UsersBlockingMutationResponseData.md)
 - [org.openapitools.client.models.UsersFollowingCreateResponse](docs/UsersFollowingCreateResponse.md)
 - [org.openapitools.client.models.UsersFollowingCreateResponseData](docs/UsersFollowingCreateResponseData.md)
 - [org.openapitools.client.models.UsersFollowingDeleteResponse](docs/UsersFollowingDeleteResponse.md)
 - [org.openapitools.client.models.UsersFollowingLookupResponse](docs/UsersFollowingLookupResponse.md)
 - [org.openapitools.client.models.UsersLikesCreateRequest](docs/UsersLikesCreateRequest.md)
 - [org.openapitools.client.models.UsersLikesCreateResponse](docs/UsersLikesCreateResponse.md)
 - [org.openapitools.client.models.UsersLikesCreateResponseData](docs/UsersLikesCreateResponseData.md)
 - [org.openapitools.client.models.UsersLikesDeleteResponse](docs/UsersLikesDeleteResponse.md)
 - [org.openapitools.client.models.UsersMutingMutationResponse](docs/UsersMutingMutationResponse.md)
 - [org.openapitools.client.models.UsersMutingMutationResponseData](docs/UsersMutingMutationResponseData.md)
 - [org.openapitools.client.models.UsersRetweetsCreateRequest](docs/UsersRetweetsCreateRequest.md)
 - [org.openapitools.client.models.UsersRetweetsCreateResponse](docs/UsersRetweetsCreateResponse.md)
 - [org.openapitools.client.models.UsersRetweetsCreateResponseData](docs/UsersRetweetsCreateResponseData.md)
 - [org.openapitools.client.models.UsersRetweetsDeleteResponse](docs/UsersRetweetsDeleteResponse.md)
 - [org.openapitools.client.models.Video](docs/Video.md)
 - [org.openapitools.client.models.VideoAllOf](docs/VideoAllOf.md)
 - [org.openapitools.client.models.VideoAllOfNonPublicMetrics](docs/VideoAllOfNonPublicMetrics.md)
 - [org.openapitools.client.models.VideoAllOfOrganicMetrics](docs/VideoAllOfOrganicMetrics.md)
 - [org.openapitools.client.models.VideoAllOfPromotedMetrics](docs/VideoAllOfPromotedMetrics.md)
 - [org.openapitools.client.models.VideoAllOfPublicMetrics](docs/VideoAllOfPublicMetrics.md)
 - [org.openapitools.client.models.VideoAllOfVariants](docs/VideoAllOfVariants.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="BearerToken"></a>
### BearerToken

- **Type**: HTTP basic authentication

<a name="OAuth2UserToken"></a>
### OAuth2UserToken

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: https://api.twitter.com/2/oauth2/authorize
- **Scopes**: 
  - tweet.read: Allows the app to view any Tweets the authenticated user can see, including Tweets from protected accounts.
  - tweet.write: Allows the app to tweet and retweet for the authenticated user.
  - users.read: Allows the app to view any account the authenticated user can see, including protected accounts.
  - list.write: Allows the app to create and manage lists for the authenticated user.
  - list.read: Allows the app to view any lists the authenticated user has created and lists they are a member of, including private lists.
  - like.read: Allows the app to read Tweets that the authenticated user has liked.
  - like.write: Allows the app to like and un-likes Tweets for the authenticated user.
  - mute.read: Allows the app to read the users the authenticated user has muted.
  - mute.write: Allows the app to mute and unmute users for the authenticated user.
  - block.read: Allows the app to read the users the authenticated user has blocked.
  - block.write: Allows the app to block and unblock users for the authenticated user.
  - tweet.moderate.write: Allows the app to hide and unhide replies to the authenticated user&#39;s Tweets.
  - follows.read: Allows the app to read the users who follow the authenticated user and users that they follow.
  - follows.write: Allows the app to follow and unfollow users for the authenticated user.
  - space.read: Allows the app to read the Spaces the authenticated user can see.
  - offline.access: Allows the app to request a refresh token.
  - bookmark.read: Allows the app to read bookmarked Tweets
  - bookmark.write: Allows the app to add/remove Tweets to/from bookmarks

<a name="UserToken"></a>
### UserToken

- **Type**: HTTP basic authentication

