package com.jeromedusanter.aircalltest.ui.base

interface IView<A> {
    fun onReceiveUiAction(action: A?) = Unit
    fun onReceiveCommonUiAction(action: CommonUiAction)
}