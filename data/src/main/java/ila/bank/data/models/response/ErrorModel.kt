package ila.bank.data.models.response

import com.google.gson.annotations.SerializedName
/**
 * Created by Dinesh Parmar
 * Company NeoSoft Technologies 
 */

data class ErrorModel(
    @SerializedName("error")
    var error: String?,
)