package iniciante;

import java.util.Scanner;

public class Uri_1174 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] a = new double [100];
        for(int i = 0; i < a.length; i++){
            a[i] = scan.nextDouble();
        }
        for(int i = 0; i < a.length; i++){
            if(a[i] <= 10.0){
                System.out.println("A[" + i + "] = " + a[i]);
            }
        }
    }
}
