package fr.haan.open_api_playground_app.data.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import fr.haan.open_api_playground_app.data.entities.ErrorEntity
import fr.haan.open_api_playground_app.data.entities.GenericMultipleUsersLookupResponseEntity
import fr.haan.open_api_playground_app.data.entities.InlineObject1Entity
import fr.haan.open_api_playground_app.data.entities.InlineObject2Entity
import fr.haan.open_api_playground_app.data.entities.InlineObjectEntity
import fr.haan.open_api_playground_app.data.entities.ListLookupMultipleUsersLookupResponseEntity
import fr.haan.open_api_playground_app.data.entities.MultiUserLookupResponseEntity
import fr.haan.open_api_playground_app.data.entities.ProblemEntity
import fr.haan.open_api_playground_app.data.entities.SingleUserLookupResponseEntity
import fr.haan.open_api_playground_app.data.entities.UsersBlockingMutationResponseEntity
import fr.haan.open_api_playground_app.data.entities.UsersFollowingCreateResponseEntity
import fr.haan.open_api_playground_app.data.entities.UsersFollowingDeleteResponseEntity
import fr.haan.open_api_playground_app.data.entities.UsersFollowingLookupResponseEntity
import fr.haan.open_api_playground_app.data.entities.UsersMutingMutationResponseEntity

