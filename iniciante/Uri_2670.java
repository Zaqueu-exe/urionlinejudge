package iniciante;

import java.util.Scanner;

public class Uri_2670 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] v = new int[3];
        int[] aux = new int[3];
        int tt = 1000000000;
        for(int i = 0; i < 3; i ++){
            v[i] = scan.nextInt();
            v[i] *= 2; 
        }
        aux[0] = v[1] + v[2]*2;
        aux[1] = v[0] + v[2];
        aux[2] = v[1] + v[0]*2;
        for(int i = 0; i < 3; i ++){
            if(aux[i] < tt){
                tt = aux[i];
            }
        }
        System.out.println(tt);
    }
}
