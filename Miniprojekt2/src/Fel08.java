import java.util.Arrays;

public class Fel08 {
    public static void main(String[] args) {
        int[] tomb = {1, 6, 2, 3, 4, 8, 5, 9, 7, 0, 2};
        int csere;
        for (int i = 0; i < tomb.length - 1; i++) {
            for (int j = i; j < tomb.length; j++) {
                if (tomb[i] > tomb[j]) {
                    csere = tomb[i];
                    tomb[i] = tomb[j];
                    tomb[j] = csere;
                }
            }
        }
        System.out.println(Arrays.toString(tomb));
    }
}
