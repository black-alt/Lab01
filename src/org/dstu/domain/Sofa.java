package org.dstu.domain;

public class Sofa extends Furniture {
    private int CountOfSeats;
    private String UpfoldingMechanizm;
    private boolean HaveArmrests;

    public Sofa() {
    }

    public Sofa(String[] line) {
        super(line[2], line[3], Integer.parseInt(line[1]));
        CountOfSeats = Integer.parseInt(line[4]);
        UpfoldingMechanizm = line[5];
        HaveArmrests = Boolean.parseBoolean(line[6]);
    }

    public int getCountOfSeats() {
        return CountOfSeats;
    }

    public void setCountOfSeats(int countOfSeats) {
        CountOfSeats = countOfSeats;
    }

    public String getUpfoldingMechanizm() {
        return UpfoldingMechanizm;
    }

    public void setUpfoldingMechanizm(String upfoldingMechanizm) {
        UpfoldingMechanizm = upfoldingMechanizm;
    }

    public boolean isHaveArmrests() {
        return HaveArmrests;
    }

    public void setHaveArmrests(boolean haveArmrests) {
        HaveArmrests = haveArmrests;
    }

    @Override
    public String toString() {
        return "Sofa: " + super.toString() +
                " | Count of seats: " +
                CountOfSeats +
                " | Upfolding mechanizm: " +
                UpfoldingMechanizm +
                " | Have armrests: " +
                HaveArmrests;
    }
}
