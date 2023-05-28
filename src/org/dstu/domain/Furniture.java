package org.dstu.domain;

public abstract class Furniture implements IFurniture {
    private String Weight;
    private String Color;
    private int Price;

    public Furniture() {
    }

    public Furniture(String Weight, String Color, int Price) {
        this.Weight = Weight;
        this.Color = Color;
        this.Price = Price;
    }

    public Furniture(String[] line) {
        Price = Integer.parseInt(line[1]);
        Weight = line[2];
        Color = line[3];
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    @Override
    public String toString() {
        String builder = "Weight: " +
                Weight +
                " | Color: " +
                Color +
                " | Price: " +
                Price;
        return builder;
    }
}
