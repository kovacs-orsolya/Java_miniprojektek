package Bonusz;

import java.util.Scanner;

public class Fel1 {
    public static void main(String[] args) {
        int alapar = 30;
        System.out.print("""
                Válassza ki milyen kávét szeretne:
                1. Pohár nélkül
                2. Dupla cukorral
                3. Habos kávé
                """);
        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        switch (szam) {
            case 1:
                alapar += 20;
                break;
            case 2:
                alapar += 50;
                break;
            case 3:
                alapar -= 10;
                break;
        }
        System.out.println("Kérem fizessen " + alapar + " ft-ot.");
    }
}
