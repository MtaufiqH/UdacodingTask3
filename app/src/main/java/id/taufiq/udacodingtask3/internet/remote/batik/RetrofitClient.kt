package id.taufiq.udacodingtask3.internet.remote.batik

import id.taufiq.udacodingtask3.internet.response.batik.Batiks
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