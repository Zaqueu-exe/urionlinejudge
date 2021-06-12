package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1006 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("MEDIA = "+ df.format(((a*2)+(b*3)+(c*5))/10));
    }
}
