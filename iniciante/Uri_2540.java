package iniciante;

import java.util.Scanner;
import java.io.IOException;

public class Uri_2540 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int n = 0;
        int[] v = new int[1];
        while (scan.hasNext()) {
            try{
                n = scan.nextInt();
                v = new int[n];
            }catch(Exception e){
                System.exit(0);
            }
            int aux = 0;
            for (int i = 0; i < v.length; i++) {
                v[i] = scan.nextInt();
                if (v[i] == 1) {
                    aux++;
                }
            }
            double aux1 = n * 0.6666666;
            if (aux >= aux1) {
                System.out.println("impeachment");
            } else {
                System.out.println("acusacao arquivada");
            }
        }
        scan.close();
    }
}
