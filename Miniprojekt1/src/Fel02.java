
import java.util.Scanner;

public class Fel02 {
    public static void ellenoriz(String password){
        int darab = 0;
        Scanner sc = new Scanner(System.in);
        while (darab < 3) {
            System.out.print("Kérem a jelszót:");
            String szoveg = sc.nextLine();
            darab++;
            if (szoveg.equals(password)) {
                System.out.println("Belépés sikeres volt!");
                break;
            } else {
                if (darab == 3) {
                    System.out.println("Hibás kód! Próbálja meg később");
                    break;
                }
            }
            System.out.println("Hibás kód! Kérem próbálja meg újra!");
        }
    }
    public static void main(String[] args) {
        String jelszo = new String("alma");
        ellenoriz(jelszo);
    }
}