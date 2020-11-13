package id.taufiq.udacodingtask3.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import id.taufiq.udacodingtask3.R
import id.taufiq.udacodingtask3.adapter.DaerahAdapter
import id.taufiq.udacodingtask3.internet.response.daerah.Provinsi
import id.taufiq.udacodingtask3.presenter.daerah.DaerahPresenter
import id.taufiq.udacodingtask3.presenter.daerah.DaerahView
import kotlinx.android.synthetic.main.fragment_daerah.*

class FragmentDaerah : Fragment(), DaerahView {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_daerah, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val presenter = DaerahPresenter(this)
        presenter.getDaerah()


    }

    override fun onSuccess(data: List<Provinsi>) {
        rv_daerah.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv_daerah.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        rv_daerah.adapter = DaerahAdapter(data) {

        }
    }

    override fun onFailure(message: String) {
        progressBarDaerah.visibility = View.INVISIBLE
    }

    override fun hideProgress() {
        progressBarDaerah.visibility = View.INVISIBLE
    }

}