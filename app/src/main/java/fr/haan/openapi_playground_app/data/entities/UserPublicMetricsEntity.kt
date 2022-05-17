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
 * A list of metrics for this user
 *
 * @param followersCount Number of users who are following this user.
 * @param followingCount Number of users this user is following.
 * @param tweetCount The number of Tweets (including Retweets) posted by this user.
 * @param listedCount The number of lists that include this user.
 */
@Serializable
data class UserPublicMetricsEntity (

    /* Number of users who are following this user. */
    @SerialName(value = "followers_count")
    val followersCount: kotlin.Int,

    /* Number of users this user is following. */
    @SerialName(value = "following_count")
    val followingCount: kotlin.Int,

    /* The number of Tweets (including Retweets) posted by this user. */
    @SerialName(value = "tweet_count")
    val tweetCount: kotlin.Int,

    /* The number of lists that include this user. */
    @SerialName(value = "listed_count")
    val listedCount: kotlin.Int

)
