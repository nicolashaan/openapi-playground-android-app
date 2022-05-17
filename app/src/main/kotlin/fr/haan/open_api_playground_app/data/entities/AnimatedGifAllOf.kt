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

import fr.haan.open_api_playground_app.data.entities.VideoAllOfVariants

import com.squareup.moshi.Json

/**
 * 
 *
 * @param previewImageUrl 
 * @param variants An array of all available variants of the media
 */

data class AnimatedGifAllOf (

    @Json(name = "preview_image_url")
    val previewImageUrl: java.net.URI? = null,

    /* An array of all available variants of the media */
    @Json(name = "variants")
    val variants: kotlin.collections.List<VideoAllOfVariants>? = null

)
