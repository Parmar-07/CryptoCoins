package ila.bank.data.models.requests

/**
 * Created by Dinesh Parmar
 * Company NeoSoft Technologies 
 */
/**
 * Every request will have end path, so here we will be extending from this class
 * and apply the end path dynamically
 * */
open class ApisRequest constructor(val path: String)