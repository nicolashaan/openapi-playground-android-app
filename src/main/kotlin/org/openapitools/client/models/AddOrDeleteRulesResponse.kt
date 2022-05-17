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
import org.openapitools.client.models.Rule
import org.openapitools.client.models.RulesResponseMetadata

import com.squareup.moshi.Json

/**
 * A response from modifying user-specified stream filtering rules.
 *
 * @param meta 
 * @param `data` All user-specified stream filtering rules that were created.
 * @param errors 
 */

data class AddOrDeleteRulesResponse (

    @Json(name = "meta")
    val meta: RulesResponseMetadata,

    /* All user-specified stream filtering rules that were created. */
    @Json(name = "data")
    val `data`: kotlin.collections.List<Rule>? = null,

    @Json(name = "errors")
    val errors: kotlin.collections.List<Problem>? = null

)

