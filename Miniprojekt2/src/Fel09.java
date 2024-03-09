public class Fel09 {
    public static void main(String[] args) {
        int[][] tomb;
        tomb = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) tomb[i][j] = i;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tomb[i][j] + " ");
            }
            System.out.println();
        }
    }
}
