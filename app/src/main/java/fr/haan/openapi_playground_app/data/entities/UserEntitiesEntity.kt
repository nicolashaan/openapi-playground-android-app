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

import fr.haan.openapi_playground_app.data.entities.FullTextEntitiesEntity
import fr.haan.openapi_playground_app.data.entities.UserEntitiesUrlEntity

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A list of metadata found in the user's profile description.
 *
 * @param url 
 * @param description 
 */
@Serializable
data class UserEntitiesEntity (

    @SerialName(value = "url")
    val url: UserEntitiesUrlEntity? = null,

    @SerialName(value = "description")
    val description: FullTextEntitiesEntity? = null

)

