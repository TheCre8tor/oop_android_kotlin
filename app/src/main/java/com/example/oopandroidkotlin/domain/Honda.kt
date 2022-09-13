package com.example.oopandroidkotlin.domain

import android.util.Log
import com.example.oopandroidkotlin.Car

class Honda: Car() {
    override fun start() {
        Log.i("MyTag", "this my Honda loading...")
    }

    override fun showDetails() {
        Log.i("MyTag", "This is an override of Honda")
    }
}