package com.aptechprojectsem3.currencyconverter;

public class CountryItem {

    public String countryName;
    public int flagImage;

    public CountryItem(String countryName, int flagImage) {
       this.countryName = countryName;
       this.flagImage = flagImage;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getFlagImage() {
        return flagImage;
    }
}
