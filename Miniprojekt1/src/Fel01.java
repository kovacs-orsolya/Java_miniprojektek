
import java.util.Scanner;

public class Fel01 {
    public static void main(String[] args) {
        int szam = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Kérek egy 1 és 10 közötti számot: ");
            szam = sc.nextInt();
            if (szam >= 1 && szam <= 10) {
                break;
            } else {
                System.out.println("A szám nincs 1 és 10 között!");
            }
        }
        for (int i = 1; i <= 10; i++) {
            int szorzat = szam * i;
            System.out.println(szam + "x" + i + "=" + szorzat);
        }
    }
}