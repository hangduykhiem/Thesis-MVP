package com.hangduykhiem.thesismvp.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.hangduykhiem.thesismvp.R;

/**
 * Main activity. In this project, main activity will be the View in the MVP
 */
public class MainMVPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_mvp);
    }
}
