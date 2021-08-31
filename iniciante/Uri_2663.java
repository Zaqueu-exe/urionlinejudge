package iniciante;

import java.util.Scanner;

public class Uri_2663 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] v = new int[n];
        int aux = 0, aux1 = 0;
        for(int i = 0; i < n; i++){
            v[i] = scan.nextInt();
            if(v[i] > aux){
                aux = v[i];
            }
        }
        while(k > aux1){
            for(int i = 0; i < v.length; i++){
                if(aux == v[i]){
                    v[i] = -1;
                    aux1++;
                }
            }
            aux = 0;
            for(int i = 0; i < v.length; i++){
                if(v[i] > aux){
                    aux = v[i];
                }
            }
        }
        System.out.println(aux1);
    }
}
