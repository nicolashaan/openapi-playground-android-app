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

import fr.haan.open_api_playground_app.data.entities.CashtagEntity
import fr.haan.open_api_playground_app.data.entities.HashtagEntity
import fr.haan.open_api_playground_app.data.entities.MentionEntity
import fr.haan.open_api_playground_app.data.entities.UrlEntity

import com.squareup.moshi.Json

/**
 * 
 *
 * @param urls 
 * @param hashtags 
 * @param mentions 
 * @param cashtags 
 */

data class FullTextEntities (

    @Json(name = "urls")
    val urls: kotlin.collections.List<UrlEntity>? = null,

    @Json(name = "hashtags")
    val hashtags: kotlin.collections.List<HashtagEntity>? = null,

    @Json(name = "mentions")
    val mentions: kotlin.collections.List<MentionEntity>? = null,

    @Json(name = "cashtags")
    val cashtags: kotlin.collections.List<CashtagEntity>? = null

)
