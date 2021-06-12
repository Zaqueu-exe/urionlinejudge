package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println("A="+df.format((a*a)*3.14159));
    }
}
