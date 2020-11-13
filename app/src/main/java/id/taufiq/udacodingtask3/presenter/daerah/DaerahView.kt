package id.taufiq.udacodingtask3.presenter.daerah

import id.taufiq.udacodingtask3.internet.response.daerah.Provinsi
import id.taufiq.udacodingtask3.internet.response.museum.Data

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface DaerahView {
    fun onSuccess(data: List<Provinsi>)
    fun onFailure(message: String)
    fun hideProgress()
}