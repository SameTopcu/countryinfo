package com.example.countryinfo;

public class Singleton {
    private country selectedcountry;
    private static Singleton singleton;
    private Singleton() {

    }
    public country getSelectedcountry() {
        return selectedcountry;
    }

    public void setChosencountry(country selectedcountry) {
        this.selectedcountry = selectedcountry;
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }

        return singleton;

    }
}
