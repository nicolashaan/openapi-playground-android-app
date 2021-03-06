/**
 * Twitter API v2
 *
 * Twitter API v2 available endpoints
 *
 * The version of the OpenAPI document: 2.42
 * 
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package fr.haan.openapi_playground_app.data.entities


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Tweet information of the Tweet being replied to.
 *
 * @param inReplyToTweetId Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
 * @param excludeReplyUserIds A list of User Ids to be excluded from the reply Tweet.
 */
@Serializable
data class Model2TweetsReplyEntity (

    /* Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. */
    @SerialName(value = "in_reply_to_tweet_id")
    val inReplyToTweetId: kotlin.String? = null,

    /* A list of User Ids to be excluded from the reply Tweet. */
    @SerialName(value = "exclude_reply_user_ids")
    val excludeReplyUserIds: kotlin.collections.List<kotlin.String>? = null

)

