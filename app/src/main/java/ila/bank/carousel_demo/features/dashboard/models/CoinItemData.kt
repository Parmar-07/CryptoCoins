package ila.bank.carousel_demo.features.dashboard.models

/**
 * Created by Dinesh Parmar
 * Company NeoSoft Technologies 
 */

/**
 * CoinItemData is model class for listing in @CoinsAdapter
 * */
data class CoinItemData(
    val coinId: String,
    val image: String,
    val coinName: String,
    val overview: String
)