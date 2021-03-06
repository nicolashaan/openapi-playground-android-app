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

import fr.haan.openapi_playground_app.data.entities.ComplianceJobStatusEntity
import fr.haan.openapi_playground_app.data.entities.ComplianceJobTypeEntity

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param id Compliance Job ID
 * @param type 
 * @param createdAt Creation time of the compliance job.
 * @param uploadUrl URL to which the user will upload their tweet or user IDs
 * @param uploadExpiresAt Expiration time of the upload URL
 * @param downloadUrl URL from which the user will retrieve their compliance results
 * @param downloadExpiresAt Expiration time of the download URL
 * @param status 
 * @param name User-provided name for a compliance job
 */
@Serializable
data class ComplianceJobEntity (

    /* Compliance Job ID */
    @SerialName(value = "id")
    val id: kotlin.String,

    @Contextual @SerialName(value = "type")
    val type: ComplianceJobTypeEntity,

    /* Creation time of the compliance job. */
    @Contextual @SerialName(value = "created_at")
    val createdAt: java.time.OffsetDateTime,

    /* URL to which the user will upload their tweet or user IDs */
    @Contextual @SerialName(value = "upload_url")
    val uploadUrl: java.net.URI,

    /* Expiration time of the upload URL */
    @Contextual @SerialName(value = "upload_expires_at")
    val uploadExpiresAt: java.time.OffsetDateTime,

    /* URL from which the user will retrieve their compliance results */
    @Contextual @SerialName(value = "download_url")
    val downloadUrl: java.net.URI,

    /* Expiration time of the download URL */
    @Contextual @SerialName(value = "download_expires_at")
    val downloadExpiresAt: java.time.OffsetDateTime,

    @Contextual @SerialName(value = "status")
    val status: ComplianceJobStatusEntity,

    /* User-provided name for a compliance job */
    @SerialName(value = "name")
    val name: kotlin.String? = null

)

