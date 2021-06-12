package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1051 {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner scan = new Scanner(System.in);
        float salario, imposto = 0;
        salario = scan.nextFloat();

        if(salario >= 0 &salario <= 2000.0){
            System.out.println("Isento");
        }
        salario = salario - 2000;
        if(salario >= 0 & salario <=1000){
            imposto = (salario*8)/100;
        }else if(salario >= 1000.01 & salario <= 2500){
            salario = salario - 1000;
            imposto = 80 + ((salario*18)/100);
        }else if(salario >= 2500.01){
            salario = salario - 2500;
            System.out.println(salario);
            imposto = 350+ ((salario*28)/100);
        }

        if(imposto != 0){
            System.out.println("R$ "+ df.format(imposto));
        }
    }
}
