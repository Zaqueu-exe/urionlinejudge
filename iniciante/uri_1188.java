package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class uri_1188 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double[][] m = new double[12][12];
        double soma = 0;
        int cont = 0, aux = m.length - 1, aux1 = 0;
        char o = scan.next().charAt(0);
        for(int i = 0; i < m.length; i++){
            for(int d = 0; d < m[i].length; d++){
                m[i][d] = scan.nextDouble();
                if(aux1 > d & aux < d){
                    soma += m[i][d];
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
