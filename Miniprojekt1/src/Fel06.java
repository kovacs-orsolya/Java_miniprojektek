
import java.util.Arrays;

public class Fel06 {
    public static void egyenloseg(int[] t1, int[] t2) {
        System.out.println(Arrays.equals(t1, t2) ? "Egyenlőek" : "Nem egyenlőek");
    }

    public static void main(String[] args) {
        int[] tomb1 = new int[]{1, 2, 3, 4};
        int[] tomb2 = new int[]{1, 2, 3};
        int tomb3[] = {1, 2, 3, 4};
        int tomb4[] = {1, 2, 3, 4};
        egyenloseg(tomb1, tomb2);
        egyenloseg(tomb1, tomb3);
        egyenloseg(tomb3, tomb4);
    }
}

