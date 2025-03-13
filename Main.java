package geometry.mains;

import geometry.shapes.Circle;
import java.util.Scanner;

public class Main {
    static String pewarna = "===============================";

    public static void printGaris() {
        System.out.println(pewarna);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String WHITE = "\u001B[0m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";
        String BLUE = "\u001B[94m";

        printGaris();

        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();

        printGaris();

        System.out.println("Nama: " + BLUE + nama + WHITE);
        System.out.println("NIM: " + BLUE + nim + WHITE);
        printGaris();

        Circle circle = new Circle();

        System.out.print("Isikan ID: ");
        int id = scanner.nextInt();
        circle.setId(id);

        System.out.print("Isikan Radius: ");
        double radius = scanner.nextDouble();
        circle.setRadius(radius);

        printGaris();
        circle.printDeskripsi();
        printGaris();

        scanner.close();
    }
}
