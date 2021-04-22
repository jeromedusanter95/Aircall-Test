package com.jeromedusanter.aircalltest.ui.utils

import androidx.databinding.Observable
import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import org.threeten.bp.LocalTime
import org.threeten.bp.format.DateTimeFormatter

internal inline fun <reified T> Any.cast(): T? {
    if (this is T)
        return this
    return null
}

internal fun LocalDate.toFormattedStringWithPattern(pattern: String): String {
    return format(DateTimeFormatter.ofPattern(pattern))
}

internal fun LocalDateTime.toFormattedStringWithPattern(pattern: String): String {
    return format(DateTimeFormatter.ofPattern(pattern))
}

internal fun LocalTime.toFormattedStringWithPattern(pattern: String): String {
    return format(DateTimeFormatter.ofPattern(pattern))
}

fun <T : Observable> T.addOnPropertyChanged(callback: (T) -> Unit) =
    object : Observable.OnPropertyChangedCallback() {
        override fun onPropertyChanged(observable: Observable, i: Int) =
            callback(observable as T)
    }.also { addOnPropertyChangedCallback(it) }

fun <T : Observable> T.removePropertyChanged(callback: (T) -> Unit) =
    object : Observable.OnPropertyChangedCallback() {
        override fun onPropertyChanged(observable: Observable, i: Int) =
            callback(observable as T)
    }.also { removeOnPropertyChangedCallback(it) }