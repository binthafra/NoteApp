package com.example.attention.newsviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class NewsPaperActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_paper);
    }

    public void prothomAlo(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","https://www.prothomalo.com/");
        startActivity(intent);
    }

    public void jugantor(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","https://www.jugantor.com/");
        startActivity(intent);
    }

    public void samakal(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.samakal.com");
        startActivity(intent);
    }

    public void azadi(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.ittefaq.com.bd/");
        startActivity(intent);
    }

    public void criket(View view) {

        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","https://www.prothomalo.com/");
        startActivity(intent);
    }

    public void Bdjobs(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.bdjobs.com");
        startActivity(intent);
    }

    public void Chakri(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.chakri.com/");
        startActivity(intent);
    }

    public void bbc(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.bbc.com");
        startActivity(intent);
    }

    public void cnn(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://edition.cnn.com");
        startActivity(intent);
    }

    public void football(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.prothomalo.com");
        startActivity(intent);

    }

    public void Kalerkonto(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.kalerkantho.com/");
        startActivity(intent);

    }

    public void noyadigonto(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.dailynayadiganta.com/");
        startActivity(intent);

    }

    public void ctgstockxchng(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.cse.com.bd/");
        startActivity(intent);

    }

    public void sharebd(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.sharemarketbd.com/");
        startActivity(intent);

    }

    public void shreBiz(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","https://stockbangladesh.com/");
        startActivity(intent);
    }

    public void Bitech(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://biztech24.com/");
        startActivity(intent);
    }

    public void ictnews(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.dailyictnews.com/");
        startActivity(intent);
    }

    public void techhunt(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","https://www.techtunes.com.bd/");
        startActivity(intent);
    }

    public void bd24(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","https://www.bd24live.com/bangla/");
        startActivity(intent);
    }

    public void jobcombd(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://www.job.com.bd/");
        startActivity(intent);
    }

    public void bdcareer(View view) {
        Intent intent = new Intent(this, NewsWebView_Activity.class);
        intent.putExtra("url","http://bd-career.com/");
        startActivity(intent);
    }
}
