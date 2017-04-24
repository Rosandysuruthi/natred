package com.example.suruthi.naturalremedies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HealthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
    }
    public void f1(View v) {
        Intent i = new Intent(this, Fever.class);
        startActivity(i);

    }
    public void c1(View v) {
        Intent i = new Intent(this, ColdActivity.class);
        startActivity(i);

    }
    public void he1(View v) {
        Intent i = new Intent(this, HeadAche.class);
        startActivity(i);

    }
    public void s1(View v) {
        Intent i = new Intent(this, StomachPain.class);
        startActivity(i);

    }

}
