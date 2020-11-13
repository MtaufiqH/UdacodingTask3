package id.taufiq.udacodingtask3.internet.response.daerah


import com.google.gson.annotations.SerializedName


data class Provinsi(
    @SerializedName("id")
    val id: Int,
    @SerializedName("nama")
    val nama: String
)