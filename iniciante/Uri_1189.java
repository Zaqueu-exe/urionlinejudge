package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1189 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double[][] m = new double[12][12];
        double soma = 0;
        int cont = 0, aux = 0, aux1 = m.length - 1;
        char o = scan.next().charAt(0);
        for(int i = 0; i < m.length; i++){
            for(int f = 0; f < m[i].length; f++){
                m[i][f] = scan.nextInt();
                if(f < aux1 & f < aux){
                    soma += m[i][f];
                    cont++;
                }
            }
            aux++;
            aux1--;
        }
        if(o == 'S'){
            System.out.println(df.format(soma));
        }else{
            System.out.println(df.format(soma/cont));
        }
    }
}
