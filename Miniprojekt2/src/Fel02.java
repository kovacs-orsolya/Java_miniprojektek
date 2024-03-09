import java.util.Scanner;

public class Fel02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Szó: ");
        String szo = sc.nextLine();
        String ujszo = new String();
        for (int i = 0; i < szo.length(); i++) {
            if (szo.charAt(i) == 'a') {
                ujszo += '*';
            } else {
                ujszo += szo.charAt(i);
            }
        }
        System.out.println("új szó: " + ujszo);
    }
}
