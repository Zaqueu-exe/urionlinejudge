package iniciante;

import java.util.Scanner;

public class Uri_2159 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double CONSTANTE = 1.25506;
        int n = scan.nextInt();
        System.out.printf("%.1f ",n/ Math.log(n));
        System.out.printf("%.1f\n",(CONSTANTE * n)/ Math.log(n));
    }
}
