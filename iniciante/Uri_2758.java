package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_2758 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        double c = scan.nextDouble();
        double d = scan.nextDouble();
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println("A = " + df.format(a) + ", B = " + df.format(b));
        System.out.println("C = " + df.format(c) + ", D = " + df.format(d));
        df = new DecimalFormat("0.0");
        System.out.println("A = " + df.format(a) + ", B = " + df.format(b));
        System.out.println("C = " + df.format(c) + ", D = " + df.format(d));
        df = new DecimalFormat("0.00");
        System.out.println("A = " + df.format(a) + ", B = " + df.format(b));
        System.out.println("C = " + df.format(c) + ", D = " + df.format(d));
        df = new DecimalFormat("0.000");
        System.out.println("A = " + df.format(a) + ", B = " + df.format(b));
        System.out.println("C = " + df.format(c) + ", D = " + df.format(d));
        df = new DecimalFormat("0.000E00");
        if (!df.format(a).contains("E-")) {
            System.out.print("A = " + df.format(a).replace("E", "E+"));
        } else {
            System.out.print("A = " + df.format(a));
        }
        if (!df.format(b).contains("E-")) {
            System.out.println(", B = " + df.format(b).replace("E", "E+"));
        } else {
            System.out.println(", B = " + df.format(b));
        }
        if (!df.format(c).contains("E-")) {
            System.out.print("C = " + df.format(c).replace("E", "E+"));
        } else {
            System.out.print("C = " + df.format(c));
        }
        if (!df.format(d).contains("E-")) {
            System.out.println(", D = " + df.format(d).replace("E", "E+"));
        } else {
            System.out.println(", D = " + df.format(d));
        }
        df = new DecimalFormat("0");
        System.out.println("A = " + df.format(a) + ", B = " + df.format(b));
        System.out.println("C = " + df.format(c) + ", D = " + df.format(d));
    }
}
