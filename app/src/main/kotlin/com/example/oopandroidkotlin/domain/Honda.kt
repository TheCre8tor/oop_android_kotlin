package com.example.oopandroidkotlin.domain

import android.util.Log
import com.example.oopandroidkotlin.Car
import com.example.oopandroidkotlin.SpeedController

class Honda: Car(), SpeedController {
    override fun start() {
        Log.i("MyTag", "this my Honda loading... Brand id is ${this.getBrandId()}")
    }

    override fun showDetails() {
        Log.i("MyTag", "This is an override of Honda")
    }

    override fun accelerate() {
        TODO("Not yet implemented")
    }

    override fun decelerate() {
        TODO("Not yet implemented")
    }
}