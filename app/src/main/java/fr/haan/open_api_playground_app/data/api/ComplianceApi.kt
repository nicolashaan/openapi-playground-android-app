package fr.haan.open_api_playground_app.data.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody

import fr.haan.open_api_playground_app.data.entities.ComplianceJobStatusEntity
import fr.haan.open_api_playground_app.data.entities.ComplianceJobTypeEntity
import fr.haan.open_api_playground_app.data.entities.ErrorEntity
import fr.haan.open_api_playground_app.data.entities.InlineObject5Entity
import fr.haan.open_api_playground_app.data.entities.MultiComplianceJobResponseEntity
import fr.haan.open_api_playground_app.data.entities.ProblemEntity
import fr.haan.open_api_playground_app.data.entities.SingleComplianceJobResponseEntity

interface ComplianceApi {
    /**
     * Create compliance job
     * Creates a compliance for the given job type
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param inlineObject5Entity  
     * @return [SingleComplianceJobResponseEntity]
     */
    @POST("2/compliance/jobs")
    suspend fun createBatchComplianceJob(@Body inlineObject5Entity: InlineObject5Entity): Response<SingleComplianceJobResponseEntity>

    /**
     * Get compliance job
     * Returns a single compliance job by ID
     * Responses:
     *  - 200: The request was successful
     *  - 0: The request has failed.
     *
     * @param id ID of the compliance job to retrieve. 
     * @return [SingleComplianceJobResponseEntity]
     */
    @GET("2/compliance/jobs/{id}")
    suspend fun getBatchComplianceJob(@Path("id") id: kotlin.String): Response<SingleComplianceJobResponseEntity>

    /**
     * List compliance jobs
     * Returns recent compliance jobs for a given job type and optional job status
     * Responses:
     *  - 200: List compliance jobs response
     *  - 0: The request has failed.
     *
     * @param type Type of compliance job to list. 
     * @param status Status of compliance job to list. (optional)
     * @return [MultiComplianceJobResponseEntity]
     */
    @GET("2/compliance/jobs")
    suspend fun listBatchComplianceJobs(@Query("type") type: ComplianceJobTypeEntity, @Query("status") status: ComplianceJobStatusEntity? = null): Response<MultiComplianceJobResponseEntity>

}
