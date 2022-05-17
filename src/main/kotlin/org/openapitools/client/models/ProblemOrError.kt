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

import org.openapitools.client.models.Error
import org.openapitools.client.models.Problem

import com.squareup.moshi.Json

/**
 * Represents the response in case of throwing an exception. Mainly for the openapi-generator
 *
 * @param code 
 * @param message 
 * @param type 
 * @param title 
 * @param detail 
 * @param status 
 */

data class ProblemOrError (

    @Json(name = "code")
    val code: kotlin.Int,

    @Json(name = "message")
    val message: kotlin.String,

    @Json(name = "type")
    override val type: kotlin.String,

    @Json(name = "title")
    override val title: kotlin.String,

    @Json(name = "detail")
    override val detail: kotlin.String? = null,

    @Json(name = "status")
    override val status: kotlin.Int? = null

)

