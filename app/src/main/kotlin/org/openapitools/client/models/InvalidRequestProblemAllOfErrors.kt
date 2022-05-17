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
 * @param parameters 
 * @param message 
 */

data class InvalidRequestProblemAllOfErrors (

    @Json(name = "parameters")
    val parameters: kotlin.collections.Map<kotlin.String, kotlin.collections.List<kotlin.String>>? = null,

    @Json(name = "message")
    val message: kotlin.String? = null

)
