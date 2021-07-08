package iniciante;

import java.util.Scanner;

public class Uri_2235 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if((a == b) || (a == c) || (b == c) || (a == (b+c)) || (a == (b-c)) || (a == (c-b))
        || (b == (a+c)) || (b == (a-c)) || (b == (c-a)) || (c == (a+b))|| (c == (a-b))|| (c == (b-a))){
            System.out.println("S");
        }else{
            System.out.println("N");
        }
    }
}
