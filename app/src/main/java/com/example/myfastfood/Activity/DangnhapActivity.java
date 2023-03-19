package com.example.myfastfood.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myfastfood.MainActivity;
import com.example.myfastfood.R;

public class DangnhapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dangnhap);
    }
    public void dangky(View view) {
        startActivity(new Intent(DangnhapActivity.this, DangkyActivity.class));
    }
    public void mainActivity(View view) {
        startActivity(new Intent(DangnhapActivity.this, MainActivity.class));
    }
}