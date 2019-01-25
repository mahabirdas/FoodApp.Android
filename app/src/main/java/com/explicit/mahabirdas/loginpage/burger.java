package com.explicit.mahabirdas.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class burger extends AppCompatActivity {
    ImageView _burg;
    android.support.v7.widget.Toolbar burg_tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);

        _burg=(ImageView) findViewById(R.id.burger_pic);

        burg_tool=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_view);
        setSupportActionBar(burg_tool);
    }
}
