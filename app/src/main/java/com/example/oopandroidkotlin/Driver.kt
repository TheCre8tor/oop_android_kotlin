package com.example.oopandroidkotlin

import android.util.Log

class Driver(var name: String, credit: Int) {
    /* By declaring a parameter with var keyword,
    *  we do not need to create a field variable */

    // var  driverName = ""
    // private var driverName: String
    // var  driverName = name

    var totalCredit = 50
    var car = Car()

    init {
        // driverName = name

        car.maxSpeed = 150
        car.start()
    }

    fun showDetails() {
        Log.i("MyTag", "name of the driver is $name")
    }
}