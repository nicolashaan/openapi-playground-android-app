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
 * @param previousToken The previous token
 * @param nextToken The next token
 * @param resultCount The number of user results returned in this response
 */

data class GenericMultipleUsersLookupResponseMeta (

    /* The previous token */
    @Json(name = "previous_token")
    val previousToken: kotlin.String? = null,

    /* The next token */
    @Json(name = "next_token")
    val nextToken: kotlin.String? = null,

    /* The number of user results returned in this response */
    @Json(name = "result_count")
    val resultCount: kotlin.Int? = null

)

