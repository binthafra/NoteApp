package com.example.attention.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CustomAdapter extends BaseAdapter {
    Context context;
    ArrayList<Cricketer> arrayList;

    public CustomAdapter(Context context, ArrayList<Cricketer> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View custom_View = inflater.inflate(R.layout.grid_custom,null);

        ImageView imageView =custom_View.findViewById(R.id.image1);
        TextView textView =custom_View.findViewById(R.id.name);

        imageView.setImageResource(arrayList.get(position).getImageID());
        textView.setText(arrayList.get(position).getName());
         return custom_View;
    }

}
