package id.taufiq.udacodingtask3.data.remote

import id.taufiq.udacodingtask3.data.response.batik.Batiks
import id.taufiq.udacodingtask3.data.response.batik.Hasil
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface RetrofitClient {
    @GET("batik/all")
    suspend fun getBatik(): Response<Batiks>
}