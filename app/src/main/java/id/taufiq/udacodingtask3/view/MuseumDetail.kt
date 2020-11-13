package id.taufiq.udacodingtask3.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import id.taufiq.udacodingtask3.R
import kotlinx.android.synthetic.main.fragment_batik_detail.*
import kotlinx.android.synthetic.main.fragment_museum_detail.*

class MuseumDetail : Fragment() {

    private val args by navArgs<MuseumDetailArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_museum_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(args.MuseumData) {
            nama_museum_detail.text = nama
            provinsi_museum_detail.text = propinsi
            tv_alamat.text = alamatJalan
            tv_kota.text = kabupatenKota
            tv_kecamatan.text = kecamatan
            tv_thn_berdiri.text = tahunBerdiri
            tv_pengelola.text = pengelola

        }

    }

}