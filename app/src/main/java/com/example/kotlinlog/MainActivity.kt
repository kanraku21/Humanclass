package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

 class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        var human = Human("太郎", 15, "野球")

        human.say()
        human.think()

        var human2 = Human("次郎", 12, "読書")

        human2.say()
        human2.think()



        }
    }

