package id.taufiq.udacodingtask3.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import id.taufiq.udacodingtask3.R
import id.taufiq.udacodingtask3.adapter.MuseumAdapter
import id.taufiq.udacodingtask3.internet.response.museum.Data
import id.taufiq.udacodingtask3.presenter.museum.MuseumPresenter
import id.taufiq.udacodingtask3.presenter.museum.MuseumView
import kotlinx.android.synthetic.main.fragment_museum.*


class FragmentMuseum : Fragment(), MuseumView {

    companion object {
        private const val TAG = "FragmentMuseum"
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_museum, container, false)


    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val presenter = MuseumPresenter(this)
        presenter.getMuseum()

        btn_cari.setOnClickListener {
            val textName = et_search_museum.text.toString()
            presenter.getbyMuseumName(textName)
        }

    }

    override fun onSuccess(data: List<Data>) {
        // setup recyclerview
        rv_museum.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv_museum.adapter = MuseumAdapter(data) {

            val action = FragmentMuseumDirections.actionFragmentMuseumToMuseumDetail(it)
            findNavController().navigate(action)

        }
        rv_museum.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))


    }

    override fun onFailure(message: String) {
        Log.d(TAG, "onFailure: $message")
    }

    override fun hideProgress() {
        progress_circular.visibility = View.INVISIBLE
    }

    override fun showProgress() {
        progress_circular.visibility = View.VISIBLE
    }
}