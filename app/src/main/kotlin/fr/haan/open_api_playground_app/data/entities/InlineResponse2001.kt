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

import fr.haan.open_api_playground_app.data.entities.Rule
import fr.haan.open_api_playground_app.data.entities.RulesResponseMetadata

import com.squareup.moshi.Json

/**
 * 
 *
 * @param `data` 
 * @param meta 
 */

data class InlineResponse2001 (

    @Json(name = "data")
    val `data`: kotlin.collections.List<Rule>,

    @Json(name = "meta")
    val meta: RulesResponseMetadata

)
