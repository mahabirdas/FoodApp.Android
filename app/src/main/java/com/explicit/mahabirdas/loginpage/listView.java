package com.explicit.mahabirdas.loginpage;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

public class listView extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    ListView my_List;
    String[] list_Value={"Burgers","Nuddles","Pizzas","Salads","Tacos","French fries"};
    String[] decs={"This is Burgers","This is Nuddles","This is Pizzas","This is Salads","This is Tacos","This is French fries"};
    Integer[] imaId={R.drawable.burger,R.drawable.noodle,R.drawable.pizza,R.drawable.salads,R.drawable.tacos,R.drawable.frenchfries};

     android.support.v7.widget.Toolbar toolbar;
     DrawerLayout mDrawer;
     NavigationView mNavigation;
     ActionBarDrawerToggle mToogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        toolbar=(android.support.v7.widget.Toolbar) findViewById(R.id.toolbar_view);
        setSupportActionBar(toolbar);

        mDrawer=(DrawerLayout) findViewById(R.id.foodDrawer);
        mNavigation=(NavigationView) findViewById(R.id.navigation_draw);
        mToogle=new ActionBarDrawerToggle(this,mDrawer,toolbar,R.string.start,R.string.end);
        mDrawer.setDrawerListener(mToogle);

        mToogle.syncState();


        my_List=(ListView) findViewById(R.id.food_List);

        CustomListView customListView=new CustomListView(this,list_Value,decs,imaId);
            my_List.setAdapter(customListView);

            mNavigation.setNavigationItemSelectedListener(this);

            my_List.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                    if(position==0){

                        Intent next=new Intent(listView.this,burger.class);
                        startActivity(next);
                    }

                    if(position==1){

                        Intent next=new Intent(listView.this,nuddles.class);
                        startActivity(next);
                    }
                    if(position==2){

                        Intent next=new Intent(listView.this,pizza.class);
                        startActivity(next);
                    }
                    if(position==3){

                        Intent next=new Intent(listView.this,salads.class);
                        startActivity(next);
                    }
                    if(position==4){

                        Intent next=new Intent(listView.this,tacos.class);
                        startActivity(next);
                    }
                    if(position==5){

                        Intent next=new Intent(listView.this,fries.class);
                        startActivity(next);
                    }
                }
            });
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        switch (id){

            case R.id.profile_id:

                Toast.makeText(getApplicationContext(),"Profile",Toast.LENGTH_LONG).show();
                break;

            case R.id.rate_id:
                Toast.makeText(getApplicationContext(),"Rate",Toast.LENGTH_LONG).show();
                break;

            case R.id.share_id:
                Toast.makeText(getApplicationContext(),"Share",Toast.LENGTH_LONG).show();
                break;

            case R.id.help_id:
                Toast.makeText(getApplicationContext(),"Help",Toast.LENGTH_LONG).show();
                break;

            case R.id.setting_id:
                Toast.makeText(getApplicationContext(),"Setting",Toast.LENGTH_LONG).show();
                break;

            case R.id.logout_id:
                Toast.makeText(getApplicationContext(),"LogOut",Toast.LENGTH_LONG).show();
                break;

            case R.id.delete_id:
                Toast.makeText(getApplicationContext(),"Delete",Toast.LENGTH_LONG).show();
                break;

            case R.id.spam_id:
                Toast.makeText(getApplicationContext(),"Alert",Toast.LENGTH_LONG).show();
                break;
        }
         mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

