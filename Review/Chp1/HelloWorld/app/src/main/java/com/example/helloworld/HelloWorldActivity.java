package com.example.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity {

    private static final String TAG = "HelloWorldActivity";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hello_world_layout);
        Log.d("HelloWorldActivity", "onCreate execute");
        Log.d("lol", "onCreate: lol");
        Log.i(TAG, "here");
        Log.d(TAG, "onCreate: interesting");
    }
}
