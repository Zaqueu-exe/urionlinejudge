package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1187 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double[][] m = new double[12][12];
        int cont = 0, aux = m.length - 1;
        double soma = 0;
        char o = scan.next().charAt(0);
        for(int i = 0; i < m.length; i++){
            for(int q = 0; q < m[i].length; q++){
                m[i][q] = scan.nextDouble();
                if(q > i & q < aux){
                    soma += m[i][q];
                    cont++;
                }
            }
            aux--;
        }
        if(o == 'S'){
            System.out.println(df.format(soma));
        }else{
            System.out.println(df.format(soma/cont));
        }
    }
}
