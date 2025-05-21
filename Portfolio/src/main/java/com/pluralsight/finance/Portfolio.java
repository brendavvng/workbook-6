package com.pluralsight.finance;

import java.util.ArrayList;
import java.util.List;

public class Portfolio implements Valuable {

    private String name;
    private String owner;
    // this list will store the assets
    private List<Valuable> assets = new ArrayList<>();

    // constructor
    public Portfolio() {
        // initializing list - holds valuable items
        this.assets = new ArrayList<>();
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // this will add the valuable asset
    public void add(Valuable asset) {
        assets.add(asset);
    }

    // get value
    // return the net value of all assets
    @Override
    public double getValue() {
        double total = 0;
        // for loop to go through assets
        for (Valuable asset : assets){
            // add assets value
            total += asset.getValue();
        }
        return total;
    }


    // get most valuable
    // return the asset that has the highest value
    public double getMostValuable(){
        // if no assets, returns null
        if (assets.isEmpty()) return 0;
        // starts at first asset
        double highestValue = assets.get(0).getValue();

        // for loop to go through assets to find highest value
        for (Valuable asset : assets) {
            if (asset.getValue() > highestValue) {
                highestValue = asset.getValue();
            }
        }
        return highestValue;
    }


    // get least valuable
    // return the asset that has the lowest value,
    // possibly a credit card with the highest balance
    public double getLeastValuable() {
        if (assets.isEmpty()) return 0;
        // starts at first asset
        double lowestValue = assets.get(0).getValue();
        // for loop to go through assets to find lowest value
        for (Valuable asset : assets) {
            if (asset.getValue() < lowestValue) {
                lowestValue = asset.getValue();
            }
        }
        return lowestValue;
    }


}
