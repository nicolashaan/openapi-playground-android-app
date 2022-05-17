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

import org.openapitools.client.models.Problem
import org.openapitools.client.models.UsersLikesCreateResponseData

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `data` 
 * @param errors 
 */

data class UsersLikesDeleteResponse (

    @Json(name = "data")
    val `data`: UsersLikesCreateResponseData? = null,

    @Json(name = "errors")
    val errors: kotlin.collections.List<Problem>? = null

)

