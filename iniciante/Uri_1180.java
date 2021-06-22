package iniciante;

import java.util.Scanner;

public class Uri_1180 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] x = new int[n];
        int p = 0, menor = 10000000;
        for(int i = 0; i < x.length; i++){
            x[i] = scan.nextInt();
            if(x[i] < menor){
                menor = x[i];
                p = i;
            }
        }
        System.out.println("Menor valor: "+ menor);
        System.out.println("Posicao: "+ p);
    }
}
