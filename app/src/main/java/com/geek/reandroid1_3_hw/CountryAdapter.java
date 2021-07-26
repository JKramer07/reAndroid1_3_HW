package com.geek.reandroid1_3_hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryAdapter.ViewHolder> {

    private ArrayList<Countries> countries = new ArrayList<>();

    public void setCountriesList(ArrayList<Countries> countriesList){
        this.countries = countriesList;
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(countries.get(position));
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView country, city;
        private ImageView countryIcon;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            country = itemView.findViewById(R.id.country_tv);
            city = itemView.findViewById(R.id.city_tv);
            countryIcon = itemView.findViewById(R.id.country_icon_iv);
        }

        public void onBind(Countries countries){
            country.setText(countries.getCountryName());
            city.setText(countries.getCityName());
            countryIcon.setImageResource(countries.getImage());
        }
    }
}
