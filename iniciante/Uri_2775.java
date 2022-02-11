package iniciante;

import java.util.Scanner;

public class Uri_2775 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int[] ordem = new int[n];
            int[] segundo = new int[n];
            int tempo = 0;
            for (int i = 0; i < n; i++) {
                ordem[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                segundo[i] = scan.nextInt();
            }
            for (int p = 0; p < n; p++) {
                for (int i = 0; i < n - 1; i++) {
                    if (ordem[i] > ordem[i + 1]) {
                        tempo += segundo[i] + segundo[i + 1];
                        int aux = ordem[i + 1];
                        ordem[i + 1] = ordem[i];
                        ordem[i] = aux;
                        int aux1 = segundo[i + 1];
                        segundo[i + 1] = segundo[i];
                        segundo[i] = aux1;
                    }
                }
            }
            System.out.println(tempo);
        }
    }
}
