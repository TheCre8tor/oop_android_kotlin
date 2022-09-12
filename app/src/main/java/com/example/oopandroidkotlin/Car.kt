package com.example.oopandroidkotlin

class Car(name: String) {
    constructor(name: String, age: Int) : this(name) {}
}

val invoke = Car("Alexander")
val call = Car("Alexander", 27)