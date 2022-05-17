package fr.haan.openapi_playground_app.data.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import fr.haan.openapi_playground_app.data.entities.ErrorEntity
import fr.haan.openapi_playground_app.data.entities.MultiSpaceLookupResponseEntity
import fr.haan.openapi_playground_app.data.entities.MultiTweetLookupResponseEntity
import fr.haan.openapi_playground_app.data.entities.MultiUserLookupResponseEntity
import fr.haan.openapi_playground_app.data.entities.ProblemEntity
import fr.haan.openapi_playground_app.data.entities.SingleSpaceLookupResponseEntity

interface SpacesApi {
    /**
     * Space lookup by Space ID
     * Returns a variety of information about the Space specified by the requested ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The space id to be retrieved 
     * @param spaceFields A comma separated list of Space fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @return [SingleSpaceLookupResponseEntity]
     */
    @GET("2/spaces/{id}")
    suspend fun findSpaceById(@Path("id") id: kotlin.String, @Query("space.fields") spaceFields: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null): Response<SingleSpaceLookupResponseEntity>

    /**
     * Space lookup by their creators
     * Returns a variety of information about the Spaces created by the provided User IDs
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param userIds The users to search through 
     * @param spaceFields A comma separated list of Space fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @return [MultiSpaceLookupResponseEntity]
     */
    @GET("2/spaces/by/creator_ids")
    suspend fun findSpacesByCreatorIds(@Query("user_ids") userIds: kotlin.collections.List<kotlin.String>, @Query("space.fields") spaceFields: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null): Response<MultiSpaceLookupResponseEntity>

    /**
     * Space lookup up Space IDs
     * Returns a variety of information about the Spaces specified by the requested IDs
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param ids A list of space ids 
     * @param spaceFields A comma separated list of Space fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @return [MultiSpaceLookupResponseEntity]
     */
    @GET("2/spaces")
    suspend fun findSpacesByIds(@Query("ids") ids: kotlin.collections.List<kotlin.String>, @Query("space.fields") spaceFields: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null): Response<MultiSpaceLookupResponseEntity>

    /**
     * Search for Spaces
     * Returns Spaces that match the provided query.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param query The search query 
     * @param state The state of spaces to search for (optional, default to all)
     * @param maxResults The number of results to return. The maximum for this value is 100. (optional)
     * @param spaceFields A comma separated list of Space fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @return [MultiSpaceLookupResponseEntity]
     */
    @GET("2/spaces/search")
    suspend fun searchSpaces(@Query("query") query: kotlin.String, @Query("state") state: kotlin.String? = null, @Query("max_results") maxResults: kotlin.Int? = null, @Query("space.fields") spaceFields: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null): Response<MultiSpaceLookupResponseEntity>

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

}
