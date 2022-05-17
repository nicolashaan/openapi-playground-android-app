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
 * @param id Unique identifier of this rule.
 * @param tag The user-supplied tag assigned to the rule which matched
 */

data class FilteredStreamingTweetOneOfMatchingRules (

    /* Unique identifier of this rule. */
    @Json(name = "id")
    val id: kotlin.String,

    /* The user-supplied tag assigned to the rule which matched */
    @Json(name = "tag")
    val tag: kotlin.String? = null

)

