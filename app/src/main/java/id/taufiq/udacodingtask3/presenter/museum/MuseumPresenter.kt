package id.taufiq.udacodingtask3.presenter.museum

import id.taufiq.udacodingtask3.internet.remote.museum.RetrofitInstanceMuseum
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class MuseumPresenter(val view: MuseumView) {
    fun getMuseum() {
        CoroutineScope(Dispatchers.Main).launch {
            view.showProgress()
            val response = RetrofitInstanceMuseum.buildApiService().getMuseum()
            if (response.isSuccessful) {
                view.hideProgress()
                view.onSuccess(response.body()!!.mdata)
            } else {
                view.hideProgress()
                view.onFailure(response.message())
            }
        }


    }

    fun getbyMuseumName(name: String) {
        CoroutineScope(Dispatchers.Main).launch {
            val mResponse = RetrofitInstanceMuseum.buildApiService().getbyNameMuseum(name)

            if (mResponse.isSuccessful){
                view.hideProgress()
                view.onSuccess(mResponse.body()!!.mdata)
            }else{
                view.hideProgress()
                view.onFailure(mResponse.message())
            }
        }

    }

}