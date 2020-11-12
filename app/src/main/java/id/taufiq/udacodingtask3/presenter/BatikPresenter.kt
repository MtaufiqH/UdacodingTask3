package id.taufiq.udacodingtask3.presenter

import id.taufiq.udacodingtask3.data.remote.RetrofitInstance
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class BatikPresenter(val view: BatikView) {
    fun getBatik() {
        CoroutineScope(Dispatchers.Main).launch {
            val response = RetrofitInstance.buildApiService().getBatik()
            if (response.isSuccessful) {
                view.hideProgress()
                view.onSuccess(response.body()!!.hasil)


            } else {
                view.hideProgress()
                view.onFailure(response.message())
            }
        }

    }

}