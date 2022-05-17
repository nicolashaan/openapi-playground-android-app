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

import org.openapitools.client.models.VideoAllOfNonPublicMetrics
import org.openapitools.client.models.VideoAllOfOrganicMetrics
import org.openapitools.client.models.VideoAllOfPromotedMetrics
import org.openapitools.client.models.VideoAllOfPublicMetrics
import org.openapitools.client.models.VideoAllOfVariants

import com.squareup.moshi.Json

/**
 * 
 *
 * @param previewImageUrl 
 * @param durationMs 
 * @param variants An array of all available variants of the media
 * @param publicMetrics 
 * @param nonPublicMetrics 
 * @param organicMetrics 
 * @param promotedMetrics 
 */

data class VideoAllOf (

    @Json(name = "preview_image_url")
    val previewImageUrl: java.net.URI? = null,

    @Json(name = "duration_ms")
    val durationMs: kotlin.Int? = null,

    /* An array of all available variants of the media */
    @Json(name = "variants")
    val variants: kotlin.collections.List<VideoAllOfVariants>? = null,

    @Json(name = "public_metrics")
    val publicMetrics: VideoAllOfPublicMetrics? = null,

    @Json(name = "non_public_metrics")
    val nonPublicMetrics: VideoAllOfNonPublicMetrics? = null,

    @Json(name = "organic_metrics")
    val organicMetrics: VideoAllOfOrganicMetrics? = null,

    @Json(name = "promoted_metrics")
    val promotedMetrics: VideoAllOfPromotedMetrics? = null

)

