package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1181 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[][] m = new float[12][12];
        DecimalFormat df = new DecimalFormat("0.0");
        int l = scan.nextInt();
        char t = scan.next().charAt(0);
        float total = 0;
        System.out.println(t);
        for(int i = 0; i < m.length; i++){
            for(int k = 0; k <m[i].length; k++){
                m[i][k] = scan.nextFloat();
            }
        }
        for(int i = 0; i < m.length; i++){
            total = total + m[l][i];
        }
        if(t == 'S'){
            System.out.println(df.format(total));
        }else{
            System.out.println(df.format((total/12)));
        }
    }
}
