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

import fr.haan.open_api_playground_app.data.entities.Point

import com.squareup.moshi.Json

/**
 * 
 *
 * @param type 
 * @param bbox 
 * @param properties 
 * @param geometry 
 */

data class Geo (

    @Json(name = "type")
    val type: Geo.Type,

    @Json(name = "bbox")
    val bbox: kotlin.collections.List<kotlin.Double>,

    @Json(name = "properties")
    val properties: kotlin.Any,

    @Json(name = "geometry")
    val geometry: Point? = null

) {

    /**
     * 
     *
     * Values: feature
     */
    enum class Type(val value: kotlin.String) {
        @Json(name = "Feature") feature("Feature");
    }
}
