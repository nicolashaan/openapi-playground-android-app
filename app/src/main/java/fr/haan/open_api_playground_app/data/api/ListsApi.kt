package fr.haan.open_api_playground_app.data.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import fr.haan.open_api_playground_app.data.entities.ErrorEntity
import fr.haan.open_api_playground_app.data.entities.ListAddMemberRequestEntity
import fr.haan.open_api_playground_app.data.entities.ListCreateRequestEntity
import fr.haan.open_api_playground_app.data.entities.ListCreateResponseEntity
import fr.haan.open_api_playground_app.data.entities.ListDeleteResponseEntity
import fr.haan.open_api_playground_app.data.entities.ListFollowRequestEntity
import fr.haan.open_api_playground_app.data.entities.ListFollowedResponseEntity
import fr.haan.open_api_playground_app.data.entities.ListMemberResponseEntity
import fr.haan.open_api_playground_app.data.entities.ListPinRequestEntity
import fr.haan.open_api_playground_app.data.entities.ListPinnedResponseEntity
import fr.haan.open_api_playground_app.data.entities.ListUpdateRequestEntity
import fr.haan.open_api_playground_app.data.entities.ListUpdateResponseEntity
import fr.haan.open_api_playground_app.data.entities.MultiListNoPaginationResponseEntity
import fr.haan.open_api_playground_app.data.entities.MultiListResponseEntity
import fr.haan.open_api_playground_app.data.entities.ProblemEntity
import fr.haan.open_api_playground_app.data.entities.SingleListLookupResponseEntity

