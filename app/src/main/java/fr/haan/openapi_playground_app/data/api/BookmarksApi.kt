package fr.haan.openapi_playground_app.data.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import fr.haan.openapi_playground_app.data.entities.AddBookmarkRequestEntity
import fr.haan.openapi_playground_app.data.entities.BookmarkMutationResponseEntity
import fr.haan.openapi_playground_app.data.entities.ErrorEntity
import fr.haan.openapi_playground_app.data.entities.GenericTweetsTimelineResponseEntity
import fr.haan.openapi_playground_app.data.entities.ProblemEntity

interface BookmarksApi {
    /**
     * Bookmarks by User
     * Returns Tweet objects that have been bookmarked by the requesting user
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to return results 
     * @param maxResults The maximum number of results (optional)
     * @param paginationToken This parameter is used to get the next &#39;page&#39; of results. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param tweetFields A comma separated list of Tweet fields to display. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @param mediaFields A comma separated list of Media fields to display. (optional)
     * @param placeFields A comma separated list of Place fields to display. (optional)
     * @param pollFields A comma separated list of Poll fields to display. (optional)
     * @return [GenericTweetsTimelineResponseEntity]
     */
    @GET("2/users/{id}/bookmarks")
    suspend fun getUsersIdBookmarks(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.String? = null, @Query("expansions") expansions: CSVParams? = null, @Query("tweet.fields") tweetFields: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null, @Query("media.fields") mediaFields: CSVParams? = null, @Query("place.fields") placeFields: CSVParams? = null, @Query("poll.fields") pollFields: CSVParams? = null): Response<GenericTweetsTimelineResponseEntity>

    /**
     * Add Tweet to Bookmarks
     * Adds a Tweet (ID in the body) to the requesting user&#39;s (in the path) bookmarks
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to add bookmarks 
     * @param addBookmarkRequestEntity  
     * @return [BookmarkMutationResponseEntity]
     */
    @POST("2/users/{id}/bookmarks")
    suspend fun postUsersIdBookmarks(@Path("id") id: kotlin.String, @Body addBookmarkRequestEntity: AddBookmarkRequestEntity): Response<BookmarkMutationResponseEntity>

    /**
     * Remove a bookmarked Tweet
     * Removes a Tweet from the requesting user&#39;s bookmarked Tweets.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user whose bookmark is to be removed. 
     * @param tweetId The ID of the tweet that the user is removing from bookmarks 
     * @return [BookmarkMutationResponseEntity]
     */
    @DELETE("2/users/{id}/bookmarks/{tweet_id}")
    suspend fun usersIdBookmarksDelete(@Path("id") id: kotlin.String, @Path("tweet_id") tweetId: kotlin.String): Response<BookmarkMutationResponseEntity>

}
