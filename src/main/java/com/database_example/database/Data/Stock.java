package com.database_example.database.Data;

public class Stock {
    //@JsonProperty
    double c;
    //@JsonProperty
    double o;
    //@JsonProperty
    double h;
    //@JsonProperty
    double l;

    public Stock() {

    }

    public Stock(double c, double h, double l, double o) {
        this.c = c;
        this.o = o;
        this.h = h;
        this.l = l;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getO() {
        return o;
    }

    public void setO(double o) {
        this.o = o;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public String toString() {
        return "Opening Price: " + this.getO() +
                "\nHighest in Day: " + this.getH() +
                "\nLowest in Day: " + this.getL() +
                "\nClosing Price: " + this.getC();
    }
}
