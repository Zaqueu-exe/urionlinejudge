package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1064 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        double[] numero = new double[6];
        int quat=0;
        double media=0;
        numero[0] = scan.nextDouble();
        numero[1] = scan.nextDouble();
        numero[2] = scan.nextDouble();
        numero[3] = scan.nextDouble();
        numero[4] = scan.nextDouble();
        numero[5] = scan.nextDouble();
        for(int i = 0; i < numero.length; i++){
            if(numero[i] > -1 ){
                media = media + numero[i];
                quat++;
            }
        }
        System.out.println(quat + " valores positivos");
        System.out.println(df.format(media/quat));
    }
}
