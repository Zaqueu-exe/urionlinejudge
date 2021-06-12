package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1008 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int a = scan.nextInt();
        int b = scan.nextInt();
        double c = scan.nextDouble();
        System.out.println("NUMBER = "+ a);
        System.out.println("SALARY = U$ "+ df.format(b*c));
    }
}
