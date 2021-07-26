package com.geek.reandroid1_3_hw;

public class Countries {

    private String countryName, cityName;
    private int image;

    public Countries(String countryName, String cityName, int image) {
        this.countryName = countryName;
        this.cityName = cityName;
        this.image = image;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
