package com.example.oopandroidkotlin

interface SpeedController {
    fun accelerate()
    fun decelerate()

    fun getBrandId(): String {
        return "ADS876SP"
    }
}