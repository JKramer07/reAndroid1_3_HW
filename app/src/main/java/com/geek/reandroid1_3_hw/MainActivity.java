package com.geek.reandroid1_3_hw;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView countryRecycler;
    private CountryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupCountryRecycler();
    }

    private void setupCountryRecycler(){
        countryRecycler = findViewById(R.id.country_rv);
        adapter = new CountryAdapter();
        countryRecycler.setAdapter(adapter);
        adapter.setCountriesList(getCountriesList());
    }

    private ArrayList<Countries> getCountriesList(){
        ArrayList<Countries> countries = new ArrayList<>();
        countries.add(new Countries("Kyrgyzstan", "Bishkek", R.drawable.kg));
        countries.add(new Countries("Korea", "Seoul", R.drawable.kr));
        countries.add(new Countries("Russia", "Moscow", R.drawable.ru));
        countries.add(new Countries("Ukraine", "Kiev", R.drawable.ua));
        countries.add(new Countries("Kazakhstan", "Astana", R.drawable.kz));
        countries.add(new Countries("USA", "Washington", R.drawable.usa));
        return countries;
    }
}