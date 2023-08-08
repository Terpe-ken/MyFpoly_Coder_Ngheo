package com.example.myfpoly_coder_ngheo.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.myfpoly_coder_ngheo.MainActivity;
import com.example.myfpoly_coder_ngheo.R;

public class TienichActivity extends AppCompatActivity {
ImageButton imgbtn_cdsv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienich);
        imgbtn_cdsv = findViewById(R.id.imgbtn_cdsv);

        imgbtn_cdsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TienichActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}