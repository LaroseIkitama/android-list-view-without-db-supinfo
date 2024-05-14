package com.example.ikitama_larose_listview_pays_sans_db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    /*
    * NOMS: EBONGA IKITAMA
    * PRENOMS:Bellevie Larose
    * Classe:Master-PRG18-Sup'Info
    *
    * */
    ListView lv_countries;
    ArrayList<String> dbName;
    ArrayList<Integer> dbImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_countries=findViewById(R.id.lv_countries);
        dbName=new ArrayList<>();
        dbImage=new ArrayList<>();

        //add names of countries
        dbName.add("Algerie");
        dbName.add("Andorra");
        dbName.add("Argentine");
        dbName.add("Belgique");
        dbName.add("Congo");
        dbName.add("Egypt");
        dbName.add("Italie");
        dbName.add("Japon");
        dbName.add("Russie");
        dbName.add("Afrique du Sud");
        dbName.add("Corée du Sud");
        dbName.add("Espagne");

        //add images links
        dbImage.add(R.drawable.algeria);
        dbImage.add(R.drawable.andorra);
        dbImage.add(R.drawable.argentina);
        dbImage.add(R.drawable.belgium);
        dbImage.add(R.drawable.congo);
        dbImage.add(R.drawable.egypt);
        dbImage.add(R.drawable.italy);
        dbImage.add(R.drawable.japan);
        dbImage.add(R.drawable.russian_federation);
        dbImage.add(R.drawable.south_africa);
        dbImage.add(R.drawable.south_korea);
        dbImage.add(R.drawable.spain);

        myAdapter myAdapter=new myAdapter(MainActivity.this,dbName,dbImage);
        lv_countries.setAdapter(myAdapter);
    }
}