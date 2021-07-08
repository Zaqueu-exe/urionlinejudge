package iniciante;

import java.util.Scanner;

public class Uri_2311 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n > 0){
            n--;
            String nome = scan.next();
            float peso = scan.nextFloat();
            float[] N = new float[7];
            float total = 0;
            float ma = 0, me = 10;
            for(int i = 0; i < N.length; i++){
                N[i] = scan.nextFloat();
                total = N[i] + total;
                if(N[i] > ma){
                    ma = N[i];
                }
                if(N[i] < me){
                    me = N[i];
                }
            }
            System.out.printf("%s%s%.2f\n", nome," ", (total-ma-me)*peso);
        }
    }
}
