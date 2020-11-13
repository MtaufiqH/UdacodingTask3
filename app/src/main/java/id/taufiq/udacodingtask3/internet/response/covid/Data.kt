package id.taufiq.udacodingtask3.internet.response.covid


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    @SerializedName("doc_count")
    val docCount: Double,
    @SerializedName("jumlah_dirawat")
    val jumlahDirawat: Int,
    @SerializedName("jumlah_kasus")
    val jumlahKasus: Int,
    @SerializedName("jumlah_meninggal")
    val jumlahMeninggal: Int,
    @SerializedName("jumlah_sembuh")
    val jumlahSembuh: Int,
    @SerializedName("key")
    val key: String
) : Parcelable