package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1184 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        char o = scan.next().charAt(0);
        int cont = 0;
        double soma = 0;
        double[][] m = new double[12][12];
        for(int i = 0; i < m.length; i++){
            for(int s = 0; s < m[i].length; s++){
                m[i][s] = scan.nextDouble();
                if(!(s >= i)){
                    soma += m[i][s];
                    cont ++;
                }
            }
        }
        if(o == 'S'){
            System.out.println(df.format(soma));
        }else{
            System.out.println(df.format(soma/cont));
        }
    }
}
