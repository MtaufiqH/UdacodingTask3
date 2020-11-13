package id.taufiq.udacodingtask3.presenter.covid

import id.taufiq.udacodingtask3.internet.remote.covid.RetrofitInstanceCovid
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class CovidPresenter(val view: CovidView) {
    fun getCorona() {
        CoroutineScope(Dispatchers.Main).launch {
            val response = RetrofitInstanceCovid.buildApiService().getDataCorona()
            if (response.isSuccessful) {
                view.hideProgress()
                view.onSuccess(response.body()!!.listData)
        } else {
            view.hideProgress()
            view.onFailure(response.message())
        }
    }

}

}