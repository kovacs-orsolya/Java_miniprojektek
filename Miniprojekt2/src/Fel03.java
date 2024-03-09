import java.util.Scanner;

public class Fel03 {
    public static void main(String[] args) {
        StringBuffer ujszo = new StringBuffer("ababbcdc");
        for (int i = 0; i < ujszo.length(); i++) {
            int j = i + 1;
            while (j < ujszo.length()) {
                if (ujszo.charAt(i) == ujszo.charAt(j)) {
                    ujszo.replace(j, ujszo.length(), ujszo.substring(j + 1));
                    continue;
                }
                j++;
            }
        }
        System.out.println(ujszo);
    }
}
