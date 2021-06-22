package iniciante;

import java.util.Scanner;

public class Uri_1172 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] x = new int[10];
        for(int i = 0; i < x.length; i++){
            x[i] = scan.nextInt();
            if(x[i] < 1){
                x[i] = 1;
            }
        }
        for(int i = 0; i < x.length; i++){
            System.out.println("X[" + i + "] = " + x[i]);
        }
    }
}
