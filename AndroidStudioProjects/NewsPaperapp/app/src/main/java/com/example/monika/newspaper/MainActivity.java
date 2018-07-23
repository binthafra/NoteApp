package com.example.monika.newspaper;

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

    public void prothomAlo(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://www.prothomalo.com");
        startActivity(intent);
    }

    public void jugantor(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://www.jugantor.com");
        startActivity(intent);
    }

    public void samakal(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://www.samakal.com");
        startActivity(intent);
    }

    public void azadi(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://www.edainikazadi.net");
        startActivity(intent);
    }

    public void criket(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://www.prothomalo.com");
        startActivity(intent);
    }

    public void football(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://www.prothomalo.com");
        startActivity(intent);
    }

    public void bbc(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://www.bbc.com");
        startActivity(intent);
    }

    public void cnn(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://edition.cnn.com");
        startActivity(intent);
    }

    public void Bdjobs(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://www.bdjobs.com");
        startActivity(intent);
    }

    public void Chakri(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("url","http://www.chakri.com/");
        startActivity(intent);
    }
}
