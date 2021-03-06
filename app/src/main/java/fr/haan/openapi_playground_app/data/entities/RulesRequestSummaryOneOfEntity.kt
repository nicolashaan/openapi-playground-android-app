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
 * A summary of the results of the addition of user-specified stream filtering rules.
 *
 * @param created Number of user-specified stream filtering rules that were created.
 * @param notCreated Number of user-specified stream filtering rules that were not created.
 * @param valid Number of valid user-specified stream filtering rules.
 * @param invalid Number of invalid user-specified stream filtering rules.
 */
@Serializable
data class RulesRequestSummaryOneOfEntity (

    /* Number of user-specified stream filtering rules that were created. */
    @SerialName(value = "created")
    val created: kotlin.Int,

    /* Number of user-specified stream filtering rules that were not created. */
    @SerialName(value = "not_created")
    val notCreated: kotlin.Int,

    /* Number of valid user-specified stream filtering rules. */
    @SerialName(value = "valid")
    val valid: kotlin.Int,

    /* Number of invalid user-specified stream filtering rules. */
    @SerialName(value = "invalid")
    val invalid: kotlin.Int

)

