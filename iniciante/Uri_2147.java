package iniciante;

import java.util.Scanner;

public class Uri_2147 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        for(int o = 0; o < i; o++){
            String t = scan.next();
            System.out.printf("%.2f\n",(0.01*t.length()));
        }
    }
}
