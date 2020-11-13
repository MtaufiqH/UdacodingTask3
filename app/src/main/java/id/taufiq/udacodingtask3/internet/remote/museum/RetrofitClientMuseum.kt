package id.taufiq.udacodingtask3.internet.remote.museum

import id.taufiq.udacodingtask3.internet.response.museum.Museum
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface RetrofitClientMuseum {
    @GET("CcariMuseum/searchGET?nama=museum")
    suspend fun getMuseum(): Response<Museum>
}