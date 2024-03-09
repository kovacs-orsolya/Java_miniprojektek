import java.util.Scanner;

public class Fel01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Szó: ");
        String szo = sc.nextLine();
        System.out.println(szo.charAt(0));
        System.out.println(szo.charAt(szo.length() - 1));
    }
}
