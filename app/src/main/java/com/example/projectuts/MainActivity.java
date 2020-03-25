package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleBMTH(View view) {
        Intent intent = new Intent(this, BMTHActivity.class);
        startActivity(intent);
    }

    public void handleSlipknot(View view) {
        Intent intent = new Intent(this, SlipknotActivity.class);
        startActivity(intent);
    }

    public void handleNeckDeep(View view) {
        Intent intent = new Intent(this, NeckDeepActivity.class);
        startActivity(intent);
    }

    public void handleBurgerkill(View view) {
        Intent intent = new Intent(this, BurgerkillActivity.class);
        startActivity(intent);
    }

    public void handleExit(View view) {
        finish();
    }
}
