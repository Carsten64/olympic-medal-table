package com.carsten.model;

public class Country {
    private String name;
    private String isoCode;
    private int gold;
    private int silver;
    private int bronze;
    private int total;

    public Country(String name, String isoCode, int gold, int silver, int bronze){
        this.name = name;
        this.isoCode = isoCode;
        this.gold = gold;
        this.silver = silver;
        this.bronze = bronze;
        this.total = gold + silver + bronze;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getSilver() {
        return silver;
    }

    public void setSilver(int silver) {
        this.silver = silver;
    }

    public int getBronze() {
        return bronze;
    }

    public void setBronze(int bronze) {
        this.bronze = bronze;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
