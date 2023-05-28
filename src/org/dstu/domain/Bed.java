package org.dstu.domain;

public class Bed extends Furniture {
    private String Size;
    private boolean HaveHeadboard;
    private String mattressType;

    public Bed() {
    }

    public Bed(String[] line) {
        super(line[2], line[3], Integer.parseInt(line[1]));
        Size = line[4];
        HaveHeadboard = Boolean.parseBoolean(line[5]);
        mattressType = line[6];
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public boolean isHaveHeadboard() {
        return HaveHeadboard;
    }

    public void setHaveHeadboard(boolean haveHeadboard) {
        HaveHeadboard = haveHeadboard;
    }

    public String getMattressType() {
        return mattressType;
    }

    public void setMattressType(String mattressType) {
        this.mattressType = mattressType;
    }

    @Override
    public String toString() {
        return "Bed. " + super.toString() +
                " | Size: " +
                Size +
                " | Have headboard: " +
                HaveHeadboard +
                " | Mattress type: " +
                mattressType;
    }
}
