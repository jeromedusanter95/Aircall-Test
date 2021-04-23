package com.jeromedusanter.aircalltest.ui.base

interface IView<A : IAction> {
    fun onAction(action: A) = Unit
}