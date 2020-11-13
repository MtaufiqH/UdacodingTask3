package id.taufiq.udacodingtask3.presenter.museum

import id.taufiq.udacodingtask3.internet.response.museum.Data

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface MuseumView {
    fun onSuccess(data: List<Data>)
    fun onFailure(message: String)
    fun hideProgress()
}