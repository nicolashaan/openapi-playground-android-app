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

package org.openapitools.client.models


import com.squareup.moshi.Json

/**
 * 
 *
 * @param type 
 * @param id Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers.
 */

data class TweetReferencedTweets (

    @Json(name = "type")
    val type: TweetReferencedTweets.Type,

    /* Unique identifier of this Tweet. This is returned as a string in order to avoid complications with languages and tools that cannot handle large integers. */
    @Json(name = "id")
    val id: kotlin.String

) {

    /**
     * 
     *
     * Values: retweeted,quoted,repliedTo
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "retweeted") retweeted("retweeted"),
        @Json(name = "quoted") quoted("quoted"),
        @Json(name = "replied_to") repliedTo("replied_to");
    }
}
