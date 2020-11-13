package id.taufiq.udacodingtask3.internet.response.daerah


import com.google.gson.annotations.SerializedName

data class Daerah(
    @SerializedName("provinsi")
    val provinsi: List<Provinsi>
)