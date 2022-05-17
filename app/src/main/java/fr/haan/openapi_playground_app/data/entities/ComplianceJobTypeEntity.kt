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


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

/**
 * Type of compliance job to list.
 *
 * Values: tweets,users
 */
@Serializable
enum class ComplianceJobTypeEntity(val value: kotlin.String) {

    @SerialName(value = "tweets")
    tweets("tweets"),

    @SerialName(value = "users")
    users("users");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ComplianceJobTypeEntity) "$data" else null

        /**
         * Returns a valid [ComplianceJobTypeEntity] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ComplianceJobTypeEntity? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}
