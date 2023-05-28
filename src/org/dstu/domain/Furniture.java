package org.dstu.domain;

public abstract class Furniture implements IFurniture {
    private String Manufacturer;
    private String Color;
    private int Price;

    public Furniture() {
    }

    public Furniture(String Manufacturer, String Color, int Price) {
        this.Manufacturer = Manufacturer;
        this.Color = Color;
        this.Price = Price;
    }

    public Furniture(String[] line) {
        Manufacturer = line[1];
        Color = line[2];
        Price = Integer.parseInt(line[3]);
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
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
        String builder = "Manufacturer: " +
                Manufacturer +
                " | Color: " +
                Color +
                " | Price: " +
                Price;
        return builder;
    }
}
