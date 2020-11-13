package id.taufiq.udacodingtask3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.taufiq.udacodingtask3.R
import id.taufiq.udacodingtask3.internet.response.daerah.Provinsi
import kotlinx.android.synthetic.main.daerah_row.view.*

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class DaerahAdapter(private val data: List<Provinsi>, private val listener: (Provinsi) -> Unit) :
    RecyclerView.Adapter<DaerahAdapter.DaerahViewHolder>() {

    val context: Context? = null

    class DaerahViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binding(data: Provinsi, listener: (Provinsi) -> Unit) {

            with(itemView) {
                tv_nama_daerah.text = data.nama
                setOnClickListener { listener(data) }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DaerahViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.daerah_row, parent, false)

        return DaerahViewHolder(view)
    }

    override fun onBindViewHolder(holder: DaerahViewHolder, position: Int) {
        holder.binding(data[position], listener)
    }

    override fun getItemCount(): Int = data.size

}
