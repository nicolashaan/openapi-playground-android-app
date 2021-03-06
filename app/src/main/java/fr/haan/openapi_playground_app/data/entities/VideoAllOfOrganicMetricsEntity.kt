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
 * Organic nonpublic engagement metrics for the Media at the time of the request.
 *
 * @param playback0Count Number of users who made it through 0% of the video.
 * @param playback25Count Number of users who made it through 25% of the video.
 * @param playback50Count Number of users who made it through 50% of the video.
 * @param playback75Count Number of users who made it through 75% of the video.
 * @param playback100Count Number of users who made it through 100% of the video.
 * @param viewCount Number of times this video has been viewed.
 */
@Serializable
data class VideoAllOfOrganicMetricsEntity (

    /* Number of users who made it through 0% of the video. */
    @SerialName(value = "playback_0_count")
    val playback0Count: kotlin.Int? = null,

    /* Number of users who made it through 25% of the video. */
    @SerialName(value = "playback_25_count")
    val playback25Count: kotlin.Int? = null,

    /* Number of users who made it through 50% of the video. */
    @SerialName(value = "playback_50_count")
    val playback50Count: kotlin.Int? = null,

    /* Number of users who made it through 75% of the video. */
    @SerialName(value = "playback_75_count")
    val playback75Count: kotlin.Int? = null,

    /* Number of users who made it through 100% of the video. */
    @SerialName(value = "playback_100_count")
    val playback100Count: kotlin.Int? = null,

    /* Number of times this video has been viewed. */
    @SerialName(value = "view_count")
    val viewCount: kotlin.Int? = null

)

