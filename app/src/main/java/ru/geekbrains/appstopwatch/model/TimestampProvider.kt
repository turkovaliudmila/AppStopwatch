package ru.geekbrains.appstopwatch.model

interface TimestampProvider {
    fun getMilliseconds(): Long
}