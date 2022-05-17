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

package fr.haan.open_api_playground_app.data.entities

import fr.haan.open_api_playground_app.data.entities.Problem

import com.squareup.moshi.Json

/**
 * A problem that indicates that the authentication used is not supported.
 *
 * @param type 
 * @param title 
 * @param detail 
 * @param status 
 */

data class UnsupportedAuthenticationProblem (

    @Json(name = "type")
    override val type: kotlin.String,

    @Json(name = "title")
    override val title: kotlin.String,

    @Json(name = "detail")
    override val detail: kotlin.String? = null,

    @Json(name = "status")
    override val status: kotlin.Int? = null

) : Problem()
