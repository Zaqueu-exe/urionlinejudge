package iniciante;

import java.util.Scanner;

public class Uri_1961 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        int n = scan.nextInt();
        int[] f = new int[n];

        for(int i = 0; i < f.length; i++){
            f[i] = scan.nextInt();
        }
        for(int i = 0; i < f.length-1; i++){
            if(f[i+1] > f[i]){
                if((f[i] + p) < f[i+1]){
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            }else{
                if((f[i] - p) > f[i+1]){
                    System.out.println("GAME OVER");
                    System.exit(0);
                }
            }
        }
        System.out.println("YOU WIN");
    }
}
