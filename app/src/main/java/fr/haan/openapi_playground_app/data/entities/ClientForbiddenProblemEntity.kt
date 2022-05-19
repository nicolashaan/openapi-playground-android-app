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

import fr.haan.openapi_playground_app.data.entities.ClientForbiddenProblemAllOfEntity
import fr.haan.openapi_playground_app.data.entities.ProblemEntity

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * A problem that indicates your client is forbidden from making this request.
 *
 * @param type 
 * @param title 
 * @param detail 
 * @param status 
 * @param reason 
 * @param registrationUrl 
 */
@Serializable
data class ClientForbiddenProblemEntity (

    @SerialName(value = "type")
    override val type: kotlin.String,

    @SerialName(value = "title")
    override val title: kotlin.String,

    @SerialName(value = "detail")
    override val detail: kotlin.String? = null,

    @SerialName(value = "status")
    override val status: kotlin.Int? = null,

    @SerialName(value = "reason")
    val reason: ClientForbiddenProblemEntity.Reason? = null,

    @Contextual @SerialName(value = "registration_url")
    val registrationUrl: java.net.URI? = null

) : ProblemEntity {

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

