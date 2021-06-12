package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1010 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int aa = scan.nextInt();
        int na = scan.nextInt();
        double pa = scan.nextDouble();

        int ab = scan.nextInt();
        int nb = scan.nextInt();
        double pb = scan.nextDouble();

        System.out.println("VALOR A PAGAR: R$ "+df.format((na * pa)+(nb*pb)));
    }
}
