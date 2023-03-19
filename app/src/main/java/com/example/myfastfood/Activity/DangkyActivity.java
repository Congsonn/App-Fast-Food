package com.example.myfastfood.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myfastfood.MainActivity;
import com.example.myfastfood.R;

public class DangkyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangky);
    }
    public void dangnhap(View view) {
        startActivity(new Intent(DangkyActivity.this, DangnhapActivity.class));
    }
    public void mainActivity(View view) {
        startActivity(new Intent(DangkyActivity.this, MainActivity.class));
    }
}