package com.example.attention.splashscreen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void Newspaper(View view) {
        Intent intent = new Intent(HomeActivity.this,NewsPaperActivity.class);
        startActivity(intent);
    }
}
