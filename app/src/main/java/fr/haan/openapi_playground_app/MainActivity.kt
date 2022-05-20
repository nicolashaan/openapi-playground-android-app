@file:OptIn(ExperimentalSerializationApi::class)

package fr.haan.openapi_playground_app

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import fr.haan.openapi_playground_app.data.api.UsersApi
import kotlinx.coroutines.launch
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {


    private val json = Json { isLenient = true; ignoreUnknownKeys = true }

    private val httpClient by lazy {
        OkHttpClient.Builder()
            .connectTimeout(10, TimeUnit.SECONDS)
            .readTimeout(10, TimeUnit.SECONDS)
            .writeTimeout(10, TimeUnit.SECONDS)
            .addInterceptor { chain ->

                return@addInterceptor chain.proceed(
                    chain.request().newBuilder()
                        .addHeader(
                            "Authorization",
                            "Bearer " + BuildConfig.TWITTER_BEARER
                        )
                        .build()
                )


            }
            .addInterceptor(HttpLoggingInterceptor())
            .build()
    }

    private val api by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.twitter.com")
            .client(httpClient)
            .addConverterFactory(
                json.asConverterFactory("application/json".toMediaType())
            )
            .build()
            .create(UsersApi::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        // Quick & Dirty minimal twitter API Usage!
        lifecycleScope.launch {
            val ret = api.findUserByUsername("nicodevpro")
            if (!ret.isSuccessful) {
                Log.e("TMP", "Error Code: ${ret.code()}")
                Log.e("TMP", "Error: ${ret.errorBody()?.string()}")
            }
            ret.body()?.data?.let { user ->
                val tv = findViewById<TextView>(R.id.text)
                tv.text = user.name
            }
        }


    }
}