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
 * IDs and values of all deleted user-specified stream filtering rules.
 *
 * @param ids IDs of all deleted user-specified stream filtering rules.
 * @param propertyValues Values of all deleted user-specified stream filtering rules.
 */

data class DeleteRulesRequestDelete (

    /* IDs of all deleted user-specified stream filtering rules. */
    @Json(name = "ids")
    val ids: kotlin.collections.List<kotlin.String>? = null,

    /* Values of all deleted user-specified stream filtering rules. */
    @Json(name = "values")
    val propertyValues: kotlin.collections.List<kotlin.String>? = null

)

