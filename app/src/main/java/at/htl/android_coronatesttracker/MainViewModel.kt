package at.htl.android_coronatesttracker

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    private val _oneWayBindingValue: MutableLiveData<Int> = MutableLiveData(7)
    val oneWayBindingValue: LiveData<Int> get() = _oneWayBindingValue

    fun onIncrementOneWayBindingValue(){
        val number = oneWayBindingValue.value?: -1
        _oneWayBindingValue.value = number + 1
    }

}