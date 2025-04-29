package com.bitcode.a17_02_25_broadcastreceivers_demo

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent != null){
            if(intent.action == Intent.ACTION_BATTERY_LOW){
                if (intent.getBooleanExtra("state", true)){
                    Toast.makeText(context,"onReceive Method called -- battery low method changed", Toast.LENGTH_LONG).show()
                }
            }
        }

        if (intent?.action == Intent.ACTION_AIRPLANE_MODE_CHANGED){
            if (intent.getBooleanExtra("status", true)){
                Toast.makeText(context,"Air plane mode changed", Toast.LENGTH_LONG).show()
            }
        }
    }
}