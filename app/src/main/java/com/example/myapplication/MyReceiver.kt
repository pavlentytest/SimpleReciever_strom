package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val airFlag = intent.getBooleanExtra("state", false)
        if(airFlag) {
            Toast.makeText(context, "Air mode is ON!", Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, "Air mode is OFF!", Toast.LENGTH_LONG).show()
        }

    }
}