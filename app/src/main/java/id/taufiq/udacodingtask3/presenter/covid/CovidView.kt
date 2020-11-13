package id.taufiq.udacodingtask3.presenter.covid

import id.taufiq.udacodingtask3.internet.response.covid.Data

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
interface CovidView {
    fun onSuccess(data: List<Data>)
    fun onFailure(message: String)
    fun hideProgress()
}