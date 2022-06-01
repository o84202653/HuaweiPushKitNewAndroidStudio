package com.oliverbotello.examplepushnewgradle;

import android.util.Log;

import com.huawei.hms.push.HmsMessageService;

public class PushHmsMessageService extends HmsMessageService {
    @Override
    public void onNewToken(String token) {
        super.onNewToken(token);
        Log.e("Token", token);
    }
}
