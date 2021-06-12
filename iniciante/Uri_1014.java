package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1014 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        float a = scan.nextFloat();
        float b = scan.nextFloat();
        System.out.println(df.format(a/b)+" km/l");
    }
}
