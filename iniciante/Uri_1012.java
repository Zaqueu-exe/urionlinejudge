package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        System.out.println("TRIANGULO: "+ df.format((a*c)/2));
        System.out.println("CIRCULO: "+ df.format((c*c)*3.14159));
        System.out.println("TRAPEZIO: "+ df.format(((a+b)*c)/2));
        System.out.println("QUADRADO: "+ df.format(b*b));
        System.out.println("RETANGULO: "+ df.format(b*a));
    }
}
