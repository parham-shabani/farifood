package ir.ac.kntu;

import java.util.ArrayList;

public class Foods {
    private ArrayList<String> foodNames = new ArrayList<>();

    private ArrayList<Integer> kfcFoodPrices = new ArrayList<>();

    private ArrayList<Integer> mcDonaldFoodPrices = new ArrayList<>();

    private ArrayList<Integer> atawichFoodPrices = new ArrayList<>();

    private ArrayList<Integer> ferikasifFoodPrices = new ArrayList<>();

    public Foods() {
        func();
    }

    public Foods(ArrayList<Integer> kfcFoodPrices, ArrayList<Integer> mcDonaldFoodPrices,
                 ArrayList<Integer> atawichFoodPrices, ArrayList<Integer> ferikasifFoodPrices) {
        this.kfcFoodPrices = kfcFoodPrices;
        this.mcDonaldFoodPrices = mcDonaldFoodPrices;
        this.atawichFoodPrices = atawichFoodPrices;
        this.ferikasifFoodPrices = ferikasifFoodPrices;
    }

    public void func() {
        foodNames.add(0,"Burguer");
        foodNames.add(1,"Pizza");
        foodNames.add(2,"Fried Chicken");
        foodNames.add(3,"French fries");

        kfcFoodPrices.add(0, null);
        kfcFoodPrices.add(1,62000);
        kfcFoodPrices.add(2,49000);

        mcDonaldFoodPrices.add(0,68000);
        mcDonaldFoodPrices.add(1,67000);
        mcDonaldFoodPrices.add(2,48000);

        atawichFoodPrices.add(0,49000);
        atawichFoodPrices.add(1,55000);
        atawichFoodPrices.add(2,52000);

        ferikasifFoodPrices.add(0,30000);
        ferikasifFoodPrices.add(1,null);
        ferikasifFoodPrices.add(2,null);
        ferikasifFoodPrices.add(3,25000);
    }

    public ArrayList<String> getFoodNames() {
        return foodNames;
    }

    public void setFoodNames(ArrayList<String> foodNames) {
        this.foodNames = foodNames;
    }

    public ArrayList<Integer> getKfcFoodPrices() {
        return kfcFoodPrices;
    }

    public void setKfcFoodPrices(ArrayList<Integer> kfcFoodPrices) {
        this.kfcFoodPrices = kfcFoodPrices;
    }

    public ArrayList<Integer> getMcDonaldFoodPrices() {
        return mcDonaldFoodPrices;
    }

    public void setMcDonaldFoodPrices(ArrayList<Integer> mcDonaldFoodPrices) {
        this.mcDonaldFoodPrices = mcDonaldFoodPrices;
    }

    public ArrayList<Integer> getAtawichFoodPrices() {
        return atawichFoodPrices;
    }

    public void setAtawichFoodPrices(ArrayList<Integer> atawichFoodPrices) {
        this.atawichFoodPrices = atawichFoodPrices;
    }

    public ArrayList<Integer> getFerikasifFoodPrices() {
        return ferikasifFoodPrices;
    }

    public void setFerikasifFoodPrices(ArrayList<Integer> ferikasifFoodPrices) {
        this.ferikasifFoodPrices = ferikasifFoodPrices;
    }
}