interface ListsApi {
    /**
     * Get a User&#39;s List Memberships
     * Get a User&#39;s List Memberships.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to return results 
     * @param maxResults The maximum number of results (optional, default to 100)
     * @param paginationToken This parameter is used to get a specified &#39;page&#39; of results. (optional)
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [MultiListResponseEntity]
     */
    @GET("2/users/{id}/list_memberships")
    suspend fun getUserListMemberships(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.Long? = null, @Query("list.fields") listFields: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<MultiListResponseEntity>

    /**
     * Add a List member
     * Causes a user to become a member of a List.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the List to add a member 
     * @param listAddMemberRequestEntity  (optional)
     * @return [ListMemberResponseEntity]
     */
    @POST("2/lists/{id}/members")
    suspend fun listAddMember(@Path("id") id: kotlin.String, @Body listAddMemberRequestEntity: ListAddMemberRequestEntity? = null): Response<ListMemberResponseEntity>

    /**
     * Create List
     * Creates a new List.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param listCreateRequestEntity  (optional)
     * @return [ListCreateResponseEntity]
     */
    @POST("2/lists")
    suspend fun listIdCreate(@Body listCreateRequestEntity: ListCreateRequestEntity? = null): Response<ListCreateResponseEntity>

    /**
     * Delete List
     * Delete a List that you own.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the List to delete 
     * @return [ListDeleteResponseEntity]
     */
    @DELETE("2/lists/{id}")
    suspend fun listIdDelete(@Path("id") id: kotlin.String): Response<ListDeleteResponseEntity>

    /**
     * List lookup by List ID
     * Returns a List
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the List to get 
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [SingleListLookupResponseEntity]
     */
    @GET("2/lists/{id}")
    suspend fun listIdGet(@Path("id") id: kotlin.String, @Query("list.fields") listFields: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<SingleListLookupResponseEntity>

    /**
     * Update List
     * Update a List that you own.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the List to modify 
     * @param listUpdateRequestEntity  (optional)
     * @return [ListUpdateResponseEntity]
     */
    @PUT("2/lists/{id}")
    suspend fun listIdUpdate(@Path("id") id: kotlin.String, @Body listUpdateRequestEntity: ListUpdateRequestEntity? = null): Response<ListUpdateResponseEntity>

    /**
     * Remove a List member
     * Causes a user to be removed from the members of a List.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the List to remove a member 
     * @param userId The ID of user that will be removed from the List 
     * @return [ListMemberResponseEntity]
     */
    @DELETE("2/lists/{id}/members/{user_id}")
    suspend fun listRemoveMember(@Path("id") id: kotlin.String, @Path("user_id") userId: kotlin.String): Response<ListMemberResponseEntity>

    /**
     * Follow a List
     * Causes a user to follow a List.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the authenticated source user that will follow the List 
     * @param listFollowRequestEntity  (optional)
     * @return [ListFollowedResponseEntity]
     */
    @POST("2/users/{id}/followed_lists")
    suspend fun listUserFollow(@Path("id") id: kotlin.String, @Body listFollowRequestEntity: ListFollowRequestEntity? = null): Response<ListFollowedResponseEntity>

    /**
     * Get a User&#39;s Owned Lists
     * Get a User&#39;s Owned Lists.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to return results 
     * @param maxResults The maximum number of results (optional, default to 100)
     * @param paginationToken This parameter is used to get a specified &#39;page&#39; of results. (optional)
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [MultiListResponseEntity]
     */
    @GET("2/users/{id}/owned_lists")
    suspend fun listUserOwnedLists(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.Long? = null, @Query("list.fields") listFields: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<MultiListResponseEntity>

    /**
     * Pin a List
     * Causes a user to pin a List.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the authenticated source user that will pin the List 
     * @param listPinRequestEntity  (optional)
     * @return [ListPinnedResponseEntity]
     */
    @POST("2/users/{id}/pinned_lists")
    suspend fun listUserPin(@Path("id") id: kotlin.String, @Body listPinRequestEntity: ListPinRequestEntity? = null): Response<ListPinnedResponseEntity>

    /**
     * Get a User&#39;s Pinned Lists
     * Get a User&#39;s Pinned Lists.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to return results 
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [MultiListNoPaginationResponseEntity]
     */
    @GET("2/users/{id}/pinned_lists")
    suspend fun listUserPinnedLists(@Path("id") id: kotlin.String, @Query("list.fields") listFields: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<MultiListNoPaginationResponseEntity>

    /**
     * Unfollow a List
     * Causes a user to unfollow a List.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the authenticated source user that will unfollow the List 
     * @param listId The ID of the List to unfollow 
     * @return [ListFollowedResponseEntity]
     */
    @DELETE("2/users/{id}/followed_lists/{list_id}")
    suspend fun listUserUnfollow(@Path("id") id: kotlin.String, @Path("list_id") listId: kotlin.String): Response<ListFollowedResponseEntity>

    /**
     * Unpin a List
     * Causes a user to remove a pinned List.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the authenticated source user that will remove the pinned List 
     * @param listId The ID of the List to unpin 
     * @return [ListPinnedResponseEntity]
     */
    @DELETE("2/users/{id}/pinned_lists/{list_id}")
    suspend fun listUserUnpin(@Path("id") id: kotlin.String, @Path("list_id") listId: kotlin.String): Response<ListPinnedResponseEntity>

    /**
     * Get User&#39;s Followed Lists
     * Returns a user&#39;s followed Lists.
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id The ID of the user for whom to return results 
     * @param maxResults The maximum number of results (optional, default to 100)
     * @param paginationToken This parameter is used to get a specified &#39;page&#39; of results. (optional)
     * @param listFields A comma separated list of List fields to display. (optional)
     * @param expansions A comma separated list of fields to expand. (optional)
     * @param userFields A comma separated list of User fields to display. (optional)
     * @return [MultiListResponseEntity]
     */
    @GET("2/users/{id}/followed_lists")
    suspend fun userFollowedLists(@Path("id") id: kotlin.String, @Query("max_results") maxResults: kotlin.Int? = null, @Query("pagination_token") paginationToken: kotlin.Long? = null, @Query("list.fields") listFields: CSVParams? = null, @Query("expansions") expansions: CSVParams? = null, @Query("user.fields") userFields: CSVParams? = null): Response<MultiListResponseEntity>

}
