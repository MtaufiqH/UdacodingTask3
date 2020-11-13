package id.taufiq.udacodingtask3.internet.response.museum


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Data(
    @SerializedName("alamat_jalan")
    val alamatJalan: String,
    @SerializedName("bangunan")
    val bangunan: String,
    @SerializedName("bujur")
    val bujur: String,
    @SerializedName("desa_kelurahan")
    val desaKelurahan: String,
    @SerializedName("kabupaten_kota")
    val kabupatenKota: String,
    @SerializedName("kecamatan")
    val kecamatan: String,
    @SerializedName("kode_pengelolaan")
    val kodePengelolaan: String,
    @SerializedName("koleksi")
    val koleksi: String,
    @SerializedName("lintang")
    val lintang: String,
    @SerializedName("luas_tanah")
    val luasTanah: String,
    @SerializedName("museum_id")
    val museumId: String,
    @SerializedName("nama")
    val nama: String,
    @SerializedName("pengelola")
    val pengelola: String,
    @SerializedName("propinsi")
    val propinsi: String,
    @SerializedName("sdm")
    val sdm: String,
    @SerializedName("standar")
    val standar: String,
    @SerializedName("status_kepemilikan")
    val statusKepemilikan: String,
    @SerializedName("sumber_dana")
    val sumberDana: String,
    @SerializedName("tahun_berdiri")
    val tahunBerdiri: String,
    @SerializedName("tipe")
    val tipe: String
) : Parcelable