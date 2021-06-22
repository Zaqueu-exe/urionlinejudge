package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1178 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        double[] n = new double[100];
        n[0] = scan.nextDouble();
        for(int i = 0; i < n.length - 1; i++){
            System.out.println("N[" + i + "] = " + df.format(n[i]));
            n[i + 1] = n[i] / 2;
        }
        System.out.println("N[" + 99 + "] = " + df.format(n[99]));
    }
}