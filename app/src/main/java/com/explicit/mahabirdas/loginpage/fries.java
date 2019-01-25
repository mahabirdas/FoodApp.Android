package com.explicit.mahabirdas.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class fries extends AppCompatActivity {
    ImageView _fries;
    android.support.v7.widget.Toolbar fries_tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fries);

        _fries=(ImageView) findViewById(R.id.frenchf_pic);
        fries_tool=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_view);
        setSupportActionBar(fries_tool);
    }
}
