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
 * @param parameter 
 * @param resourceId 
 * @param resourceType 
 */

data class ResourceUnavailableProblemAllOf (

    @Json(name = "parameter")
    val parameter: kotlin.String,

    @Json(name = "resource_id")
    val resourceId: kotlin.String,

    @Json(name = "resource_type")
    val resourceType: ResourceUnavailableProblemAllOf.ResourceType

) {

    /**
     * 
     *
     * Values: user,tweet,media,list,space
     */
    enum class ResourceType(val value: kotlin.String) {
        @Json(name = "user") user("user"),
        @Json(name = "tweet") tweet("tweet"),
        @Json(name = "media") media("media"),
        @Json(name = "list") list("list"),
        @Json(name = "space") space("space");
    }
}
