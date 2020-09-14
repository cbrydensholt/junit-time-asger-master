package com.company;

abstract class orbitalObject {

    String name;
    double lengthOfYear;
    int size;

    public orbitalObject(String name, double lengthOfYear, int size) {
        this.name = name;
        this.lengthOfYear = lengthOfYear;
        this.size = size;
    }

    public orbitalObject() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLengthOfYear() {
        return lengthOfYear;
    }

    public void setLengthOfYear(double lengthOfYear) {
        this.lengthOfYear = lengthOfYear;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
