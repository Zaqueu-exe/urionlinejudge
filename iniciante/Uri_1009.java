package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1009 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        String nome = scan.next();
        double salario = scan.nextDouble();
        double vendas = scan.nextDouble();
        System.out.println("TOTAL = R$ "+ df.format(salario + (0.15 * vendas)));
    }
}
