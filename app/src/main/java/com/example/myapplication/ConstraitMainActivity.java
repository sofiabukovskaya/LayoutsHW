package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ConstraitMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_constrait_main);
    }

    public void clickToast(View view) {
        Toast.makeText(this, "Wow! What an adorable person looking at this text! :)", Toast.LENGTH_SHORT).show();
    }
}