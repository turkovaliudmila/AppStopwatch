package ru.geekbrains.appstopwatch.model

class Model : TimestampProvider {
    override fun getMilliseconds(): Long {
        return System.currentTimeMillis()
    }
}