import java.util.Collections;

public class Fel06 {
    public static int maximum(int tomb[]) {
        int max = tomb[0];
        for (int szam : tomb) {
            if (szam > max) max = szam;
        }
        return max;
    }

    public static int minimum(int tomb[]) {
        int min = tomb[0];
        for (int szam : tomb) {
            if (szam < min) min = szam;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] tomb = {1, 6, 2, 3, 4, 8, 5, 9, 7, 0, 2};
        System.out.println("Legnagyobb szám: " + maximum(tomb));
        System.out.println("Legkisebb szám: " + minimum(tomb));
    }
}
