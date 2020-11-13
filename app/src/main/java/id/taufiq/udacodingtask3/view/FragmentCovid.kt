package id.taufiq.udacodingtask3.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import id.taufiq.udacodingtask3.R
import id.taufiq.udacodingtask3.adapter.CovidAdapter
import id.taufiq.udacodingtask3.internet.response.covid.Data
import id.taufiq.udacodingtask3.presenter.covid.CovidPresenter
import id.taufiq.udacodingtask3.presenter.covid.CovidView
import kotlinx.android.synthetic.main.fragment_covid.*

class FragmentCovid : Fragment(),CovidView {

    private val TAG = "FragmentCovid"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_covid, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val presenter = CovidPresenter(this)
        presenter.getCorona()

    }



    override fun onSuccess(data: List<Data>) {
        rv_covid.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        rv_covid.adapter = CovidAdapter(data){resultCovid ->
            val action = FragmentCovidDirections.actionFragmentCovidToCovidDetail(resultCovid)
            findNavController().navigate(action)

        }
    }

    override fun onFailure(message: String) {
        Log.d(TAG, "onFailure: $message")
    }

    override fun hideProgress() {
        progressBarCovid.visibility = View.INVISIBLE
    }

}