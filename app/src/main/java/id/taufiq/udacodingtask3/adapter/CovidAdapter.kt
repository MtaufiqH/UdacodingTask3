package id.taufiq.udacodingtask3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.taufiq.udacodingtask3.R
import id.taufiq.udacodingtask3.internet.response.covid.Data
import kotlinx.android.synthetic.main.covid_row.view.*

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class CovidAdapter(private val data: List<Data>, private val listener: (Data) -> Unit) :
    RecyclerView.Adapter<CovidAdapter.CovidViewHolder>() {

    val context: Context? = null

    class CovidViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binding(data: Data, listener: (Data) -> Unit) {
            with(itemView) {
                tv_provins.text = data.key
                setOnClickListener { listener(data) }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.covid_row, parent, false)

        return CovidViewHolder(view)
    }

    override fun onBindViewHolder(holder: CovidViewHolder, position: Int) {
        holder.binding(data[position], listener)
    }

    override fun getItemCount(): Int = data.size

}