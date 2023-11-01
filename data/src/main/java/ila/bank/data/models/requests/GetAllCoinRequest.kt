package ila.bank.data.models.requests

/**
 * Created by Dinesh Parmar
 * Company NeoSoft Technologies 
 */

data class GetAllCoinRequest(
    val currency: String,
    val order: String,
    val perPage: Int,
    val page: Int,
    val sparkline: Boolean
) : ApisRequest("api/v3/coins/markets")

