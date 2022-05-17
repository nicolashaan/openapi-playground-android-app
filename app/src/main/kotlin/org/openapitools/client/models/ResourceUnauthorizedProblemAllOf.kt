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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param `value` 
 * @param parameter 
 * @param section 
 * @param resourceId 
 * @param resourceType 
 */

data class ResourceUnauthorizedProblemAllOf (

    @Json(name = "value")
    val `value`: kotlin.String,

    @Json(name = "parameter")
    val parameter: kotlin.String,

    @Json(name = "section")
    val section: ResourceUnauthorizedProblemAllOf.Section,

    @Json(name = "resource_id")
    val resourceId: kotlin.String,

    @Json(name = "resource_type")
    val resourceType: ResourceUnauthorizedProblemAllOf.ResourceType

) {

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
