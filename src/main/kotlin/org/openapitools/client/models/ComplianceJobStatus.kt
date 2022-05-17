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
 * Status of a compliance job
 *
 * Values: created,inProgress,failed,complete
 */

enum class ComplianceJobStatus(val value: kotlin.String) {

    @Json(name = "created")
    created("created"),

    @Json(name = "in_progress")
    inProgress("in_progress"),

    @Json(name = "failed")
    failed("failed"),

    @Json(name = "complete")
    complete("complete");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ComplianceJobStatus) "$data" else null

        /**
         * Returns a valid [ComplianceJobStatus] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ComplianceJobStatus? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

