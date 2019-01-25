package com.explicit.mahabirdas.loginpage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class logInbar extends AppCompatActivity {

    EditText user_name, pass_word;
    Button _ok;
    TextView Htext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        user_name = (EditText) findViewById(R.id.your_name);
        pass_word = (EditText) findViewById(R.id.your_Password);
        _ok = (Button) findViewById(R.id.hit_Button);
        Htext=(TextView) findViewById(R.id.Home_Click);

        Htext.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        startActivity(new Intent(logInbar.this,MainActivity.class));
                    }
                }
        );

        _ok.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (user_name.getText().toString().trim().equals("Admin")&&
                                pass_word.getText().toString().trim().equals("12345")) {
                            Toast.makeText(logInbar.this, "Thank You!!", Toast.LENGTH_SHORT).show();

                            Intent go = new Intent(logInbar.this, listView.class);
                            startActivity(go);
                        } else {
                            Toast.makeText(logInbar.this, "Wrong User!!", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }
}
