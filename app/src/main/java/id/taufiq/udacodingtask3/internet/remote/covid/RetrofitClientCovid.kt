package id.taufiq.udacodingtask3.internet.remote.covid

import id.taufiq.udacodingtask3.internet.response.covid.Covid
import retrofit2.Response
import retrofit2.http.GET

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface RetrofitClientCovid {
    @GET("public/api/prov.json")
    suspend fun getDataCorona(): Response<Covid>
}