package com.ruiz.cris.applicationactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main2Activity : AppCompatActivity() {
    
    val TAG = "Activity 1"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        Log.d(TAG, "OnCreate")
    }

    override fun onStart(){
        super.onStart()
        Log.d(TAG, "onStart")
    }


    override fun onResume(){
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause(){
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop(){
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy(){
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}
