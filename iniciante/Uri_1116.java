package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1116 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        int qtd = scan.nextInt();
        float[] x = new float[qtd];
        float[] y = new float[qtd];

        for(int i = 0; i < qtd; i++){
            x[i] = scan.nextFloat();
            y[i] = scan.nextFloat();
        }

        for(int i = 0; i < qtd; i++){

            if(y[i] != 0){
                System.out.println(df.format(x[i]/y[i]));
            }else{
                System.out.println("divisao impossivel");
            }
        }


    }
}
