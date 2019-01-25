package com.explicit.mahabirdas.loginpage;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    slideAdapter mslider;
    LinearLayout mslide,dot_linear;

     int dotcounts;
     ImageView[] dots;

     Handler handler;
     Runnable runnable;
     Timer timer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager=(ViewPager) findViewById(R.id.show_View);
        mslide=(LinearLayout) findViewById(R.id.slide_linear);
        dot_linear=(LinearLayout) findViewById(R.id.dot_view);
        TextView txtC=(TextView) findViewById(R.id.Text_Click);

        mslider=new slideAdapter(this);
        viewPager.setAdapter(mslider);

        handler=new Handler();
        runnable=new Runnable() {
            @Override
            public void run() {
                  int i=viewPager.getCurrentItem();

                  if(i==mslider.lst_images.length-1) {
                      i=0;
                      viewPager.setCurrentItem(i,true);
                  }else {
                      i++;
                      viewPager.setCurrentItem(i,true);
                  }

            }
        };
        timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
              handler.post(runnable);
            }
        },3000,3000);

        dotcounts=mslider.getCount();
        dots=new ImageView[dotcounts];

        for (int i = 0; i < dotcounts; i++) {
            dots[i] = new ImageView(this);
            dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.active_dot));
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            params.setMargins(8, 0, 8, 0);
            dot_linear.addView(dots[i], params);
        }
        dots[0].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < dotcounts; i++) {
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.non_active_dot));
                }
                dots[position].setImageDrawable(ContextCompat.getDrawable(getApplicationContext(),R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        txtC.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        finish();
                        startActivity(new Intent(MainActivity.this,logInbar.class));
                    }
                }
        );



    }
}
