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
        countries.add(new Countries("Great Britain", "London", R.drawable.britain));
        countries.add(new Countries("Canada", "Ottawa", R.drawable.canada));
        countries.add(new Countries("Germany", "Berlin", R.drawable.germany));
        countries.add(new Countries("India", "New-Deli", R.drawable.india));
        countries.add(new Countries("Israel", "Tel-Aviv", R.drawable.israel));
        countries.add(new Countries("Italy", "Rome", R.drawable.italy));
        countries.add(new Countries("Japan", "Tokyo", R.drawable.japan));
        countries.add(new Countries("Mexico", "Mexico", R.drawable.mexico));
        countries.add(new Countries("Poland", "Warsaw", R.drawable.poland));
        countries.add(new Countries("Portugal", "Lisbon", R.drawable.portugal));
        countries.add(new Countries("Sweden", "Stockholm", R.drawable.sweden));
        countries.add(new Countries("Turkey", "Ankara", R.drawable.turkey));
        countries.add(new Countries("Uzbekistan", "Tashkent", R.drawable.uzbekistan));
        return countries;
    }
}