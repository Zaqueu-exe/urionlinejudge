package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1011 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double a = scan.nextDouble();
        System.out.println("VOLUME = "+ df.format((4.0/3.0)*3.14159*(a*a*a)));
    }
}
