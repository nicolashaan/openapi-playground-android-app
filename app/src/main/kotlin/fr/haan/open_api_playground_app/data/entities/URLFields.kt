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

import fr.haan.open_api_playground_app.data.entities.URLImage

import com.squareup.moshi.Json

/**
 * Represent the portion of text recognized as a URL.
 *
 * @param url A validly formatted URL.
 * @param expandedUrl A validly formatted URL.
 * @param displayUrl The URL as displayed in the Twitter client.
 * @param unwoundUrl Fully resolved url
 * @param status HTTP Status Code.
 * @param title Title of the page the URL points to.
 * @param description Description of the URL landing page.
 * @param images 
 * @param mediaKey The Media Key identifier for this attachment.
 */

data class URLFields (

    /* A validly formatted URL. */
    @Json(name = "url")
    val url: java.net.URI,

    /* A validly formatted URL. */
    @Json(name = "expanded_url")
    val expandedUrl: java.net.URI? = null,

    /* The URL as displayed in the Twitter client. */
    @Json(name = "display_url")
    val displayUrl: kotlin.String? = null,

    /* Fully resolved url */
    @Json(name = "unwound_url")
    val unwoundUrl: java.net.URI? = null,

    /* HTTP Status Code. */
    @Json(name = "status")
    val status: kotlin.Int? = null,

    /* Title of the page the URL points to. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* Description of the URL landing page. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    @Json(name = "images")
    val images: kotlin.collections.List<URLImage>? = null,

    /* The Media Key identifier for this attachment. */
    @Json(name = "media_key")
    val mediaKey: kotlin.String? = null

)
