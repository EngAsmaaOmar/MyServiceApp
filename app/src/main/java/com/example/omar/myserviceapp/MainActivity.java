package com.example.omar.myserviceapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.util.Log;
import android.widget.ImageView;

public class MainActivity extends Activity {
    String msg = "Android : ";
    ImageView flow = (ImageView)findViewById(R.id.flowerimage);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(msg, "The onCreate() event");
        flow.setVisibility(View.GONE);
    }

    public void StartService(View view) {
        startService(new Intent(getBaseContext(), MyService.class));
    }

    // Method to stop the service
    public void StopService(View view) {
        stopService(new Intent(getBaseContext(), MyService.class));
    }
}
