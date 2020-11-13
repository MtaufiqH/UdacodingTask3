package id.taufiq.udacodingtask3.presenter.batik

import id.taufiq.udacodingtask3.internet.response.batik.Hasil

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface BatikView {
    fun onSuccess(data: List<Hasil>)
    fun onFailure(message: String)
    fun hideProgress()
}