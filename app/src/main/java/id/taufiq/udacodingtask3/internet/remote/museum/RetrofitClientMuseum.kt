package id.taufiq.udacodingtask3.internet.remote.museum

import id.taufiq.udacodingtask3.internet.response.batik.Batiks
import id.taufiq.udacodingtask3.internet.response.museum.Museum
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface RetrofitClientMuseum {
    @GET("CcariMuseum/searchGET")
    suspend fun getMuseum(@Query("nama") nama: String): Response<Museum>
}