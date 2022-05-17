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

import org.openapitools.client.models.Problem
import org.openapitools.client.models.ResourceUnauthorizedProblemAllOf

import com.squareup.moshi.Json

/**
 * A problem that indicates you are not allowed to see a particular Tweet, User, etc.
 *
 * @param type 
 * @param title 
 * @param `value` 
 * @param parameter 
 * @param section 
 * @param resourceId 
 * @param resourceType 
 * @param detail 
 * @param status 
 */

data class ResourceUnauthorizedProblem (

    @Json(name = "type")
    override val type: kotlin.String,

    @Json(name = "title")
    override val title: kotlin.String,

    @Json(name = "value")
    val `value`: kotlin.String,

    @Json(name = "parameter")
    val parameter: kotlin.String,

    @Json(name = "section")
    val section: ResourceUnauthorizedProblem.Section,

    @Json(name = "resource_id")
    val resourceId: kotlin.String,

    @Json(name = "resource_type")
    val resourceType: ResourceUnauthorizedProblem.ResourceType,

    @Json(name = "detail")
    override val detail: kotlin.String? = null,

    @Json(name = "status")
    override val status: kotlin.Int? = null

) : Problem() {

    /**
     * 
     *
     * Values: `data`,includes
     */
    enum class Section(val value: kotlin.String) {
        @Json(name = "data") `data`("data"),
        @Json(name = "includes") includes("includes");
    }
    /**
     * 
     *
     * Values: tweet,user,media,list,space
     */
    enum class ResourceType(val value: kotlin.String) {
        @Json(name = "tweet") tweet("tweet"),
        @Json(name = "user") user("user"),
        @Json(name = "media") media("media"),
        @Json(name = "list") list("list"),
        @Json(name = "space") space("space");
    }
}

