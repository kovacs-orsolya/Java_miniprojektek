import java.util.Scanner;

public class Fel04 {
    public static void main(String[] args) {
        StringBuffer ujszo = new StringBuffer("aaabbbcc");
        int i = 0;
        while (i < ujszo.length()) {
            int j = i + 1;
            int db = 1;
            while (j < ujszo.length()) {
                if (ujszo.charAt(i) == ujszo.charAt(j)) {
                    ujszo.replace(j, ujszo.length(), ujszo.substring(j + 1));
                    db++;
                    continue;
                }
                j++;
            }
            if (db > 1) {
                ujszo.insert(i + 1, db);
                i = i + 2;
                continue;
            }
            i++;
        }
        System.out.println(ujszo);
    }
}
