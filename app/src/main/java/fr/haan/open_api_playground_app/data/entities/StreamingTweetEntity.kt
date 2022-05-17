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

import fr.haan.open_api_playground_app.data.entities.ExpansionsEntity
import fr.haan.open_api_playground_app.data.entities.ProblemEntity
import fr.haan.open_api_playground_app.data.entities.TweetEntity

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param `data` 
 * @param includes 
 * @param errors 
 */
@Serializable
data class StreamingTweetEntity (

    @SerialName(value = "data")
    val `data`: TweetEntity? = null,

    @SerialName(value = "includes")
    val includes: ExpansionsEntity? = null,

    @SerialName(value = "errors")
    val errors: kotlin.collections.List<ProblemEntity>? = null

)

