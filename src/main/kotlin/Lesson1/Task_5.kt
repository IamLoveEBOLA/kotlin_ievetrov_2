package org.example.Lesson1

fun main() {
    val totalSeconds: Int = 6480
    val hours: Int = totalSeconds / 3600
    val minutes: Int = (totalSeconds % 3600) / 60
    val seconds: Int = totalSeconds % 60
    val formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds)


    println(formattedTime)
}