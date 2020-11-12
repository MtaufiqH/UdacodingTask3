package id.taufiq.udacodingtask3.data.response.batik

import com.google.gson.annotations.SerializedName

data class Batiks(
    @SerializedName("hasil")
    val hasil: List<Hasil>,

    val max_price: Int,
    val min_price: Int,
    val total_element: Int,
    val total_halaman: Int
)