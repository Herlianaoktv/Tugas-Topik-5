package com.company;

public class Operasi{
    private final double tinggi;
    private final double sisi;

    public Operasi(double tinggi, double sisi){
        this.tinggi =tinggi;
        this.sisi =sisi;
    }

    public Operasi(double sisi){
        this(0,sisi);
    }

    public double getTinggi() {
        return tinggi;
    }
    public double getSisi() {
        return sisi;
    }
    public double luas(){
        if (tinggi == 0){
            return ((sisi * sisi) / 4) * Math.sqrt(3);
        }else {
            return (sisi * tinggi) / 2;
        }
    }
    public double keliling() {
        return sisi * 3;
    }
}