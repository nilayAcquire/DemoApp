package com.tagove.lib.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.librarytagove.TagoveApp;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // On your Floating button click event call this method to initialize chat
        TagoveApp.init(MainActivity.this, ""/*Your Agent Id Here*/);
    }
}
