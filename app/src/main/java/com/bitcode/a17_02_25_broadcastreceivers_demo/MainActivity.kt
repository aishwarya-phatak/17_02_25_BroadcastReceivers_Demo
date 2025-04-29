package com.bitcode.a17_02_25_broadcastreceivers_demo

import android.annotation.SuppressLint
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bitcode.a17_02_25_broadcastreceivers_demo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var activityMainBinding: ActivityMainBinding
    private lateinit var myBroadcastReceiver: MyBroadcastReceiver

    @SuppressLint("UnspecifiedRegisterReceiverFlag")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        myBroadcastReceiver = MyBroadcastReceiver()
        activityMainBinding.btnRegisterReceiver.setOnClickListener {
            var intentFilter = IntentFilter(Intent.ACTION_BATTERY_LOW)
            registerReceiver(myBroadcastReceiver, intentFilter)
        }

        activityMainBinding.btnUnregisterReceiver.setOnClickListener {
            unregisterReceiver(myBroadcastReceiver)
        }
    }
}