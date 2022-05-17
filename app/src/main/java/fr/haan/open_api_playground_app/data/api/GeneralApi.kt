package fr.haan.open_api_playground_app.data.api

import org.openapitools.client.infrastructure.CollectionFormats.*
import retrofit2.http.*
import retrofit2.Response
import okhttp3.RequestBody


interface GeneralApi {
    /**
     * Returns the open api spec document.
     * Full open api spec in JSON format. (See https://github.com/OAI/OpenAPI-Specification/blob/master/README.md)
     * Responses:
     *  - 200: The request was successful
     *
     * @return [kotlin.Any]
     */
    @GET("2/openapi.json")
    suspend fun getOpenApiSpec(): Response<kotlin.Any>

}
