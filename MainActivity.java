package com.example.suruthi.naturalremedies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void h1(View v) {
        Intent i = new Intent(this, HealthActivity.class);
        startActivity(i);

    }
    public void Ny(View v) {
        Intent i = new Intent(this, NaturalBeauty.class);
        startActivity(i);

    }
}
