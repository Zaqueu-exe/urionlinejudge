package iniciante;

import java.util.Scanner;

public class Uri_2520 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int[][] ma = new int[n][m];
            int movimentos = 0, linha2 = 0, coluna2 = 0, linha1 = 0, coluna1 = 0;
            for (int i = 0; i < ma.length; i++) {
                for (int t = 0; t < ma[i].length; t++) {
                    ma[i][t] = scan.nextInt();
                    if (ma[i][t] == 2) {
                        linha2 = i;
                        coluna2 = t;
                    }
                    if (ma[i][t] == 1) {
                        linha1 = i;
                        coluna1 = t;
                    }
                }
            }
            while (linha1 > linha2) {
                linha1--;
                movimentos++;
            }
            while (linha1 < linha2) {
                linha1++;
                movimentos++;
            }
            while (coluna1 > coluna2) {
                coluna1--;
                movimentos++;
            }
            while (coluna1 < coluna2) {
                coluna1++;
                movimentos++;
            }
            System.out.println(movimentos);
        }
    }
}
