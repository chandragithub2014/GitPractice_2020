package com.git.practice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Updated with New Fun in MainActivity
    private fun printMsg(){
        println("updated with new message to print from fun")
    }
}