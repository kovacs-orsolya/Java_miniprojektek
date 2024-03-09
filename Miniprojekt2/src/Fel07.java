public class Fel07 {
    public static void main(String[] args) {
        int[] tomb = {1, 2, 3, 0, 1, 4, 2, 5};
        for (int i = 0; i < tomb.length - 1; i++) {
            int db = 1;
            for (int j = i + 1; j < tomb.length; j++) {
                if (tomb[i] == tomb[j])
                    db++;
            }
            if (db > 1) System.out.println(tomb[i]);
        }
    }
}
