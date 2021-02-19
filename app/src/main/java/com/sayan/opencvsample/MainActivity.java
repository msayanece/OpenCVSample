package com.sayan.opencvsample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity=======>";

    static {
        if (OpenCVLoader.initDebug()){
            Log.d(TAG, "  static initializer: Open CV is connected successfully.");
        }else{
            Log.d(TAG, "  static initializer: Open CV is connected successfully.");
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}