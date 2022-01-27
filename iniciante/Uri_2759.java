package iniciante;

import java.util.Scanner;

public class Uri_2759 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = scan.next();
        System.out.println("A = " + a + ", B = " + b + ", C = " + c);
        System.out.println("A = " + b + ", B = " + c + ", C = " + a);
        System.out.println("A = " + c + ", B = " + a + ", C = " + b);
    }
}
