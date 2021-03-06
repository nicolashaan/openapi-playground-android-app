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
 * 
 *
 * @param reason 
 * @param registrationUrl 
 */
@Serializable
data class ClientForbiddenProblemAllOfEntity (

    @SerialName(value = "reason")
    val reason: ClientForbiddenProblemAllOfEntity.Reason? = null,

    @Contextual @SerialName(value = "registration_url")
    val registrationUrl: java.net.URI? = null

) {

    /**
     * 
     *
     * Values: officialMinusClientMinusForbidden,clientMinusNotMinusEnrolled
     */
    @Serializable
    enum class Reason(val value: kotlin.String) {
        @SerialName(value = "official-client-forbidden") officialMinusClientMinusForbidden("official-client-forbidden"),
        @SerialName(value = "client-not-enrolled") clientMinusNotMinusEnrolled("client-not-enrolled");
    }
}

