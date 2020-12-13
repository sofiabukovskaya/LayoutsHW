package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickToast(View view) {
        Toast.makeText(this, "Hey! Have a good day, you look so nice :)", Toast.LENGTH_SHORT).show();
    }


    public void goToConstraitLayout(View view) {
        Intent intent = new Intent(MainActivity.this, ConstraitMainActivity.class);
        startActivity(intent);
    }
}
