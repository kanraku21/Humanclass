package com.example.kotlinlog

import android.util.Log

open class Dog: Animal {

//    var name: String
//    var age: Int

    constructor(name: String, age: Int): super(name, age) {
//        this.name = name
//        this.age = age



    }

    override fun say() {
        Log.d("kotlintest", this.name + "(" + this.age + "歳)" + "「ワンワン」")
    }
}