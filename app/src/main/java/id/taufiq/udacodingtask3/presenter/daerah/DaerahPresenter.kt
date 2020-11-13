package id.taufiq.udacodingtask3.presenter.daerah

import id.taufiq.udacodingtask3.internet.remote.daerah.RetrofitInstanceDaerah
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class DaerahPresenter(val view: DaerahView) {
    fun getDaerah() {
        CoroutineScope(Dispatchers.Main).launch {
            val response = RetrofitInstanceDaerah.buildApiService().getDaerah()
            if (response.isSuccessful) {
                view.hideProgress()
                view.onSuccess(response.body()!!.provinsi)
            } else {
                view.hideProgress()
                view.onFailure(response.message())
            }
        }

    }

}