
import java.util.Scanner;

public class Fel03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az első számot:");
        double szam1 = sc.nextInt();
        System.out.print("Kérem a második számot:");
        double szam2 = sc.nextInt();
        boolean feltetel = true;
        while (feltetel) {
            System.out.println("Enter 1 for addition\n" +
                    "Enter 2 for subtraction\n" +
                    "Enter 3 for multiplication\n" +
                    "Enter 4 for division\n" +
                    "Enter 5 to Exit");
            int muvelet = sc.nextInt();
            switch (muvelet) {
                case 1:
                    double osszeg = szam1 + szam2;
                    System.out.println("Eredmény:" + osszeg);
                    break;
                case 2:
                    double kulonbseg = szam1 - szam2;
                    System.out.println("Eredmény:" + kulonbseg);
                    break;
                case 3:
                    double szorzat = szam1 * szam2;
                    System.out.println("Eredmény:" + szorzat);
                    break;
                case 4:
                    double hanyados = szam1 / szam2;
                    System.out.printf("Eredmény: %.2f \n",hanyados);
                    break;
                case 5:
                    feltetel = false;
                    break;
            }
        }
    }
}
