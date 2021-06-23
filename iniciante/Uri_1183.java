package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1183 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char o = scan.next().charAt(0);
        int cont = 0;
        DecimalFormat df = new DecimalFormat("0.0");
        double[][] m = new double[12][12];
        double soma = 0;
        for(int i = 0; i < m.length; i++){
            for(int g = 0; g < m[i].length; g++){
                m[i][g] = scan.nextDouble();
                if(g > i){
                    soma += m[i][g];
                    cont++;
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
