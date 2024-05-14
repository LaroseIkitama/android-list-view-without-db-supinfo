package com.example.ikitama_larose_listview_pays_sans_db;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class myAdapter extends BaseAdapter {

    /*
     * NOMS: EBONGA IKITAMA
     * PRENOMS:Bellevie Larose
     * Classe:Master-PRG18-Sup'Info
     *
     * */
    Context context;
    ArrayList<String> dbName;
    ArrayList<Integer> dbImage;

    public myAdapter(Context context, ArrayList<String> dbName, ArrayList<Integer> dbImage) {
        this.context = context;
        this.dbName = dbName;
        this.dbImage = dbImage;
    }

    @Override
    public int getCount() {
        return dbName.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view= LayoutInflater.from(context).inflate(R.layout.countries_list,parent,false);
        ImageView img_country =view.findViewById(R.id.img_country);
        TextView tvName=view.findViewById(R.id.tvName);

        img_country.setImageResource(dbImage.get(position));
        tvName.setText(dbName.get(position));

        return view;
    }
}
