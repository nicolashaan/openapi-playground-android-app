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

package fr.haan.openapi_playground_app.data.entities


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Represent a boundary range (start and end index) for a recognized entity (for example a hashtag or a mention). `start` must be smaller than `end`.  The start index is inclusive, the end index is inclusive.
 *
 * @param start Index (zero-based) at which position this entity starts.  The index is inclusive.
 * @param end Index (zero-based) at which position this entity ends.  The index is inclusive.
 */
@Serializable
data class EntityIndicesInclusiveInclusiveEntity (

    /* Index (zero-based) at which position this entity starts.  The index is inclusive. */
    @SerialName(value = "start")
    val start: kotlin.Int,

    /* Index (zero-based) at which position this entity ends.  The index is inclusive. */
    @SerialName(value = "end")
    val end: kotlin.Int

)
