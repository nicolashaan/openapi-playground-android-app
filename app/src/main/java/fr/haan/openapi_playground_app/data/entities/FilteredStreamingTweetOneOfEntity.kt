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

import fr.haan.openapi_playground_app.data.entities.ExpansionsEntity
import fr.haan.openapi_playground_app.data.entities.FilteredStreamingTweetOneOfMatchingRulesEntity
import fr.haan.openapi_playground_app.data.entities.TweetEntity

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * The values returned with a successful streamed tweet. Includes the user provided rules that the tweet matched.
 *
 * @param `data` 
 * @param matchingRules The list of rules which matched the tweet
 * @param includes 
 */
@Serializable
data class FilteredStreamingTweetOneOfEntity (

    @SerialName(value = "data")
    val `data`: TweetEntity,

    /* The list of rules which matched the tweet */
    @SerialName(value = "matching_rules")
    val matchingRules: kotlin.collections.List<FilteredStreamingTweetOneOfMatchingRulesEntity>,

    @SerialName(value = "includes")
    val includes: ExpansionsEntity? = null

)

