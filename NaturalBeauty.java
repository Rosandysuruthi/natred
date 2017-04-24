package com.example.suruthi.naturalremedies;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NaturalBeauty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natural_beauty);
    }
    public void ha1(View v) {
        Intent i = new Intent(this, HairFall.class);
        startActivity(i);

    }
    public void pm1(View v) {
        Intent i = new Intent(this, Pimples.class);
        startActivity(i);

    }
    public void d1(View v) {
        Intent i = new Intent(this, DryLips.class);
        startActivity(i);

    }

}
