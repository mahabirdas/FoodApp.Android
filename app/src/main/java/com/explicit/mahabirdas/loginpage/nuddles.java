package com.explicit.mahabirdas.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class nuddles extends AppCompatActivity {
    ImageView _nuudle;
    android.support.v7.widget.Toolbar nuddle_tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuddles);

        _nuudle=(ImageView) findViewById(R.id.nuddle_pic);

        nuddle_tool=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_view);
        setSupportActionBar(nuddle_tool);
    }
}
