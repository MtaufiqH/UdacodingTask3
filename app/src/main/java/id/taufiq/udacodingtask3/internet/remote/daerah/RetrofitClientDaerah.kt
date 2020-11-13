package id.taufiq.udacodingtask3.internet.remote.daerah

import id.taufiq.udacodingtask3.internet.response.batik.Batiks
import id.taufiq.udacodingtask3.internet.response.daerah.Daerah
import id.taufiq.udacodingtask3.internet.response.museum.Museum
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface RetrofitClientDaerah {
    @GET("api/daerahindonesia/provinsi")
    suspend fun getDaerah(): Response<Daerah>
}