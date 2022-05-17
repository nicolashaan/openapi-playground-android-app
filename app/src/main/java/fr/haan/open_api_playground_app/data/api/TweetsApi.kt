package fr.haan.open_api_playground_app.data.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import fr.haan.open_api_playground_app.data.entities.AddOrDeleteRulesRequestEntity
import fr.haan.open_api_playground_app.data.entities.AddOrDeleteRulesResponseEntity
import fr.haan.open_api_playground_app.data.entities.ErrorEntity
import fr.haan.open_api_playground_app.data.entities.FilteredStreamingTweetEntity
import fr.haan.open_api_playground_app.data.entities.GenericTweetsTimelineResponseEntity
import fr.haan.open_api_playground_app.data.entities.GranularityEntity
import fr.haan.open_api_playground_app.data.entities.InlineObject3Entity
import fr.haan.open_api_playground_app.data.entities.InlineObject4Entity
import fr.haan.open_api_playground_app.data.entities.InlineResponse2001Entity
import fr.haan.open_api_playground_app.data.entities.InlineResponse2002Entity
import fr.haan.open_api_playground_app.data.entities.InlineResponse200Entity
import fr.haan.open_api_playground_app.data.entities.MultiTweetLookupResponseEntity
import fr.haan.open_api_playground_app.data.entities.MultiUserLookupResponseEntity
import fr.haan.open_api_playground_app.data.entities.ProblemEntity
import fr.haan.open_api_playground_app.data.entities.QuoteTweetLookupResponseEntity
import fr.haan.open_api_playground_app.data.entities.SingleTweetLookupResponseEntity
import fr.haan.open_api_playground_app.data.entities.StreamingTweetEntity
import fr.haan.open_api_playground_app.data.entities.TweetCountsResponseEntity
import fr.haan.open_api_playground_app.data.entities.TweetCreateResponseEntity
import fr.haan.open_api_playground_app.data.entities.TweetDeleteResponseEntity
import fr.haan.open_api_playground_app.data.entities.TweetSearchResponseEntity
import fr.haan.open_api_playground_app.data.entities.UsersLikesCreateRequestEntity
import fr.haan.open_api_playground_app.data.entities.UsersLikesCreateResponseEntity
import fr.haan.open_api_playground_app.data.entities.UsersLikesDeleteResponseEntity
import fr.haan.open_api_playground_app.data.entities.UsersRetweetsCreateRequestEntity
import fr.haan.open_api_playground_app.data.entities.UsersRetweetsCreateResponseEntity
import fr.haan.open_api_playground_app.data.entities.UsersRetweetsDeleteResponseEntity

interface TweetsApi {
    /**
     * Add/Delete rules
     * Add or delete rules from a user&#39;s active rule set. Users can provide unique, optionally tagged rules to add. Users can delete their entire rule set or a subset specified by rule ids or values.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param addOrDeleteRulesRequestEntity  
     * @param dryRun Dry Run can be used with both the add and delete action, with the expected result given, but without actually taking any action in the system (meaning the end state will always be as it was when the request was submitted). This is particularly useful to validate rule changes. (optional)
     * @return [AddOrDeleteRulesResponseEntity]
     */
    @POST("2/tweets/search/stream/rules")
    suspend fun addOrDeleteRules(@Body addOrDeleteRulesRequestEntity: AddOrDeleteRulesRequestEntity, @Query("dry_run") dryRun: kotlin.Boolean? = null): Response<AddOrDeleteRulesResponseEntity>

    /**
     * Creation of a Tweet
     * Causes the user to create a tweet under the authorized account.
     * Responses:
     *  - 201: The request was successful
     *  - 0: The request has failed.
     *
     * @param inlineObject3Entity  (optional)
     * @return [TweetCreateResponseEntity]
     */
    @POST("2/tweets")
    suspend fun createTweet(@Body inlineObject3Entity: InlineObject3Entity? = null): Response<TweetCreateResponseEntity>

