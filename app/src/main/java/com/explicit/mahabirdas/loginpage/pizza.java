package com.explicit.mahabirdas.loginpage;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class pizza extends AppCompatActivity {
    ImageView pitzza_pic;
    android.support.v7.widget.Toolbar pizz_tool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        pitzza_pic=(ImageView) findViewById(R.id.pizza_pic);

        pizz_tool=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_view);
        setSupportActionBar(pizz_tool);
    }
}
