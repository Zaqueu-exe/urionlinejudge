package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1190 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double[][] m = new double[12][12];
        double soma = 0;
        int cont = 0, aux = m.length-1, aux1 = 0;
        char o = scan.next().charAt(0);
        for(int i = 0; i <m.length; i++){
            for(int w = 0; w < m[i].length; w++){
                m[i][w] = scan.nextDouble();
                if(w > aux & w > aux1){
                    soma += m[i][w];
                    cont++;
                }
            }
            aux--;
            aux1++;
        }
        if(o == 'S'){
            System.out.println(df.format(soma));
        }else{
            System.out.println(df.format(soma/cont));
        }
    }
}
