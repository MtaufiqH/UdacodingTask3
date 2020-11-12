package id.taufiq.udacodingtask3.presenter

import id.taufiq.udacodingtask3.data.response.batik.Batiks
import id.taufiq.udacodingtask3.data.response.batik.Hasil

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface BatikView {
    fun onSuccess(data: List<Hasil>)
    fun onFailure(message: String)
    fun hideProgress()
}