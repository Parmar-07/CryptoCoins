package ila.bank.carousel_demo.features.dashboard.models

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import ila.bank.carousel_demo.BR
/**
 * Created by Dinesh Parmar
 * Company NeoSoft Technologies 
 */

/**
 * CarouselItemData is model class for listing in @CarouselPagerAdapter
 * */
class CarouselItemData : BaseObservable() {


    @Bindable
    var imageUrl = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.imageUrl)
        }
}