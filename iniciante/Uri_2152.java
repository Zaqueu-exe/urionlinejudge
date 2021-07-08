package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_2152 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00");
        int i = scan.nextInt();
        while(i > 0){
            i--;
            int h = scan.nextInt();
            int m = scan.nextInt();
            int o = scan.nextInt();
            String ocorencia;
            if(o == 0){
                ocorencia = "A porta fechou";
            }else{
                ocorencia = "A porta abriu";
            }
            System.out.println(df.format(h) + ":" + df.format(m) + " - " + ocorencia);
        }
    }
}
