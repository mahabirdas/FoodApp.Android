package com.explicit.mahabirdas.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class salads extends AppCompatActivity {
    ImageView _salad;
    android.support.v7.widget.Toolbar salad_tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads);

        _salad=(ImageView) findViewById(R.id.salad_pic);

        salad_tool=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_view);
        setSupportActionBar(salad_tool);

    }
}
