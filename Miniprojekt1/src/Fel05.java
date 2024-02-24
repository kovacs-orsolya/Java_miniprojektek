
import java.util.Scanner;

public class Fel05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérek egy szöveget:");
        String szoveg = sc.next();
        if (szoveg.equals(szoveg.toLowerCase())) {
            System.out.println("Az összes betű kisbetű.");
        } else if (szoveg.equals(szoveg.toUpperCase())) {
            System.out.println("Az összes betű nagybetű.");
        } else {
            System.out.println("Vegyesen vannak kis- és nagybetűk is.");
        }
    }
}
