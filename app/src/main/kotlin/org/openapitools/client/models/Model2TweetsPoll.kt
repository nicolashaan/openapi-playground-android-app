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
 * Poll options for a Tweet with a poll. This is mutually exclusive from Media and Quote Tweet Id.
 *
 * @param options 
 * @param durationMinutes Duration of the poll in minutes.
 */

data class Model2TweetsPoll (

    @Json(name = "options")
    val options: kotlin.collections.List<kotlin.String>? = null,

    /* Duration of the poll in minutes. */
    @Json(name = "duration_minutes")
    val durationMinutes: kotlin.Int? = null

)
