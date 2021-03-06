package id.taufiq.udacodingtask3.internet.response.batik

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Hasil(
    val daerah_batik: String,
    val harga_rendah: Int,
    val harga_tinggi: Int,
    val hitung_view: Int,
    val id: Int,
    val link_batik: String,
    val makna_batik: String,
    val nama_batik: String
) : Parcelable