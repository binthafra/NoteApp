package com.example.attention.gridview;

import android.arch.lifecycle.ViewModelStore;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    ArrayList<Cricketer> cricketers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView =findViewById(R.id.grid_View);
        cricketers=new ArrayList<>();

        CustomAdapter adapter =new  CustomAdapter(MainActivity.this, cricketers);
        gridView.setAdapter(adapter);

        setData();

        }

    private void setData() {

        Cricketer a=new Cricketer( R.drawable.a,"Shakib");
        Cricketer b=new Cricketer( R.drawable.b,"mushfiq");
        Cricketer c=new Cricketer( R.drawable.c,"Mash");
        Cricketer d=new Cricketer( R.drawable.d,"Nasir");

        cricketers.add(a);
        cricketers.add(b);
        cricketers.add(c);
        cricketers.add(d);
        cricketers.add(a);
        cricketers.add(b);
        cricketers.add(c);
        cricketers.add(d);

    }

}
