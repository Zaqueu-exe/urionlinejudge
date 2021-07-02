package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1963 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        System.out.println(df.format(((b-a)/a)*100) + "%");
    }
}
