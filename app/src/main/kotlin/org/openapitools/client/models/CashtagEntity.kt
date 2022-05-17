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

import org.openapitools.client.models.CashtagFields
import org.openapitools.client.models.EntityIndicesInclusiveExclusive

import com.squareup.moshi.Json

/**
 * 
 *
 * @param start Index (zero-based) at which position this entity starts.  The index is inclusive.
 * @param end Index (zero-based) at which position this entity ends.  The index is exclusive.
 * @param tag 
 */

data class CashtagEntity (

    /* Index (zero-based) at which position this entity starts.  The index is inclusive. */
    @Json(name = "start")
    val start: kotlin.Int,

    /* Index (zero-based) at which position this entity ends.  The index is exclusive. */
    @Json(name = "end")
    val end: kotlin.Int,

    @Json(name = "tag")
    val tag: kotlin.String

)

