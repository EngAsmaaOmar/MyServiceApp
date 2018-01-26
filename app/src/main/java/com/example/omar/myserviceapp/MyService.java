package com.example.omar.myserviceapp;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

/**
 * Created by Omar on 12/5/2017.
 */

public class MyService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    public int onStartCommand (Intent intent, int flags, int startId){
        Toast.makeText(this, "Start My Service ", Toast.LENGTH_SHORT).show();
        return START_STICKY;
    }

    public void onDestroy(){
       super.onDestroy();
       Toast.makeText(this, " My Service Stoped " , Toast.LENGTH_LONG).show();
    }
}
