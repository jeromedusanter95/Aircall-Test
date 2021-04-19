package com.jeromedusanter.aircalltest.utils

import org.threeten.bp.LocalDate
import org.threeten.bp.LocalDateTime
import org.threeten.bp.LocalTime
import org.threeten.bp.format.DateTimeFormatter

inline fun <reified T> Any.cast(): T? {
    if (this is T)
        return this
    return null
}

fun LocalDate.toFormattedStringWithPattern(pattern: String): String {
    return format(DateTimeFormatter.ofPattern(pattern))
}

fun LocalDateTime.toFormattedStringWithPattern(pattern: String): String {
    return format(DateTimeFormatter.ofPattern(pattern))
}

fun LocalDateTime.toDatabaseFormatString(): String {
    return format(DateTimeFormatter.ISO_DATE_TIME)
}

fun LocalDate.toDatabaseFormatString(): String {
    return format(DateTimeFormatter.ISO_DATE_TIME)
}

fun LocalTime.toFormattedStringWithPattern(pattern: String): String {
    return format(DateTimeFormatter.ofPattern(pattern))
}

fun String.toLocaleDateTime(): LocalDateTime {
    return LocalDateTime.parse(
        this,
        DateTimeFormatter.ISO_DATE_TIME
    )
}

fun String.toLocaleDate(): LocalDate {
    return LocalDateTime.parse(
        this,
        DateTimeFormatter.ISO_DATE_TIME
    ).toLocalDate()
}