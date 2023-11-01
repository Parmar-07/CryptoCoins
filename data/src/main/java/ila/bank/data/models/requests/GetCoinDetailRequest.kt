package ila.bank.data.models.requests

/**
 * Created by Dinesh Parmar
 * Company NeoSoft Technologies 
 */

data class GetCoinDetailRequest(
    val id: String
) : ApisRequest("api/v3/coins/$id")

