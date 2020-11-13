package id.taufiq.udacodingtask3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import id.taufiq.udacodingtask3.R
import id.taufiq.udacodingtask3.internet.response.batik.Hasil
import id.taufiq.udacodingtask3.internet.response.museum.Data
import kotlinx.android.synthetic.main.batik_row.view.*

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class MuseumAdapter(private val data: List<Data>, private val listener: (Data) -> Unit) :
    RecyclerView.Adapter<MuseumAdapter.MuseumViewHolder>() {

    val context: Context? = null

    class MuseumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binding(data: Data, listener: (Data) -> Unit) {

            with(itemView) {

                setOnClickListener { listener(data) }

                }
            }

        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuseumViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.batik_row, parent, false)

        return MuseumViewHolder(view)
    }

    override fun onBindViewHolder(holder: MuseumViewHolder, position: Int) {
        holder.binding(data[position], listener)
    }

    override fun getItemCount(): Int = data.size

}
