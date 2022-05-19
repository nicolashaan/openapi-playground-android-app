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

import fr.haan.openapi_playground_app.data.entities.DuplicateRuleProblemAllOfEntity
import fr.haan.openapi_playground_app.data.entities.ProblemEntity

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The rule you have submitted is a duplicate.
 *
 * @param type 
 * @param title 
 * @param detail 
 * @param status 
 * @param `value` 
 * @param id 
 */
@Serializable
data class DuplicateRuleProblemEntity (

    @SerialName(value = "type")
    override val type: kotlin.String,

    @SerialName(value = "title")
    override val title: kotlin.String,

    @SerialName(value = "detail")
    override val detail: kotlin.String? = null,

    @SerialName(value = "status")
    override val status: kotlin.Int? = null,

    @SerialName(value = "value")
    val `value`: kotlin.String? = null,

    @SerialName(value = "id")
    val id: kotlin.String? = null

) : ProblemEntity

