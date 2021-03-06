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

import fr.haan.openapi_playground_app.data.entities.RuleNoIdEntity

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A request to add a user-specified stream filtering rule.
 *
 * @param add 
 */
@Serializable
data class AddRulesRequestEntity (

    @SerialName(value = "add")
    val add: kotlin.collections.List<RuleNoIdEntity>

)

