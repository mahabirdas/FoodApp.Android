package com.explicit.mahabirdas.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class tacos extends AppCompatActivity {
    ImageView _tacos;
    android.support.v7.widget.Toolbar tacos_tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tacos);

        _tacos=(ImageView) findViewById(R.id.tacos_pic);

        tacos_tool=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_view);
        setSupportActionBar(tacos_tool);
    }
}
