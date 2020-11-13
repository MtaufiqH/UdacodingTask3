package id.taufiq.udacodingtask3.internet.response.museum


import com.google.gson.annotations.SerializedName

data class Museum(
    @SerializedName("data")
    val mdata: List<Data>
)