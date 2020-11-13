package id.taufiq.udacodingtask3.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import id.taufiq.udacodingtask3.R
import id.taufiq.udacodingtask3.adapter.MuseumAdapter
import id.taufiq.udacodingtask3.internet.response.museum.Data
import id.taufiq.udacodingtask3.presenter.museum.MuseumPresenter
import id.taufiq.udacodingtask3.presenter.museum.MuseumView
import kotlinx.android.synthetic.main.fragment_museum.*


class FragmentMuseum : Fragment(), MuseumView {

    companion object{
        private const val TAG = "FragmentMuseum"
    }

    private var adapter: MuseumAdapter? = null
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


        et_search_museum.setOnQueryTextListener(object : SearchView.OnQueryTextListener,
            androidx.appcompat.widget.SearchView.OnQueryTextListener {

            override fun onQueryTextSubmit(p0: String?): Boolean {
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                adapter?.filter?.filter(newText)
                return false
            }

        })


    }

    override fun onSuccess(data: List<Data>) {
        // setup recyclerview
        rv_museum.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        rv_museum.adapter = MuseumAdapter(data) {

        }
        rv_museum.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))


    }

    override fun onFailure(message: String) {
        Log.d(TAG, "onFailure: $message")
    }

    override fun hideProgress() {
        progress_circular.visibility = View.INVISIBLE
    }
}