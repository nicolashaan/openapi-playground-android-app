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

import fr.haan.open_api_playground_app.data.entities.OperationalDisconnectProblemAllOfEntity
import fr.haan.open_api_playground_app.data.entities.ProblemEntity

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * You have been disconnected for operational reasons.
 *
 * @param type 
 * @param title 
 * @param detail 
 * @param status 
 * @param disconnectType 
 */
@Serializable
data class OperationalDisconnectProblemEntity (

    @SerialName(value = "type")
    override val type: kotlin.String,

    @SerialName(value = "title")
    override val title: kotlin.String,

    @SerialName(value = "detail")
    override val detail: kotlin.String? = null,

    @SerialName(value = "status")
    override val status: kotlin.Int? = null,

    @SerialName(value = "disconnect_type")
    val disconnectType: OperationalDisconnectProblemEntity.DisconnectType? = null

) : ProblemEntity() {

    /**
     * 
     *
     * Values: operationalDisconnect,upstreamOperationalDisconnect,forceDisconnect,upstreamUncleanDisconnect,slowReader,internalError,clientApplicationStateDegraded,invalidRules
     */
    @Serializable
    enum class DisconnectType(val value: kotlin.String) {
        @SerialName(value = "OperationalDisconnect") operationalDisconnect("OperationalDisconnect"),
        @SerialName(value = "UpstreamOperationalDisconnect") upstreamOperationalDisconnect("UpstreamOperationalDisconnect"),
        @SerialName(value = "ForceDisconnect") forceDisconnect("ForceDisconnect"),
        @SerialName(value = "UpstreamUncleanDisconnect") upstreamUncleanDisconnect("UpstreamUncleanDisconnect"),
        @SerialName(value = "SlowReader") slowReader("SlowReader"),
        @SerialName(value = "InternalError") internalError("InternalError"),
        @SerialName(value = "ClientApplicationStateDegraded") clientApplicationStateDegraded("ClientApplicationStateDegraded"),
        @SerialName(value = "InvalidRules") invalidRules("InvalidRules");
    }
}
