package com.example.lephuocthanh_19dh110744;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        display(R.id.mnuHome);
        bottomNavigationView= findViewById(R.id.Bottom_nav);
        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
           @Override
           public boolean onNavigationItemSelected(@NonNull MenuItem item) {
              display(item.getItemId());
               return true;
           }
       });
    }
    void display (int id) {
        Fragment fragment = null;
        switch(id) {
            case R.id.mnuHome:
                toolbar.setTitle("Home");
                fragment=new HomeFragment();break;
            case R.id.mnuDashboard:
                toolbar.setTitle("Dashboard");
                fragment=new DashboardFragment();break;
            case R.id.mnuNotificatio:
                toolbar.setTitle("Notification");
                fragment=new NotificationFragment();break;
            case R.id.mnuAccount:
                toolbar.setTitle("Account info");
                fragment=new AccountFragment();break;
        }
        //the tren framelayout content
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.content, fragment);
        ft.commit();

    }
}
