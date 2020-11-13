package id.taufiq.udacodingtask3.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import id.taufiq.udacodingtask3.R
import id.taufiq.udacodingtask3.adapter.BatikAdapter
import id.taufiq.udacodingtask3.internet.response.batik.Hasil
import id.taufiq.udacodingtask3.presenter.batik.BatikPresenter
import id.taufiq.udacodingtask3.presenter.batik.BatikView
import kotlinx.android.synthetic.main.fragment_batik.*


class BatikFragment : Fragment(), BatikView {

    private var presenter: BatikPresenter? = null
    private val TAG = "BatikFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_batik, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter = BatikPresenter(this)
        presenter!!.getBatik()


    }

    override fun onSuccess(data: List<Hasil>) {
        val layout = GridLayoutManager(view?.context, 2)
        layout.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (position) {
                    0 -> 2
                    else -> 1
                }
            }

        }

        rv_batik.layoutManager = layout

        rv_batik.adapter =
            BatikAdapter(data) {

            }
    }

    override fun onFailure(message: String) {
        Log.d(TAG, "onFailure: $message ")
        progress_id.visibility = View.INVISIBLE
    }

    override fun hideProgress() {
        progress_id.visibility = View.INVISIBLE
    }


}

