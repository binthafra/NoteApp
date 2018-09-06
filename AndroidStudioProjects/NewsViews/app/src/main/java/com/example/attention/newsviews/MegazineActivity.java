package com.example.attention.newsviews;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MegazineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_megazine);
    }

    public void icttoday(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","http://icetoday.net/");
        startActivity(intent);
    }


    public void anannya(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","http://anannya.com.bd/");
        startActivity(intent);
    }

    public void weeklybichitra(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://en.wikipedia.org/wiki/Weekly_Bichitra");
        startActivity(intent);
    }

    public void dhakacourier(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://www.magzter.com/BD/Cosmos-Group/Dhaka-Courier/Art/297410");
        startActivity(intent);
    }

    public void starinsight(View view){
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://en.wikipedia.org/wiki/Star_Insight");
        startActivity(intent);
    }


    public void forum(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","http://www.bangladeshbrandforum.com/magazine/");
        startActivity(intent);
    }

    public void theStar(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://www.thedailystar.net/tags/magazine");
        startActivity(intent);
    }

    public void people(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://people.com/");
        startActivity(intent);
    }

    public void NaGeo(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://www.nationalgeographic.com/");
        startActivity(intent);
    }

    public void cosmopoliton(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://www.cosmopolitan.com/");
        startActivity(intent);
    }

    public void bhag(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://www.bhg.com/");
        startActivity(intent);
    }

    public void vouge(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://www.vogue.co.uk/?international");
        startActivity(intent);
    }

    public void time(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","http://time.com/");
        startActivity(intent);
    }

    public void harpermegazine(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://www.harpersbazaar.com/");
        startActivity(intent);
    }

    public void newyoker(View view) {

        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://subscribe.newyorker.com/subscribe/newyorker/117536?source=google_sem_int_int_12f6&mbid=google_sem_int_int_12f6&source=google_sem_can&mbid=cm_paid_google_sem_can_12f6_aud-455624572309:kwd-301842527652_brand_g_the%20new%20yorker_e_c_1t1&gclid=CjwKCAjwoMPcBRAWEiwAiAqZh9sjuKgVNnvVBZCg0-msZ0KUA1isvJ1K3C1nmC7wPGqJ9FMknrS5LhoCOYIQAvD_BwE");
        startActivity(intent);
    }

    public void familyCircle(View view) {
        Intent intent = new Intent(this, megazineWeb_view.class);
        intent.putExtra("url","https://www.familycircle.com/");
        startActivity(intent);
    }
}
