package iniciante;

import java.util.Scanner;

public class Uri_1021 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();
        int[] cedulas = {100, 50, 20, 10, 5, 2};
        double[] moedas = {100, 50, 25, 10, 5, 1};
        System.out.println("NOTAS:");
        for(int i = 0; i < cedulas.length; i++){
            int quantidade = 0;
            while(total - cedulas[i] >= 0){
                quantidade++;
                total = total - cedulas[i];
            }
            System.out.println(quantidade + " nota(s) de R$ "+ cedulas[i]+".00");
        }


        int[] quantidade = new int[6];
        total = total*100;
        System.out.println("MOEDAS:");
        for(int i = 0; i < moedas.length; i++){

            while(total - moedas[i] >= 0){
                quantidade[i] = quantidade[i]+1;
                total = total - moedas[i];
            }
        }
            System.out.println(quantidade[0]+" moeda(s) de R$ 1.00");
            System.out.println(quantidade[1]+" moeda(s) de R$ 0.50");
            System.out.println(quantidade[2]+" moeda(s) de R$ 0.25");
            System.out.println(quantidade[3]+" moeda(s) de R$ 0.10");
            System.out.println(quantidade[4]+" moeda(s) de R$ 0.05");
            System.out.println(quantidade[5]+" moeda(s) de R$ 0.01");
    }
}
