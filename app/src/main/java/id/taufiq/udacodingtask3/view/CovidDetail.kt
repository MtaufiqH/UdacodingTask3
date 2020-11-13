package id.taufiq.udacodingtask3.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import id.taufiq.udacodingtask3.R
import kotlinx.android.synthetic.main.fragment_covid_detail.*


class CovidDetail : Fragment() {

    private val args by navArgs<CovidDetailArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_covid_detail, container, false)
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(args.CovidData) {
            tv_key_provins.text = key
            tv_dirawat.text = "$jumlahDirawat orang"
            tv_kasus.text = "$jumlahKasus orang"
            tv_meninggal.text = "$jumlahMeninggal orang"
            tv_sembuh.text = "$jumlahSembuh orang"

        }
    }

}