    /**
     * Tweet delete by Tweet ID
     * Delete specified Tweet (in the path) by ID.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the Tweet to be deleted. 
     * @return [TweetDeleteResponseEntity]
     */
    @DELETE("2/tweets/{id}")
    suspend fun deleteTweetById(@Path("id") id: kotlin.String): Response<TweetDeleteResponseEntity>

    /**
     * Tweet lookup by Tweet ID
     * Returns a variety of information about the Tweet specified by the requested ID.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id A single Tweet ID. 
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [SingleTweetLookupResponseEntity]
     */
    @GET("2/tweets/{id}")
    suspend fun findTweetById(@Path("id") id: kotlin.String, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<SingleTweetLookupResponseEntity>

    /**
     * Tweet lookup by Tweet IDs
     * Returns a variety of information about the Tweet specified by the requested ID.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param ids A comma separated list of Tweet IDs. Up to 100 are allowed in a single request. 
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [MultiTweetLookupResponseEntity]
     */
    @GET("2/tweets")
    suspend fun findTweetsById(@Query("ids") ids: CSVParams, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<MultiTweetLookupResponseEntity>

    /**
     * Retrieve tweets that quote a tweet.
     * Returns a variety of information about each tweet that quotes the Tweet specified by the requested ID.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the Quoted Tweet. 
     * @param maxResults The maximum number of results to be returned. (optional, default to 10)
     * @param exclude The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;) (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [QuoteTweetLookupResponseEntity]
     */
    @GET("2/tweets/{id}/quote_tweets")
    suspend fun findTweetsThatQuoteATweet(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("exclude") exclude: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<QuoteTweetLookupResponseEntity>

    /**
     * Rules lookup
     * Returns rules from a user&#39;s active rule set. Users can fetch all of their rules or a subset, specified by the provided rule ids.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param ids A comma-separated list of Rule IDs. (optional)
     * @param maxResults The maximum number of results (optional, default to 1000)
     * @param paginationToken This value is populated by passing the &#39;next_token&#39; returned in a request to paginate through results. (optional)
     * @return [InlineResponse2001Entity]
     */
    @GET("2/tweets/search/stream/rules")
    suspend fun getRules(@Query("ids") ids: kotlin.collections.List<kotlin.String>? = null, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null): Response<InlineResponse2001Entity>

    /**
     * Hide replies
     * Hides or unhides a reply to an owned conversation.
     * Responses:
     *  - 200: A successful response. The reply has been hidden or unhidden.
     *  - 0: The request has failed.
     *
     * @param id The ID of the reply that you want to hide or unhide. 
     * @param inlineObject4Entity  (optional)
     * @return [InlineResponse200Entity]
     */
    @PUT("2/tweets/{id}/hidden")
    suspend fun hideReplyById(@Path("id") id: kotlin.String, @Body inlineObject4Entity: InlineObject4Entity? = null): Response<InlineResponse200Entity>

    /**
     * List Tweets timeline by List ID
     * Returns a list of Tweets associated with the provided List ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the List to list Tweets of 
     * @param maxResults The maximum number of results (optional, default to 100)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [InlineResponse2002Entity]
     */
    @GET("2/lists/{id}/tweets")
    suspend fun listsIdTweets(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<InlineResponse2002Entity>

    /**
     * Sample stream
     * Streams a deterministic 1% of public Tweets.
     * Responses:
     *  - 200: The request was successful. Successful responses will return a stream of individual JSON Tweet payloads.
     *  - 0: The request has failed.
     *
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @param backfillMinutes The number of minutes of backfill requested (optional)
     * @return [StreamingTweetEntity]
     */
    @GET("2/tweets/sample/stream")
    suspend fun sampleStream(@Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null, @Query("backfill_minutes") backfillMinutes: kotlin.Int? = null): Response<StreamingTweetEntity>

    /**
     * Filtered stream
     * Streams Tweets matching the stream&#39;s active rule set.
     * Responses:
     *  - 200: The request was successful. Successful responses will return a stream of individual JSON Tweet payloads.
     *  - 0: The request has failed.
     *
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @param backfillMinutes The number of minutes of backfill requested (optional)
     * @return [FilteredStreamingTweetEntity]
     */
    @GET("2/tweets/search/stream")
    suspend fun searchStream(@Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null, @Query("backfill_minutes") backfillMinutes: kotlin.Int? = null): Response<FilteredStreamingTweetEntity>

    /**
     * Retrieve the list of users who purchased a ticket to the given space
     * Retrieves the list of users who purchased a ticket to the given space
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The space id from which tweets will be retrieved 
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [MultiUserLookupResponseEntity]
     */
    @GET("2/spaces/{id}/buyers")
    suspend fun spaceBuyers(@Path("id") id: kotlin.String, @Query("user.fields") userFields: CSVParams? = null): Response<MultiUserLookupResponseEntity>

    /**
     * Retrieve tweets from a Space
     * Retrieves tweets shared in the specified space
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The space id from which tweets will be retrieved 
     * @param maxResults The number of tweets to fetch from the provided space. If not provided, the value will default to the maximum of 100 (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @return [MultiTweetLookupResponseEntity]
     */
    @GET("2/spaces/{id}/tweets")
    suspend fun spaceTweets(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("tweet.fields") tweetFields: CSVParams? = null): Response<MultiTweetLookupResponseEntity>

    /**
     * Full archive search counts
     * Returns Tweet Counts that match a search query.
     * Responses:
     *  - 200: Tweet counts response
     *  - 0: The request has failed.
     *
     * @param query One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length 
     * @param startTime YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). (optional)
     * @param endTime YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). (optional)
     * @param sinceId Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. (optional)
     * @param untilId Returns results with a Tweet ID less than (that is, older than) the specified ID. (optional)
     * @param nextToken This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. (optional)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. (optional)
     * @param granularity The granularity for the search counts results. (optional, default to hour)
     * @return [TweetCountsResponseEntity]
     */
    @GET("2/tweets/counts/all")
    suspend fun tweetCountsFullArchiveSearch(@Query("query") query: kotlin.String, @Query("start_time") startTime: java.time.OffsetDateTime? = null, @Query("end_time") endTime: java.time.OffsetDateTime? = null, @Query("since_id") sinceId: kotlin.String? = null, @Query("until_id") untilId: kotlin.String? = null, @Query("next_token") nextToken: kotlin.String? = null, @Query("pagination_token") paginationToken: kotlin.String? = null, @Query("granularity") granularity: GranularityEntity? = null): Response<TweetCountsResponseEntity>

    /**
     * Recent search counts
     * Returns Tweet Counts from the last 7 days that match a search query.
     * Responses:
     *  - 200: Recent tweet counts response
     *  - 0: The request has failed.
     *
     * @param query One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length 
     * @param startTime YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). (optional)
     * @param endTime YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). (optional)
     * @param sinceId Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. (optional)
     * @param untilId Returns results with a Tweet ID less than (that is, older than) the specified ID. (optional)
     * @param nextToken This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. (optional)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. (optional)
     * @param granularity The granularity for the search counts results. (optional, default to hour)
     * @return [TweetCountsResponseEntity]
     */
    @GET("2/tweets/counts/recent")
    suspend fun tweetCountsRecentSearch(@Query("query") query: kotlin.String, @Query("start_time") startTime: java.time.OffsetDateTime? = null, @Query("end_time") endTime: java.time.OffsetDateTime? = null, @Query("since_id") sinceId: kotlin.String? = null, @Query("until_id") untilId: kotlin.String? = null, @Query("next_token") nextToken: kotlin.String? = null, @Query("pagination_token") paginationToken: kotlin.String? = null, @Query("granularity") granularity: GranularityEntity? = null): Response<TweetCountsResponseEntity>

    /**
     * Full-archive search
     * Returns Tweets that match a search query.
     * Responses:
     *  - 200: Tweets full archive search response
     *  - 0: The request has failed.
     *
     * @param query One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length 
     * @param startTime YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). (optional)
     * @param endTime YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). (optional)
     * @param sinceId Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. (optional)
     * @param untilId Returns results with a Tweet ID less than (that is, older than) the specified ID. (optional)
     * @param maxResults The maximum number of search results to be returned by a request. (optional, default to 10)
     * @param sortOrder This order in which to return results. (optional)
     * @param nextToken This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. (optional)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [TweetSearchResponseEntity]
     */
    @GET("2/tweets/search/all")
    suspend fun tweetsFullarchiveSearch(@Query("query") query: kotlin.String, @Query("start_time") startTime: java.time.OffsetDateTime? = null, @Query("end_time") endTime: java.time.OffsetDateTime? = null, @Query("since_id") sinceId: kotlin.String? = null, @Query("until_id") untilId: kotlin.String? = null, @Query("max_results") maxResults: kotlin.Int? = null, @Query("sort_order") sortOrder: kotlin.String? = null, @Query("next_token") nextToken: kotlin.String? = null, @Query("pagination_token") paginationToken: kotlin.String? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<TweetSearchResponseEntity>

    /**
     * Recent search
     * Returns Tweets from the last 7 days that match a search query.
     * Responses:
     *  - 200: Tweets recent search response
     *  - 0: The request has failed.
     *
     * @param query One query/rule/filter for matching Tweets. Refer to https://t.co/rulelength to identify the max query length 
     * @param startTime YYYY-MM-DDTHH:mm:ssZ. The oldest UTC timestamp (from most recent 7 days) from which the Tweets will be provided. Timestamp is in second granularity and is inclusive (i.e. 12:00:01 includes the first second of the minute). (optional)
     * @param endTime YYYY-MM-DDTHH:mm:ssZ. The newest, most recent UTC timestamp to which the Tweets will be provided. Timestamp is in second granularity and is exclusive (i.e. 12:00:01 excludes the first second of the minute). (optional)
     * @param sinceId Returns results with a Tweet ID greater than (that is, more recent than) the specified ID. (optional)
     * @param untilId Returns results with a Tweet ID less than (that is, older than) the specified ID. (optional)
     * @param maxResults The maximum number of search results to be returned by a request. (optional, default to 10)
     * @param sortOrder This order in which to return results. (optional)
     * @param nextToken This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. (optional)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. The value used with the parameter is pulled directly from the response provided by the API, and should not be modified. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [TweetSearchResponseEntity]
     */
    @GET("2/tweets/search/recent")
    suspend fun tweetsRecentSearch(@Query("query") query: kotlin.String, @Query("start_time") startTime: java.time.OffsetDateTime? = null, @Query("end_time") endTime: java.time.OffsetDateTime? = null, @Query("since_id") sinceId: kotlin.String? = null, @Query("until_id") untilId: kotlin.String? = null, @Query("max_results") maxResults: kotlin.Int? = null, @Query("sort_order") sortOrder: kotlin.String? = null, @Query("next_token") nextToken: kotlin.String? = null, @Query("pagination_token") paginationToken: kotlin.String? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<TweetSearchResponseEntity>

    /**
     * Causes the user (in the path) to like the specified tweet
     * Causes the user (in the path) to like the specified tweet. The user in the path must match the user context authorizing the request.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user that is requesting to like the tweet 
     * @param usersLikesCreateRequestEntity  (optional)
     * @return [UsersLikesCreateResponseEntity]
     */
    @POST("2/users/{id}/likes")
    suspend fun usersIdLike(@Path("id") id: kotlin.String, @Body usersLikesCreateRequestEntity: UsersLikesCreateRequestEntity? = null): Response<UsersLikesCreateResponseEntity>

    /**
     * Returns Tweet objects liked by the provided User ID
     * Returns a list of Tweets liked by the provided User ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the User to list the liked Tweets of 
     * @param maxResults The maximum number of results (optional)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [InlineResponse2002Entity]
     */
    @GET("2/users/{id}/liked_tweets")
    suspend fun usersIdLikedTweets(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<InlineResponse2002Entity>

    /**
     * User mention timeline by User ID
     * Returns Tweet objects that mention username associated to the provided User ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the User to list mentions of 
     * @param sinceId The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. (optional)
     * @param untilId The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. (optional)
     * @param maxResults The maximum number of results (optional)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
     * @param startTime YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. (optional)
     * @param endTime YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [GenericTweetsTimelineResponseEntity]
     */
    @GET("2/users/{id}/mentions")
    suspend fun usersIdMentions(@Path("id") id: kotlin.String, @Query("since_id") sinceId: kotlin.String? = null, @Query("until_id") untilId: kotlin.String? = null, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null, @Query("start_time") startTime: java.time.OffsetDateTime? = null, @Query("end_time") endTime: java.time.OffsetDateTime? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<GenericTweetsTimelineResponseEntity>

    /**
     * Causes the user (in the path) to retweet the specified tweet
     * Causes the user (in the path) to retweet the specified tweet. The user in the path must match the user context authorizing the request.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user that is requesting to retweet the tweet 
     * @param usersRetweetsCreateRequestEntity  (optional)
     * @return [UsersRetweetsCreateResponseEntity]
     */
    @POST("2/users/{id}/retweets")
    suspend fun usersIdRetweets(@Path("id") id: kotlin.String, @Body usersRetweetsCreateRequestEntity: UsersRetweetsCreateRequestEntity? = null): Response<UsersRetweetsCreateResponseEntity>

    /**
     * User Tweets timeline by User ID
     * Returns a list of Tweets authored by the provided User ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the User to list Tweets of 
     * @param sinceId The minimum Tweet ID to be included in the result set. This parameter takes precedence over start_time if both are specified. (optional)
     * @param untilId The maximum Tweet ID to be included in the result set. This parameter takes precedence over end_time if both are specified. (optional)
     * @param maxResults The maximum number of results (optional)
     * @param exclude The set of entities to exclude (e.g. &#39;replies&#39; or &#39;retweets&#39;) (optional)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
     * @param startTime YYYY-MM-DDTHH:mm:ssZ. The earliest UTC timestamp from which the Tweets will be provided. The since_id parameter takes precedence if it is also specified. (optional)
     * @param endTime YYYY-MM-DDTHH:mm:ssZ. The latest UTC timestamp to which the Tweets will be provided. The until_id parameter takes precedence if it is also specified. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [GenericTweetsTimelineResponseEntity]
     */
    @GET("2/users/{id}/tweets")
    suspend fun usersIdTweets(@Path("id") id: kotlin.String, @Query("since_id") sinceId: kotlin.String? = null, @Query("until_id") untilId: kotlin.String? = null, @Query("max_results") maxResults: kotlin.Int? = null, @Query("exclude") exclude: CSVParams? = null, @Query("pagination_token") paginationToken: kotlin.String? = null, @Query("start_time") startTime: java.time.OffsetDateTime? = null, @Query("end_time") endTime: java.time.OffsetDateTime? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<GenericTweetsTimelineResponseEntity>

    /**
     * Causes the user (in the path) to unlike the specified tweet
     * Causes the user (in the path) to unlike the specified tweet. The user must match the user context authorizing the request
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user that is requesting to unlike the tweet 
     * @param tweetId The ID of the tweet that the user is requesting to unlike 
     * @return [UsersLikesDeleteResponseEntity]
     */
    @DELETE("2/users/{id}/likes/{tweet_id}")
    suspend fun usersIdUnlike(@Path("id") id: kotlin.String, @Path("tweet_id") tweetId: kotlin.String): Response<UsersLikesDeleteResponseEntity>

    /**
     * Causes the user (in the path) to unretweet the specified tweet
     * Causes the user (in the path) to unretweet the specified tweet. The user must match the user context authorizing the request
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user that is requesting to unretweet the tweet 
     * @param sourceTweetId The ID of the tweet that the user is requesting to unretweet 
     * @return [UsersRetweetsDeleteResponseEntity]
     */
    @DELETE("2/users/{id}/retweets/{source_tweet_id}")
    suspend fun usersIdUnretweets(@Path("id") id: kotlin.String, @Path("source_tweet_id") sourceTweetId: kotlin.String): Response<UsersRetweetsDeleteResponseEntity>

}
