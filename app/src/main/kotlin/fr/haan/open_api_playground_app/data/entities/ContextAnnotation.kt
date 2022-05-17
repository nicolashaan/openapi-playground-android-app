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

import fr.haan.open_api_playground_app.data.entities.ContextAnnotationDomainFields
import fr.haan.open_api_playground_app.data.entities.ContextAnnotationEntityFields

import com.squareup.moshi.Json

/**
 * Annotation inferred from the tweet text.
 *
 * @param domain 
 * @param entity 
 */

data class ContextAnnotation (

    @Json(name = "domain")
    val domain: ContextAnnotationDomainFields,

    @Json(name = "entity")
    val entity: ContextAnnotationEntityFields

)
