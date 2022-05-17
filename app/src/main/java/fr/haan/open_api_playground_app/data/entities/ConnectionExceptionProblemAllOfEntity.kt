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


import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
import kotlinx.serialization.Contextual

/**
 * 
 *
 * @param connectionIssue 
 */
@Serializable
data class ConnectionExceptionProblemAllOfEntity (

    @SerialName(value = "connection_issue")
    val connectionIssue: ConnectionExceptionProblemAllOfEntity.ConnectionIssue? = null

) {

    /**
     * 
     *
     * Values: tooManyConnections,provisioningSubscription,ruleConfigurationIssue,rulesInvalidIssue
     */
    @Serializable
    enum class ConnectionIssue(val value: kotlin.String) {
        @SerialName(value = "TooManyConnections") tooManyConnections("TooManyConnections"),
        @SerialName(value = "ProvisioningSubscription") provisioningSubscription("ProvisioningSubscription"),
        @SerialName(value = "RuleConfigurationIssue") ruleConfigurationIssue("RuleConfigurationIssue"),
        @SerialName(value = "RulesInvalidIssue") rulesInvalidIssue("RulesInvalidIssue");
    }
}

