package com.vishnu.core.base

import androidx.lifecycle.ViewModel

open class BaseViewModel<N : BaseNavigator> : ViewModel() {

    private lateinit var refNavigator: N

    var navigator: N
        get() = refNavigator
        set(value) {
            refNavigator = value
        }
}
