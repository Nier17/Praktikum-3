package geometry.shapes;

import java.util.Scanner;

public class Circle {
    private int id;
    private double radius;
    private final int pembilang = 22;
    private final int penyebut = 7;

    public Circle() {
        this.id = 0;
        this.radius = 0.0;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getKeliling() {
        return (2 * pembilang * radius) / penyebut;
    }

    public double getLuas() {
        return (pembilang * radius * radius) / (penyebut * penyebut);
    }

    public void printDeskripsi() {
        System.out.println("ID: " + id);
        System.out.println("Radius: " + radius);
        System.out.println("Keliling: " + getKeliling());
        System.out.println("Luas: " + getLuas());
    }
}