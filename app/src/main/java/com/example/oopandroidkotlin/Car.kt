package com.example.oopandroidkotlin

import android.util.Log

class Car {
    var maxSpeed = 50

    fun start() {
        Log.i("MyTag","Car is starting...")
    }

    fun showDetails() {
        Log.i("MyTag", "name of the driver is Lukamba")
        Log.i("MyTag", "maximum speed: $maxSpeed")
    }
}