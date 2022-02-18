package iniciante;

import java.util.Scanner;

public class Uri_2802 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
            System.out.println(String.format("%.0f", (Math.pow(n, 4.0) - (6.0 * Math.pow(n, 3.0)) + (23.0 * Math.pow(n, 2.0)) - (18.0 * n) + 24.0 ) / 24.0));
    }
}
