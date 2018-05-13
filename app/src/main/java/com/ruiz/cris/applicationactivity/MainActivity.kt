package com.ruiz.cris.applicationactivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {


    val TAG = "Activity 1"
    private lateinit var btnNext : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "OnCreate")
        btnNext = findViewById(R.id.btn_next)

        btnNext.setOnClickListener{val i = Intent(this, Main2Activity::class.java)
        startActivity(i)
        }
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
