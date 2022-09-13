package com.example.oopandroidkotlin

import android.util.Log

open class Car {
    var maxSpeed = 50

    open fun start() {
        Log.i("MyTag","Car is starting...")
    }

    open fun showDetails() {
        Log.i("MyTag", "name of the driver is Lukamba")
        Log.i("MyTag", "maximum speed: $maxSpeed")
    }
}