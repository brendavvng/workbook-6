package com.pluralsight.finance;

// abstract Super class implementing interface
public abstract class FixedAsset implements Valuable {
    private String name;
    private double marketValue;

    // constructors
    public FixedAsset(String name, double marketValue) {
        this.name = name;
        this.marketValue = marketValue;
    }
    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarketValue() {
        return marketValue;
    }

    public void setMarketValue(double marketValue) {
        this.marketValue = marketValue;
    }

    // implementing interface method
    @Override
    public double getValue() {
        return marketValue;
    }

}
