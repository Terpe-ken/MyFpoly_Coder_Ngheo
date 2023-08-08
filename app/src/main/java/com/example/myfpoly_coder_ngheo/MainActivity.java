package com.example.myfpoly_coder_ngheo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.example.myfpoly_coder_ngheo.Fragment.HomeFragment;
import com.example.myfpoly_coder_ngheo.Fragment.LichhocFragment;
import com.example.myfpoly_coder_ngheo.Fragment.DiemFragment;
import com.example.myfpoly_coder_ngheo.Fragment.TienichFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_tab_menu);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                // Xử lý sự kiện khi người dùng chọn một mục trong BottomNavigationView
                Fragment selectedFragment = null;

                if (item.getItemId() == R.id.navigation_home) {
                    selectedFragment = new HomeFragment();
                } else if (item.getItemId() == R.id.navigation_lichhoc) {
                    selectedFragment = new LichhocFragment();
                } else if (item.getItemId() == R.id.navigation_diem) {
                    selectedFragment = new DiemFragment();
                } else if (item.getItemId() == R.id.navigation_tienich) {
                    selectedFragment = new TienichFragment();
                }


                if (selectedFragment != null) {
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame_container, selectedFragment).commit();
                }
                return true;
            }
        });
    }
}