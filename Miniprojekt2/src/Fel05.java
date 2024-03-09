import java.util.Arrays;

public class Fel05 {
    public static void main(String[] args) {
        int tomb[] = {1, 6, 2, 3, 4, 8, 5, 9, 7, 0, 2};
        int csere = tomb[0];
        tomb[0] = tomb[tomb.length - 1];
        tomb[tomb.length - 1] = csere;
        System.out.println(Arrays.toString(tomb));
    }
}
