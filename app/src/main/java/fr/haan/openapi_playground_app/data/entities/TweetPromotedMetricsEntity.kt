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
 * Promoted nonpublic engagement metrics for the Tweet at the time of the request.
 *
 * @param impressionCount Number of times this Tweet has been viewed.
 * @param likeCount Number of times this Tweet has been liked.
 * @param replyCount Number of times this Tweet has been replied to.
 * @param retweetCount Number of times this Tweet has been Retweeted.
 */
@Serializable
data class TweetPromotedMetricsEntity (

    /* Number of times this Tweet has been viewed. */
    @SerialName(value = "impression_count")
    val impressionCount: kotlin.Int? = null,

    /* Number of times this Tweet has been liked. */
    @SerialName(value = "like_count")
    val likeCount: kotlin.Int? = null,

    /* Number of times this Tweet has been replied to. */
    @SerialName(value = "reply_count")
    val replyCount: kotlin.Int? = null,

    /* Number of times this Tweet has been Retweeted. */
    @SerialName(value = "retweet_count")
    val retweetCount: kotlin.Int? = null

)
