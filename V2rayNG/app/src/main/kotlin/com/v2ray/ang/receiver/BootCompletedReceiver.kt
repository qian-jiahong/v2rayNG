package com.v2ray.ang.receiver;

import android.content.BroadcastReceiver;
import android.content.Context
import android.content.Intent
import android.util.Log

class BootCompletedReceiver : BroadcastReceiver() {
    private var TAG = "BootCompletedReceiver"
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d(TAG, "onReceive: ")
    }
}
