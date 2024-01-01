package com.example.samplelibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.demolibrary.MySimpleLibrary;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MySimpleLibrary.printLog(
                "My Simple library",
                "Library log invoked"
        );
    }
}