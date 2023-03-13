package org.example.exercise7_2;

public enum Constants {
    COMPANY("Microsoft"), SALESTARGET(20000000);

    private int target;
    private String companyName;
    Constants(String companyName) {
        this.companyName = companyName;
    }

    Constants(int target) {
        this.target = target;
    }
    public int getTarget() {
        return target;
    }

    public String getCompanyName() {
        return companyName;
    }
}
