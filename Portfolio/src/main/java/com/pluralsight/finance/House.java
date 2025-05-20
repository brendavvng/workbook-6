package com.pluralsight.finance;

// extends FixedAsset super class
public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    // constructor
    public House(String name, double marketValue, int yearBuilt, int bedrooms, int squareFeet) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.bedrooms = bedrooms;
        this.squareFeet = squareFeet;
    }

    // getters and setters
    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }



    // method implemented from interface via super class
    @Override
    public double getValue() {
        return 0;
    }
}
