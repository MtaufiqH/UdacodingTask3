package id.taufiq.udacodingtask3.internet.remote.museum

import id.taufiq.udacodingtask3.internet.remote.URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class RetrofitInstanceMuseum {

    companion object {
        private val interceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)

        private fun buildClient(): OkHttpClient =
            OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build()

        private fun buildRetrofit(): Retrofit {
            return Retrofit.Builder()
                .client(buildClient())
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(URL.MUSEUM_URL)
                .build()
        }

        fun buildApiService(): RetrofitClientMuseum =
            buildRetrofit().create(RetrofitClientMuseum::class.java)

    }
}