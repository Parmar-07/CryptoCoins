package ila.bank.carousel_demo.features.start

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import ila.bank.carousel_demo.BR
/**
 * Created by Dinesh Parmar
 * Company NeoSoft Technologies 
 */

/**
 * StartData is UI data binding model on UI
 * */
class StartData : BaseObservable() {


    @Bindable
    var showProceed = false
        set(value) {
            field = value
            notifyPropertyChanged(BR.showProceed)
        }
}