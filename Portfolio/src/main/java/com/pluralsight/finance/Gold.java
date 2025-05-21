package com.pluralsight.finance;

// extends FixedAsset super class
public class Gold extends FixedAsset{
    private double weight;

    // constructors
    public Gold(String name, double marketValue, double weight) {
        super(name, marketValue);
        this.weight = weight;
    }

    // getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // method implemented from interface via super class
    @Override
    public double getValue() {
        return getMarketValue();
    }
}
