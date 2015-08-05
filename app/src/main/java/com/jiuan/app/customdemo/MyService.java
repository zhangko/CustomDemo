package com.jiuan.app.customdemo;

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by ZhangKong on 2015/8/5.
 */
public class MyService extends Service {

    private static final String TAG = "MyService";

    private MyBinder mBinder = new MyBinder();

    @Override
    public void onCreate() {
        super.onCreate();
        log("onCreate");
        try{
            Thread.sleep(60000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        log("onStartCommand");
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        log("onDestroy");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    private void log(String msg){
        Log.d(TAG,msg);
    }

    class MyBinder extends Binder{
        public void startDownLoad(){
            log("startDownLoad!");
        }

    }
}
