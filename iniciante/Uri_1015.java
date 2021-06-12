package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
        float x1 = scan.nextFloat();
        float y1 = scan.nextFloat();
        float x2 = scan.nextFloat();
        float y2 = scan.nextFloat();
        System.out.println(df.format(Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)))));
    }
}
