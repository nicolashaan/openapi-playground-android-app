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

import fr.haan.openapi_playground_app.data.entities.FieldUnauthorizedProblemAllOfEntity
import fr.haan.openapi_playground_app.data.entities.ProblemEntity

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A problem that indicates that you are not allowed to see a particular field on a Tweet, User, etc.
 *
 * @param type 
 * @param title 
 * @param section 
 * @param resourceType 
 * @param `field` 
 * @param detail 
 * @param status 
 */
@Serializable
data class FieldUnauthorizedProblemEntity (

    @SerialName(value = "type")
    override val type: kotlin.String,

    @SerialName(value = "title")
    override val title: kotlin.String,

    @SerialName(value = "section")
    val section: FieldUnauthorizedProblemEntity.Section,

    @SerialName(value = "resource_type")
    val resourceType: FieldUnauthorizedProblemEntity.ResourceType,

    @SerialName(value = "field")
    val `field`: kotlin.String,

    @SerialName(value = "detail")
    override val detail: kotlin.String? = null,

    @SerialName(value = "status")
    override val status: kotlin.Int? = null

) : ProblemEntity {

    /**
     * 
     *
     * Values: `data`,includes
     */
    @Serializable
    enum class Section(val value: kotlin.String) {
        @SerialName(value = "data") `data`("data"),
        @SerialName(value = "includes") includes("includes");
    }
    /**
     * 
     *
     * Values: tweet,user,media,list,space
     */
    @Serializable
    enum class ResourceType(val value: kotlin.String) {
        @SerialName(value = "tweet") tweet("tweet"),
        @SerialName(value = "user") user("user"),
        @SerialName(value = "media") media("media"),
        @SerialName(value = "list") list("list"),
        @SerialName(value = "space") space("space");
    }
}

