package iniciante;

import java.util.Scanner;

public class Uri_1959 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long l = scan.nextLong();
        if((n < 3 || n > 1000000) || (l < 1 || l > 4000)){
            System.exit(0);
        }
        System.out.println(l*n);
    }
}
