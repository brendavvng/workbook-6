package com.pluralsight.finance;

// extends FixedAsset super class
public class Jewelry extends FixedAsset{
    private double karat;

    // constructor
    public Jewelry(String name, double marketValue, double karat) {
        super(name, marketValue);
        this.karat = karat;
    }

    // getters and setters
    public double getKarat() {
        return karat;
    }

    public void setKarat(double karat) {
        this.karat = karat;
    }


    // implementing interface methods via superclass
    @Override
    public double getValue() {
        return 0;
    }
}
