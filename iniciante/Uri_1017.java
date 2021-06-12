package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1017 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double t = scan.nextDouble();
        double v = scan.nextDouble();
        System.out.println(df.format((v*t)/12));
    }
}
