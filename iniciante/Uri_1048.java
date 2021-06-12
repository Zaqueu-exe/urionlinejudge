package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1048 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        DecimalFormat df1 = new DecimalFormat("0");
        Scanner scan = new Scanner(System.in);
        float salario, aumento, taxa;
        salario = scan.nextFloat();

        if(salario > 0 & salario <= 400 ){
            taxa = 15;
        }else if(salario > 400.00 & salario <= 800.00 ){
            taxa = 12;
        }else if(salario > 800.00 & salario <= 1200.00 ){
            taxa = 10;
        }else if(salario > 1200.00 & salario <= 2000.00 ){
            taxa = 7;
        }else{
            taxa = 4;
        }
        aumento = salario * (taxa / 100);
        System.out.println("Novo salario: "+ df.format(salario + aumento));
        System.out.println("Reajuste ganho: "+ df.format(aumento));
        System.out.println("Em percentual: "+ df1.format(taxa)+" %");

    }
}
