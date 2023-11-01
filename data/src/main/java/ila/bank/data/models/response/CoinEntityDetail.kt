package ila.bank.data.models.response

/**
 * Created by Dinesh Parmar
 * Company NeoSoft Technologies 
 */

data class CoinEntityDetail(
    val id: String?,
    val symbol: String?,
    val name: String?,
    val description: CoinEntityDetailDescription?
)