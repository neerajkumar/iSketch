package com.example.android.canvas;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

public class CanvasActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        View mylayout = findViewById(R.layout.main);
        mylayout.setBackgroundColor(Color.WHITE);
        
    }
}