package iniciante;

import java.util.Scanner;

public class Uri_2164 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.printf("%.1f\n", (Math.pow(((1 + Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n)) / Math.sqrt(5));
    }
}
