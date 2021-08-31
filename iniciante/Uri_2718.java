package iniciante;

import java.util.Scanner;

public class Uri_2718 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] numeros = new long[n];
        int l = 0;
        while (l < n) {
            String aux;
            String[] aux1;
            int aux2 = 0;
            numeros[l] = scan.nextLong();
            aux = Long.toBinaryString(numeros[l]);
            aux1 = aux.split("");
            numeros[l] = 0;
            for (int p = 0; p < aux1.length; p++) {
                if (aux1[p].equals("1")) {
                    aux2++;
                    if(aux2 > numeros[l]){
                        numeros[l] = aux2;
                    }
                } else {
                    aux2 = 0;
                }
            }
            l++;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
