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


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * Indicates withholding details for [withheld content](https://help.twitter.com/en/rules-and-policies/tweet-withheld-by-country).
 *
 * @param countryCodes Provides a list of countries where this content is not available.
 * @param scope Indicates that the content being withheld is a `user`.
 */
@Serializable
data class UserWithheldEntity (

    /* Provides a list of countries where this content is not available. */
    @SerialName(value = "country_codes")
    val countryCodes: kotlin.collections.List<kotlin.String>,

    /* Indicates that the content being withheld is a `user`. */
    @SerialName(value = "scope")
    val scope: UserWithheldEntity.Scope? = null

) {

    /**
     * Indicates that the content being withheld is a `user`.
     *
     * Values: user
     */
    @Serializable
    enum class Scope(val value: kotlin.String) {
        @SerialName(value = "user") user("user");
    }
}

