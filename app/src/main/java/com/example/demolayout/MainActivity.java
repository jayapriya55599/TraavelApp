package com.example.demolayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bottom Navigation
        BottomNavigationView btnNav=findViewById(R.id.bottomNavigationView);
        btnNav.setOnNavigationItemSelectedListener(navListener);


        //Setting Home Fragment as main fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.frameLayout, new HomeFragment()).commit();
    }


    //Listen nav bar
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener()
    {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment=null;

            switch ((item.getItemId()))
            {
                case R.id.item1:
                    selectedFragment = new HomeFragment();
                    break;

                case R.id.item2:
                    selectedFragment = new MyOrderFragment();
                    break;
                case R.id.item3:
                    selectedFragment = new RewardFragment();
                    break;

                case R.id.item4:
                    selectedFragment = new UserFragment();
                    break;

            }

            //Begin Transaction
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frameLayout
                    ,selectedFragment).commit();

            return true;
            }

    };
}