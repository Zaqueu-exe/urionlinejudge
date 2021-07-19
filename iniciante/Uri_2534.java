package iniciante;

import java.util.Scanner;

public class Uri_2534 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int q = scan.nextInt();
        int[] v = new int[n];
        int[] l = new int[q];
        do {
            for (int i = 0; i < v.length; i++) {
                v[i] = scan.nextInt();
            }
            for (int i = 0; i < l.length; i++) {
                l[i] = scan.nextInt();
                l[i] = l[i] - 1;
            }

            for (int i = 0; i < v.length; i++) {
                for (int p = 0; p < v.length - 1; p++) {
                    int aux;
                    if (v[p] < v[p + 1]) {
                        aux = v[p + 1];
                        v[p + 1] = v[p];
                        v[p] = aux;
                    }

                }
            }
            for (int i = 0; i < l.length; i++) {
                System.out.println(v[l[i]]);
            }
            try{
                n = scan.nextInt();
                q = scan.nextInt();
                v = new int[n];
                l = new int[q];
            }catch(Exception e){
                System.exit(0);
            }
        } while (scan.hasNext());
    }
}
