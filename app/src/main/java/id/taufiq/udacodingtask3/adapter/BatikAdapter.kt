package id.taufiq.udacodingtask3.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.Coil
import coil.load
import id.taufiq.udacodingtask3.R
import id.taufiq.udacodingtask3.data.response.batik.Batiks
import id.taufiq.udacodingtask3.data.response.batik.Hasil
import kotlinx.android.synthetic.main.batik_row.view.*

/**
 * Created By Taufiq on 11/12/2020.
 *
 */
class BatikAdapter(private val data: List<Hasil>, private val listener: (Hasil) -> Unit) :
    RecyclerView.Adapter<BatikAdapter.BatikViewHolder>() {

    val context: Context? = null

    class BatikViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun binding(data: Hasil, listener: (Hasil) -> Unit) {

            with(itemView) {
                tv_nama_batik.text = data.nama_batik
                iv_gambar_batik.load(data.link_batik)
                setOnClickListener { listener(data) }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BatikViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.batik_row, parent, false)

        return BatikViewHolder(view)
    }

    override fun onBindViewHolder(holder: BatikViewHolder, position: Int) {
        holder.binding(data[position], listener)
    }

    override fun getItemCount(): Int = data.size

}