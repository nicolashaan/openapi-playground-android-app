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
 * Shows who can reply a Tweet. Fields returned are everyone, mentioned_users, and following.
 *
 * Values: everyone,mentionedUsers,following,other
 */

enum class ReplySettings(val value: kotlin.String) {

    @Json(name = "everyone")
    everyone("everyone"),

    @Json(name = "mentionedUsers")
    mentionedUsers("mentionedUsers"),

    @Json(name = "following")
    following("following"),

    @Json(name = "other")
    other("other");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ReplySettings) "$data" else null

        /**
         * Returns a valid [ReplySettings] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ReplySettings? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

