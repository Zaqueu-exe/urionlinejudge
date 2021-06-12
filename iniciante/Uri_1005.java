package iniciante;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri_1005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextFloat();
        double b = scan.nextFloat();
        DecimalFormat round = new DecimalFormat("0.00000");
        System.out.println("MEDIA = "+ round.format(((a*3.5)+(b*7.5))/11));
    }
}
