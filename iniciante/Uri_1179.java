package iniciante;

import java.util.Scanner;

public class Uri_1179 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = new int[15];
        int[] p = new int[5];
        int[] im = new int[5];
        int comP = 0, comI = 0; 
        for(int i = 0; i < x.length; i++){
            x[i] = scan.nextInt();
            if(x[i] % 2 != 0){
                im[comI] = x[i];
                comI++;
            }else{
                p[comP] = x[i];
                comP++;
            }
            if(comI == 5){
                for(int k = 0; k < comI; k++){
                    System.out.println("impar[" + k + "] = " + im[k]);
                }
                comI = 0;
            }
            if(comP == 5){
                for(int q = 0; q < comP; q++){
                    System.out.println("par[" + q + "] = " + p[q]);
                }
                comP = 0;
            }
        }
        for(int k = 0; k < comI; k++){
            System.out.println("impar[" + k + "] = " + im[k]);
        
        }for(int k = 0; k < comP; k++){
            System.out.println("par[" + k + "] = " + p[k]);
        }
        
    }
}
