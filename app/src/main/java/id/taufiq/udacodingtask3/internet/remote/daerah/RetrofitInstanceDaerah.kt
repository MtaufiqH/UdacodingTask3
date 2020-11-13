package id.taufiq.udacodingtask3.internet.remote.daerah

import id.taufiq.udacodingtask3.internet.remote.URL
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class RetrofitInstanceDaerah {

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
                .baseUrl(URL.DAERAH_URL)
                .build()
        }

        fun buildApiService(): RetrofitClientDaerah =
            buildRetrofit().create(RetrofitClientDaerah::class.java)

    }
}