interface UsersApi {
    /**
     * User lookup me
     * This endpoint returns information about the requesting user.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [SingleUserLookupResponseEntity]
     */
    @GET("2/users/me")
    suspend fun findMyUser(@Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<SingleUserLookupResponseEntity>

    /**
     * User lookup by ID
     * This endpoint returns information about a user. Specify user by ID.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id Required. A User ID. 
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [SingleUserLookupResponseEntity]
     */
    @GET("2/users/{id}")
    suspend fun findUserById(@Path("id") id: kotlin.String, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<SingleUserLookupResponseEntity>

    /**
     * User lookup by username
     * This endpoint returns information about a user. Specify user by username.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param username Required. A username. 
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [SingleUserLookupResponseEntity]
     */
    @GET("2/users/by/username/{username}")
    suspend fun findUserByUsername(@Path("username") username: kotlin.String, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<SingleUserLookupResponseEntity>

    /**
     * User lookup by IDs
     * This endpoint returns information about users. Specify users by their ID.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param ids Required. A list of User IDs, comma-separated. You can specify up to 100 IDs. 
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [MultiUserLookupResponseEntity]
     */
    @GET("2/users")
    suspend fun findUsersById(@Query("ids") ids: CSVParams, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<MultiUserLookupResponseEntity>

    /**
     * User lookup by usernames
     * This endpoint returns information about users. Specify users by their username.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param usernames Required . A list of usernames, comma-separated. You can specify up to 100 usernames. 
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [MultiUserLookupResponseEntity]
     */
    @GET("2/users/by")
    suspend fun findUsersByUsername(@Query("usernames") usernames: CSVParams, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<MultiUserLookupResponseEntity>

    /**
     * Returns user objects that follow a List by the provided List ID
     * Returns a list of users that follow a List by the provided List ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the List for which to return followers 
     * @param maxResults The maximum number of results (optional, default to 100)
     * @param paginationToken This parameter is used to get a specified &#39;page&#39; of results. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [ListLookupMultipleUsersLookupResponseEntity]
     */
    @GET("2/lists/{id}/followers")
    suspend fun listGetFollowers(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.Long? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<ListLookupMultipleUsersLookupResponseEntity>

    /**
     * Returns user objects that are members of a List by the provided List ID
     * Returns a list of users that are members of a List by the provided List ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the List for which to return members 
     * @param maxResults The maximum number of results (optional, default to 100)
     * @param paginationToken This parameter is used to get a specified &#39;page&#39; of results. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [ListLookupMultipleUsersLookupResponseEntity]
     */
    @GET("2/lists/{id}/members")
    suspend fun listGetMembers(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.Long? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<ListLookupMultipleUsersLookupResponseEntity>

    /**
     * Returns user objects that have liked the provided Tweet ID
     * Returns a list of users that have liked the provided Tweet ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the Tweet for which to return results 
     * @param maxResults The maximum number of results (optional, default to 100)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
     * @return [GenericMultipleUsersLookupResponseEntity]
     */
    @GET("2/tweets/{id}/liking_users")
    suspend fun tweetsIdLikingUsers(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null): Response<GenericMultipleUsersLookupResponseEntity>

    /**
     * Returns user objects that have retweeted the provided Tweet ID
     * Returns a list of users that have retweeted the provided Tweet ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the Tweet for which to return results 
     * @param maxResults The maximum number of results (optional, default to 100)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
     * @return [GenericMultipleUsersLookupResponseEntity]
     */
    @GET("2/tweets/{id}/retweeted_by")
    suspend fun tweetsIdRetweetingUsers(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null): Response<GenericMultipleUsersLookupResponseEntity>

    /**
     * Block User by User ID
     * Causes the user (in the path) to block the target user. The user (in the path) must match the user context authorizing the request
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user that is requesting to block the target user 
     * @param inlineObjectEntity  (optional)
     * @return [UsersBlockingMutationResponseEntity]
     */
    @POST("2/users/{id}/blocking")
    suspend fun usersIdBlock(@Path("id") id: kotlin.String, @Body inlineObjectEntity: InlineObjectEntity? = null): Response<UsersBlockingMutationResponseEntity>

    /**
     * Returns user objects that are blocked by provided user ID
     * Returns a list of users that are blocked by the provided user ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to return results 
     * @param maxResults The maximum number of results (optional)
     * @param paginationToken This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. (optional)
     * @return [GenericMultipleUsersLookupResponseEntity]
     */
    @GET("2/users/{id}/blocking")
    suspend fun usersIdBlocking(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null): Response<GenericMultipleUsersLookupResponseEntity>

    /**
     * Follow User
     * Causes the user(in the path) to follow, or “request to follow” for protected users, the target user. The user(in the path) must match the user context authorizing the request
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user that is requesting to follow the target user 
     * @param inlineObject2Entity  (optional)
     * @return [UsersFollowingCreateResponseEntity]
     */
    @POST("2/users/{id}/following")
    suspend fun usersIdFollow(@Path("id") id: kotlin.String, @Body inlineObject2Entity: InlineObject2Entity? = null): Response<UsersFollowingCreateResponseEntity>

    /**
     * Returns user objects that follow the provided user ID
     * Returns a list of users that follow the provided user ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to return results 
     * @param maxResults The maximum number of results (optional)
     * @param paginationToken This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. (optional)
     * @return [GenericMultipleUsersLookupResponseEntity]
     */
    @GET("2/users/{id}/followers")
    suspend fun usersIdFollowers(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null): Response<GenericMultipleUsersLookupResponseEntity>

    /**
     * Following by User ID
     * Returns a list of users that are being followed by the provided user ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to return results 
     * @param maxResults The maximum number of results (optional)
     * @param paginationToken This value is populated by passing the &#39;next_token&#39; or &#39;previous_token&#39; returned in a request to paginate through results. (optional)
     * @return [UsersFollowingLookupResponseEntity]
     */
    @GET("2/users/{id}/following")
    suspend fun usersIdFollowing(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null): Response<UsersFollowingLookupResponseEntity>

    /**
     * Mute User by User ID
     * Causes the user (in the path) to mute the target user. The user (in the path) must match the user context authorizing the request
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user that is requesting to mute the target user 
     * @param inlineObject1Entity  (optional)
     * @return [UsersMutingMutationResponseEntity]
     */
    @POST("2/users/{id}/muting")
    suspend fun usersIdMute(@Path("id") id: kotlin.String, @Body inlineObject1Entity: InlineObject1Entity? = null): Response<UsersMutingMutationResponseEntity>

    /**
     * Returns user objects that are muted by the provided user ID
     * Returns a list of users that are muted by the provided user ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to return results 
     * @param maxResults The maximum number of results (optional, default to 100)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
     * @return [GenericMultipleUsersLookupResponseEntity]
     */
    @GET("2/users/{id}/muting")
    suspend fun usersIdMuting(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null): Response<GenericMultipleUsersLookupResponseEntity>

    /**
     * Unblock User by User ID
     * Causes the source user to unblock the target user. The source user must match the user context authorizing the request
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param sourceUserId The ID of the user that is requesting to unblock the target user 
     * @param targetUserId The ID of the user that the source user is requesting to unblock 
     * @return [UsersBlockingMutationResponseEntity]
     */
    @DELETE("2/users/{source_user_id}/blocking/{target_user_id}")
    suspend fun usersIdUnblock(@Path("source_user_id") sourceUserId: kotlin.String, @Path("target_user_id") targetUserId: kotlin.String): Response<UsersBlockingMutationResponseEntity>

    /**
     * Unfollow User
     * Causes the source user to unfollow the target user. The source user must match the user context authorizing the request
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param sourceUserId The ID of the user that is requesting to unfollow the target user 
     * @param targetUserId The ID of the user that the source user is requesting to unfollow 
     * @return [UsersFollowingDeleteResponseEntity]
     */
    @DELETE("2/users/{source_user_id}/following/{target_user_id}")
    suspend fun usersIdUnfollow(@Path("source_user_id") sourceUserId: kotlin.String, @Path("target_user_id") targetUserId: kotlin.String): Response<UsersFollowingDeleteResponseEntity>

    /**
     * Unmute User by User ID
     * Causes the source user to unmute the target user. The source user must match the user context authorizing the request
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param sourceUserId The ID of the user that is requesting to unmute the target user 
     * @param targetUserId The ID of the user that the source user is requesting to unmute 
     * @return [UsersMutingMutationResponseEntity]
     */
    @DELETE("2/users/{source_user_id}/muting/{target_user_id}")
    suspend fun usersIdUnmute(@Path("source_user_id") sourceUserId: kotlin.String, @Path("target_user_id") targetUserId: kotlin.String): Response<UsersMutingMutationResponseEntity>

}
