package Bonusz;

import java.util.Scanner;

import static java.lang.Math.random;

public class Fel2 {
    public static void main(String[] args) {
        int randszam = (int) (random() * 100) + 1;
        Scanner sc = new Scanner(System.in);
        int darab = 1;
        while (true) {
            System.out.println("Tippeljen: ");
            int szam = sc.nextInt();
            if (szam == randszam) {
                System.out.printf("Eltalálta %1s lépés után! A szám %1s.", darab, randszam);
                break;
            } else {
                if (szam > randszam) {
                    darab++;
                    System.out.println("sok – a szám kisebb");
                } else {
                    darab++;
                    System.out.println("kevés – a szám nagyobb");
                }
            }
        }
    }
}
