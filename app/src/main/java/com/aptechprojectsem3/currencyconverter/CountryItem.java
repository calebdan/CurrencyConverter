package com.aptechprojectsem3.currencyconverter;

public class CountryItem {

    private String countryName;
    private int flagImage;

    private CountryItem(String countryName, int flagImage) {
       this.countryName = countryName;
       this.flagImage = flagImage;
    }

    private String getCountryName() {
        return countryName;
    }

    private int getFlagImage() {
        return flagImage;
    }
}
