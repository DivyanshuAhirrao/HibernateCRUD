package domain;

// POJO class or JAVA bean Class or domain Class :

import org.hibernate.cfg.Configuration;

public class Laptop {
    private int modelNumber;
    private String laptopCompany;
    private int ramSize;
    private int romSize;
    private double laptopPrice;

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getLaptopCompany() {
        return laptopCompany;
    }

    public void setLaptopCompany(String laptopCompany) {
        this.laptopCompany = laptopCompany;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getRomSize() {
        return romSize;
    }

    public void setRomSize(int romSize) {
        this.romSize = romSize;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(double laptopPrice) {
        this.laptopPrice = laptopPrice;
    }
}
