package id.taufiq.udacodingtask3.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import coil.load
import id.taufiq.udacodingtask3.R
import kotlinx.android.synthetic.main.fragment_batik_detail.*
import java.text.NumberFormat
import java.util.*


class BatikDetail : Fragment() {


    private val args by navArgs<BatikDetailArgs>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_batik_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        iv_detail_batik.load(args.BatikData.link_batik) {
            this.crossfade(true)
                .placeholder(R.drawable.ic_baseline_image_24)
        }
        with(args.BatikData) {
            tv_nama_batik_detail.text = nama_batik
            tv_daerah_batik.text = daerah_batik
            tv_makna_batik.text = makna_batik

            // lokalisasi format rupiah
            val locale = Locale("id", "ID")
            val formatRupiah = NumberFormat.getCurrencyInstance(locale)
            tv_harga_tinggi.text = formatRupiah.format(harga_tinggi.toDouble())
            tv_harga_rendah.text = formatRupiah.format(harga_rendah.toDouble())


        }


    }


}