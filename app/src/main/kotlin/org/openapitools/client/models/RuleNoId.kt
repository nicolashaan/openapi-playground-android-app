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
 * A user-provided stream filtering rule.
 *
 * @param `value` The filterlang value of the rule.
 * @param tag A tag meant for the labeling of user provided rules.
 */

data class RuleNoId (

    /* The filterlang value of the rule. */
    @Json(name = "value")
    val `value`: kotlin.String,

    /* A tag meant for the labeling of user provided rules. */
    @Json(name = "tag")
    val tag: kotlin.String? = null

)
