package com.example.oopandroidkotlin

import android.util.Log
import com.example.oopandroidkotlin.domain.Honda

class Driver(var name: String, credit: Int) {
    /* By declaring a parameter with var keyword,
    *  we do not need to create a field variable */

    // var  driverName = ""
    // private var driverName: String
    // var  driverName = name

    private var totalCredit = 50
    private var car = Car()

    private var honda = Honda()

    init {
        // driverName = name
        totalCredit += credit

        honda.maxSpeed = 890
        honda.showDetails()
        honda.start()

        car.maxSpeed = 150
        car.start()
    }

    fun showDetails() {
        Log.i("MyTag", "name of the driver is $name with $totalCredit credits")
    }
}