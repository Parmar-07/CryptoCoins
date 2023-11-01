package ila.bank.data.models.response

/**
 * Created by Dinesh Parmar
 * Company NeoSoft Technologies 
 */

data class CoinEntity(
    val id: String?,
    val current_price: Double?,
    val image: String?,
    val name: String?,
    val price_change_percentage_24h: Double?,
    val symbol: String?
)