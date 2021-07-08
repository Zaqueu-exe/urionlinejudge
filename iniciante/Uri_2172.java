package iniciante;

import java.util.Scanner;

public class Uri_2172 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long x = scan.nextLong();
        while(n != 0 & x != 0){
            System.out.println(x*n);
            n = scan.nextInt();
            x = scan.nextLong();
        }
    }
}
