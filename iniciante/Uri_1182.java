package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1182{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c = scan.nextInt();
        DecimalFormat df = new DecimalFormat("0.0");
        char t = scan.next().charAt(0);
        double soma = 0;
        double[][] m = new double[12][12];
        for(int i = 0; i < m.length; i++){
            for(int p = 0; p < m[i].length; p++){
                m[i][p] = scan.nextDouble();
            }
        }
        for(int i = 0; i < m.length; i++){
            soma += m[i][c];
        }
        if(t == 'S'){
            System.out.println(df.format(soma));
        }else{
            System.out.println(df.format(soma/12));
        }
    }
}