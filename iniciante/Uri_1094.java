package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1094 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat  df = new DecimalFormat("0.00");
        DecimalFormat  df1 = new DecimalFormat("0");
        float coelho = 0, sapo = 0, rato = 0, total, dados, cobaia, tipo;
        dados = scan.nextInt();
        for(int i = 0; i < dados; i++){
            cobaia = scan.nextFloat();
            tipo = scan.next().charAt(0);
            if(tipo == 'S'){
                sapo = sapo + cobaia;
            }else if(tipo == 'C'){
                coelho = coelho + cobaia;
            }else if(tipo == 'R'){
                rato = rato + cobaia;
            }
        }
        System.out.println("Total: " + df1.format((rato + coelho + sapo)) + " cobaias");
        System.out.println("Total de coelhos: "+ df1.format(coelho));
        System.out.println("Total de ratos: "+ df1.format(rato));
        System.out.println("Total de sapos: "+ df1.format(sapo));
        System.out.println("Percentual de coelhos: "+ df.format((100 * coelho)/(coelho + sapo + rato)) + " %");
        System.out.println("Percentual de ratos: "+ df.format((100 * rato)/(coelho + sapo + rato)) + " %");
        System.out.println("Percentual de sapos: "+ df.format((100 * sapo)/(coelho + sapo + rato)) + " %");

    }
}
