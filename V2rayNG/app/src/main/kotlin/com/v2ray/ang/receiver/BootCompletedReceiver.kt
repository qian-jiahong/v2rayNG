package com.v2ray.ang.receiver;

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.tencent.mmkv.MMKV
import com.v2ray.ang.AppConfig
import com.v2ray.ang.extension.toast
import com.v2ray.ang.service.V2RayServiceManager
import com.v2ray.ang.util.MmkvManager

class BootCompletedReceiver : BroadcastReceiver() {
    private val settingsStorage by lazy {MMKV.mmkvWithID(MmkvManager.ID_SETTING, MMKV.MULTI_PROCESS_MODE)}

    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent != null && context != null) {
            if (settingsStorage?.decodeBool(AppConfig.PREF_AUTO_START_ENABLED) == true) {
                V2RayServiceManager.startV2Ray(context)
            }
        }
    }
}
